package com.example.bill.controller;

import com.example.bill.VO.ResultVO;
import com.example.bill.dataobject.BillList;
import com.example.bill.dto.BillListDTO;
import com.example.bill.enums.ResultStatusEnum;
import com.example.bill.service.impl.BillServiceImpl;
import com.example.bill.util.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResultVO queryBillList(@RequestParam(value = "limit") String limit,
                                  @RequestParam(value = "id") Integer id){

        limit = limit == null ? "10" : limit;
        id = id == null ? 0 : id;

        ResultVO result =  new  ResultVO();
        result.setCode(ResultStatusEnum.SUCCESS.getCode());
        result.setMsg(ResultStatusEnum.SUCCESS.getMessage());

        if (id == 0 ){
            List<BillList> billListList = billService.findAll();
            result.setData(billListList);
            return result;
        }else {
            BillList billList = billService.getOne(id);
            BillList resultList = new BillList();
            BeanUtils.copyProperties(billList,resultList);
            result.setData(resultList);
            return result;
        }
    }

    @RequestMapping(value="/save",method=RequestMethod.POST)
    public ResultVO saveBillList(@RequestBody BillListDTO billListDTO){
        System.out.println(billListDTO);
        return ResultVOUtil.success();
    }


}
