package com.example.bill.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author glacier
 * @Title: TestVO
 * @Description: TestVO
 * @date 2018/3/14 17:40
 */

@Data
public class TestVO {

    @JsonProperty("userId")
    private Integer UserId;

    @JsonProperty("userName")
    private String UserName;

    public TestVO() {
    }

    public TestVO(Integer userId, String userName) {
        UserId = userId;
        UserName = userName;
    }
}
