package com.example.bill.repository;

import com.example.bill.dataobject.PlanList;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author glacier
 * @Title: PlanRepository
 * @Description: PlanRepository
 * @date 2018/3/14 17:05
 */
public interface PlanRepository extends JpaRepository<PlanList,Integer> {

}
