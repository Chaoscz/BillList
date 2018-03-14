package com.example.bill.dataobject;

import com.example.bill.enums.BillStatusEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author glacier
 * @Title: BillList
 * @Description: bill
 * @date 2018/3/14 14:12
 */

@Entity
@Data
public class BillList {

    @Id
    @GeneratedValue
    private Integer id;

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

    public BillList() {
    }

    public BillList(Integer userId, BigDecimal billMoney, Integer billType, Integer consumptionType, String hasWho, String remark) {
        this.userId = userId;
        this.billMoney = billMoney;
        this.billType = billType;
        this.consumptionType = consumptionType;
        this.hasWho = hasWho;
        this.remark = remark;
    }
}
