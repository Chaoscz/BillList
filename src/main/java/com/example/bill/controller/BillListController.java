package com.example.bill.controller;

import com.example.bill.VO.ResultVO;

import com.example.bill.dataobject.BillList;
import com.example.bill.enums.ResultStatusEnum;
import com.example.bill.service.impl.BillServiceImpl;
import com.example.bill.util.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author glacier
 * @Title: ${file_name}
 * @Description: ${todo}
 * @date 2018/3/15 11:24
 */
@RestController
@RequestMapping("/v1/bill")
public class BillListController {

    @Autowired
    private BillServiceImpl billService;

    @GetMapping("/query")
    public ResultVO queryBillList(Integer page,Integer rows,Integer id){

        page = page==null?1:page;
        rows = rows==null?10:rows;
        id = id == null ?0:id;
        page = page -1;
        Pageable p = new PageRequest(page,rows);

        ResultVO result =  new  ResultVO();
        result.setCode(ResultStatusEnum.SUCCESS.getCode());
        result.setMsg(ResultStatusEnum.SUCCESS.getMessage());

        if (id == 0 ){
            return ResultVOUtil.success(billService.findByLimit(p));
        }else {
            BillList billList = billService.getOne(id);
            BillList resultList = new BillList();
            BeanUtils.copyProperties(billList,resultList);
            result.setData(resultList);
            return result;
        }
    }

    @RequestMapping(value="/save",method=RequestMethod.POST)
    public ResultVO saveBillList(BillList billList){
        BillList  resultBillList =  billService.save(billList);
        return ResultVOUtil.success(resultBillList);
    }
    @PostMapping("/update")
    public ResultVO updateBillList(BillList billList){

        BillList  resultBillList =  billService.update(billList);
        return ResultVOUtil.success(resultBillList);
    }
    @PostMapping("/delete")
    public ResultVO deleteBillList(Integer id){
        billService.delete(id);
        return ResultVOUtil.success();
    }


}
