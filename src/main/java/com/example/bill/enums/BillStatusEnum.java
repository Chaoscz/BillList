package com.example.bill.enums;

import lombok.Getter;

/**
 * @author glacier
 * @Title: BillStatusEnum
 * @Description: bill Enum
 * @date 2018/3/14 14:25
 */
@Getter
public enum BillStatusEnum {

    EXPENDITURE(1,"支出"),
    INCOME(2,"收入")
    ;

    private Integer code;
    private String msg;

    BillStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
