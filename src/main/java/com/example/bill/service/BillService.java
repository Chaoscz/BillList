package com.example.bill.service;

import com.example.bill.dataobject.BillList;

import java.util.List;

/**
 * @author glacier
 * @Title: BillService
 * @Description: BillService
 * @date 2018/3/1415:15
 */

public interface BillService {

    BillList getOne(Integer id);

    List<BillList> findAll();

    List<BillList> findByLimit();

    BillList save(BillList billList);

}
