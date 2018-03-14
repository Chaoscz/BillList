package com.example.bill.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author glacier
 * @Title: ${file_name}
 * @Description: ${todo}
 * @date 2018/3/14 17:40
 */

@Data
public class TestVO {

    @JsonProperty("userId")
    private Integer UserId;

    @JsonProperty("userName")
    private String UserName;
}
