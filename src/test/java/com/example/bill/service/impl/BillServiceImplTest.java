package com.example.bill.service.impl;

import com.example.bill.dataobject.BillList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

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
        BillList billList = billService.getOne(1);
        Assert.assertNotNull(billList);
    }

    @Test
    public void findAll() throws Exception {
        List<BillList> billListList = billService.findAll();
        Assert.assertNotEquals(0,billListList.size());
    }

    @Test
    public void findByLimit() throws Exception {
      /*  List<BillList> billListList = billService.findByLimit();
        Assert.assertNotEquals(0,billListList.size());*/
    }

    @Test
    public void save() throws Exception {
        BillList billList = new BillList(2,new BigDecimal(3.2),1,1,"常州","测试");
        BillList result = billService.save(billList);
        Assert.assertNotNull(result);
    }

}