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

    EAT(1,"吃"),
    WEAR(2,"穿"),
    RENT(3,"房租"),
    CALL_CHARGES(4,"话费"),
    HUMANITY(5,"人情"),
    OTHER(6,"其他")
    ;

    private Integer code;
    private String msg;

    BillTypeStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
