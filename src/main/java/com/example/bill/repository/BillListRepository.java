package com.example.bill.repository;

import com.example.bill.dataobject.BillList;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author glacier
 * @Title: BillListRepository
 * @Description: BillListRepository
 * @date 2018/3/14 15:13
 */

public interface BillListRepository extends JpaRepository<BillList,Integer> {

}
