package com.example.bill.util;

import com.example.bill.VO.ResultVO;
import com.example.bill.enums.ResultStatusEnum;

/**
 * @author glacier
 * @Title: ResultVOUtil
 * @Description: 封装返回参数
 * @date 2018/3/14 17:18
 */

public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultStatusEnum.SUCCESS.getCode());
        resultVO.setMsg(ResultStatusEnum.SUCCESS.getMessage());
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO =new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
