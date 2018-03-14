package com.example.bill.service.impl;

import com.example.bill.dataobject.PlanList;
import com.example.bill.repository.PlanRepository;
import com.example.bill.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author glacier
 * @Title: PlanServiceImpl
 * @Description: PlanServiceImpl
 * @date 2018/3/14 17:07
 */
@Service
public class PlanServiceImpl implements PlanService{

    @Autowired
    private PlanRepository repository;

    @Override
    public PlanList getOne(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public List<PlanList> findAll() {
        return repository.findAll();
    }

    @Override
    public PlanList save(PlanList planList) {
        return repository.save(planList);
    }
}
