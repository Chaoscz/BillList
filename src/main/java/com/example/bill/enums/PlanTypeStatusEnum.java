package com.example.bill.enums;

import lombok.Getter;

/**
 * @author glacier
 * @Title: PlanTypeStatusEnum
 * @Description: PlanTypeStatusEnum
 * @date 2018/3/1414:43
 */
@Getter
public enum PlanTypeStatusEnum {

    UNDONE(0,"未完成"),
    PROCESSING(1,"进行中"),
    FINISH(2,"已完成")
    ;

    private Integer code;
    private String msg;

    PlanTypeStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
