package com.example.bill.service;

import com.example.bill.dataobject.PlanList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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

    Page<PlanList> findByPageable(Pageable pageable);

    PlanList save(PlanList billList);

    PlanList update(PlanList billList);

    void delete(Integer id);
}
