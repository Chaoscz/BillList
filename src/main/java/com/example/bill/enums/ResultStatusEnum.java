package com.example.bill.enums;

import lombok.Getter;

/**
 * @author glacier
 * @Title: ResultStatusEnum
 * @Description: ResultStatusEnum
 * @date 2018/3/14 17:18
 */
@Getter
public enum ResultStatusEnum {

    SUCCESS(200,"成功访问"),
    NO_FIND(404,"网页不存在"),
    UNAVAILABLE(503,"服务不可用")
    ;

    private Integer code;
    private String message;

    ResultStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
