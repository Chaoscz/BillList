package com.example.bill.dataobject;

import com.example.bill.enums.PlanTypeStatusEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author glacier
 * @Title: PlanList
 * @Description: PlanList
 * @date 2018/3/1414:13
 */

@Entity
@Data
public class PlanList {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;

    /*计划内容*/
    private String planContent;

    /*计划状态（默认未完成）*/
    private Integer planType = PlanTypeStatusEnum.UNDONE.getCode();

    public PlanList() {
    }

    public PlanList(Integer userId, String planContent, Integer planType) {
        this.userId = userId;
        this.planContent = planContent;
        this.planType = planType;
    }
}
