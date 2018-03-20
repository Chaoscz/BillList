package com.example.bill.service;

import com.example.bill.dataobject.BillList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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

    Page<BillList> findByLimit(Pageable pageable);

    BillList save(BillList billList);

    BillList update(BillList billList);

    void delete(Integer id);


}
