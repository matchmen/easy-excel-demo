package com.catcxl;

import com.alibaba.excel.annotation.ExcelProperty;

import java.util.List;

/**
 * <h3></h3>
 * <p></p>
 *
 * @Author Liqm
 * @Date 2020-05-22
 */
public class Department {
    @ExcelProperty(index = 2,value = "部门名称")
    private String name;
    @ExcelProperty(index = 4,value = "角色")
    private List<String> roleNames;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }
}
