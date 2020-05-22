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
public class Institution {
    @ExcelProperty(index = 0,value = "机构")
    private String name;
    @ExcelProperty(index = 1,value = "部门")
    private List<Department> departments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }


}
