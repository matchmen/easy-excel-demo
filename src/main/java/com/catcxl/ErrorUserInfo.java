package com.catcxl;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * <h3>用户信息提示</h3>
 * <p>Excel导入用户时格式不符合规定的用户数据导出</p>
 *
 * @Author Liqm
 * @Date 2020-05-22
 */
public class ErrorUserInfo extends UserInfo{

    @ExcelProperty(index = 7,value = "错误提示")
    private String errorMsg;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
