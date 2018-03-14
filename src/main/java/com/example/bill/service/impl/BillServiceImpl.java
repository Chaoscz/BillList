package com.example.bill.service.impl;

import com.example.bill.dataobject.BillList;
import com.example.bill.repository.BillListRepository;
import com.example.bill.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author glacier
 * @Title: BillServiceImpl
 * @Description: BillServiceImpl
 * @date 2018/3/14 15:18
 */

@Service
public class BillServiceImpl implements BillService{

    @Autowired
    private BillListRepository repository;

    @Override
    public BillList getOne(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public List<BillList> findAll() {
        return repository.findAll();
    }

    @Override
    public BillList save(BillList billList) {
        return repository.save(billList);
    }
}
