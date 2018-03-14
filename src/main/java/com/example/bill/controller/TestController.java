package com.example.bill.controller;

import com.example.bill.VO.ResultVO;
import com.example.bill.VO.TestVO;
import com.example.bill.util.ResultVOUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author glacier
 * @Title: TestController
 * @Description: 测试
 * @date 2018/3/14 17:37
 */
@RestController
@RequestMapping("/Test")
public class TestController {

    @GetMapping("/")
    public ResultVO test(){
        TestVO testVO = new TestVO();
        testVO.setUserId(1);
        testVO.setUserName("glacier");
        return ResultVOUtil.success(testVO);
    }

}
