package com.example.bill.service;

import com.example.bill.dataobject.PlanList;

import java.util.List;

/**
 * @author glacier
 * @Title: PlanService
 * @Description: PlanService
 * @date 2018/3/14 17:04
 */

public interface PlanService {

    PlanList getOne(Integer id);

    List<PlanList> findAll();

    PlanList save(PlanList billList);
}
