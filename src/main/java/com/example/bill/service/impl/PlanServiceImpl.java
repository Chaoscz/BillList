package com.example.bill.service.impl;

import com.example.bill.dataobject.PlanList;
import com.example.bill.repository.PlanRepository;
import com.example.bill.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<PlanList> findByPageable(Pageable pageable) {

      return  repository.findAll(pageable);

    }

    @Override
    public PlanList save(PlanList planList) {
        return repository.save(planList);
    }

    @Override
    public PlanList update(PlanList planList){

        return repository.save(planList);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
