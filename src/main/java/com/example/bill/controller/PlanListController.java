package com.example.bill.controller;

import com.example.bill.VO.ResultVO;
import com.example.bill.dataobject.PlanList;
import com.example.bill.service.PlanService;
import com.example.bill.util.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.data.querydsl.QSort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/v1/plan")
public class PlanListController {

    @Autowired
    private PlanService planService;

    @GetMapping("/query")
    public ResultVO queryPlanList(Integer page,Integer rows){
        page = page==null?1:page;
        rows = rows==null?10:rows;
        page = page -1;
        Pageable p = new PageRequest(page,rows);
        return ResultVOUtil.success(planService.findByPageable(p));
    }

    @PostMapping("/save")
    public ResultVO save(PlanList planList){
        return ResultVOUtil.success(planService.save(planList));
    }

    @PostMapping("/update")
    public ResultVO update(PlanList planList){
        return ResultVOUtil.success(planService.update(planList));
    }

    @PostMapping("/delete")
    public ResultVO delete(Integer id){
        planService.delete(id);
        return ResultVOUtil.success();
    }
}
