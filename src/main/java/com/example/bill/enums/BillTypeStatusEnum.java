package com.example.bill.enums;

import lombok.Getter;

/**
 * @author glacier
 * @Title: BillTypeStatusEnum
 * @Description: BillTypeStatusEnum
 * @date 2018/3/1414:30
 */
@Getter
public enum BillTypeStatusEnum {

    eat(1,"吃"),
    wear(2,"穿"),
    rent(3,"房租"),
    Call_charges(4,"话费"),
    Humanity(5,"人情"),
    other(6,"其他")
    ;

    private Integer code;
    private String msg;

    BillTypeStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
