package com.xiao.mb.commonmodule.core.generic;


import com.xiao.mb.commonmodule.core.common.ResultData;

/**
 * Created by 10238 on 2016/10/13.
 */
public class GenericController{




    public ResultData returnResult(boolean flag, ResultData... result) {
        ResultData re = null;
        if (result.length > 0) {
            re = result[0];
        } else {
            re = ResultData.build();
        }
        if (flag) {
            return re;
        } else {
            return re.failure();
        }
    }



}
