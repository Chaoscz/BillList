package com.example.bill.service.impl;

import com.example.bill.dataobject.BillList;
import com.example.bill.repository.BillListRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author glacier
 * @Title: BillServiceImplTest
 * @Description: BillServiceImplTest
 * @date 2018/3/14 15:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BillServiceImplTest {
    @Autowired
    private BillServiceImpl billService;

    @Test
    public void getOne() throws Exception {

    }

    @Test
    public void findAll() throws Exception {
    }

    @Test
    public void save() throws Exception {
        BillList billList = new BillList(2,new BigDecimal(3.2),1,1,"常州","测试");
        BillList result = billService.save(billList);
        Assert.assertNotNull(result);

    }

}