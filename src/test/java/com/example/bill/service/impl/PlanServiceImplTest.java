package com.example.bill.service.impl;

import com.example.bill.dataobject.PlanList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author glacier
 * @Title: ${file_name}
 * @Description: ${todo}
 * @date 2018/3/14 17:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PlanServiceImplTest {

    @Autowired
    private PlanServiceImpl planService;

    @Test
    public void getOne() throws Exception {
        PlanList planList = planService.getOne(3);
        Assert.assertNotNull(planList);
    }

    @Test
    public void findAll() throws Exception {
        List<PlanList> planListList = planService.findAll();
        Assert.assertNotEquals(0,planListList.size());
    }

    @Test
    public void save() throws Exception {
        PlanList planList = new PlanList(2,"测试计划2");
        PlanList result = planService.save(planList);
        Assert.assertNotNull(result);
    }

}