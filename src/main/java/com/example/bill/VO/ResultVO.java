package com.example.bill.VO;

import lombok.Data;

/**
 * @author glacier
 * @Title: ResultVO
 * @Description: http 请求返回的最外层
 * @date 2018/3/14 17:17
 */
@Data
public class ResultVO<T> {

    /*错误码*/
    private Integer code;

    /*提示信息*/
    private String msg;

    /*返回的具体内容*/
    private T data;
}
