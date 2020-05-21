package com.catcxl;


import com.alibaba.excel.annotation.ExcelProperty;

public class UserInfo {
    //@ExcelProperty(value = "机构名称")
    @ExcelProperty(index = 0,value = "机构名称")
    private String institutionName;
    //@ExcelProperty(value = "部门")
    @ExcelProperty(index = 1,value = "部门")
    private String departmentName;
    //@ExcelProperty(value = "姓名")
    @ExcelProperty(index = 2)
    private String employeeName;
    //@ExcelProperty(value = "涉密等级")
    @ExcelProperty(index =3)
    private String secretLevel;
    //@ExcelProperty(value = "角色")
    @ExcelProperty(index = 4)
    private String roleName;
    //@ExcelProperty(value = "状态")
    @ExcelProperty(index = 5)
    private String status;
    //@ExcelProperty(value = "")
    @ExcelProperty(index = 6)
    private String errorMsg;

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSecretLevel() {
        return secretLevel;
    }

    public void setSecretLevel(String secretLevel) {
        this.secretLevel = secretLevel;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "institutionName='" + institutionName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", secretLevel='" + secretLevel + '\'' +
                ", roleName='" + roleName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
