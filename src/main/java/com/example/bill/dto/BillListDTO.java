package com.example.bill.dto;

import com.example.bill.enums.BillStatusEnum;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author glacier
 * @Title: ${file_name}
 * @Description: ${todo}
 * @date 2018/3/20 10:24
 */

@Data
public class BillListDTO {

    /*用户id*/
    private Integer userId;

    /*金额*/
    private BigDecimal billMoney;

    /*账单类别（1. 支出 2. 收入） 默认支出*/
    private Integer billType = BillStatusEnum.EXPENDITURE.getCode();

    /*消费类别（1.吃 2.穿 3.住 4.话费5.人情 6.其他）*/
    private Integer consumptionType ;

    /*消费地点 默认为空*/
    private String consumptionSpace = "";

    /*人物 默认为空*/
    private String hasWho ="";

    /*备注*/
    private String remark;

}
