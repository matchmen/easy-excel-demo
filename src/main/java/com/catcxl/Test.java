package com.catcxl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Test {



    public static void main(String[] args) throws FileNotFoundException {

        String readPath = "C:\\Users\\liqm\\Desktop\\上传文件.xls";
        String writePath = "C:\\Users\\liqm\\Desktop\\write.xlsx";
        FileInputStream fileInputStream = new FileInputStream(new File(readPath));
        List<UserInfo> userInfos = ExcelUtils.readExcel(UserInfo.class, fileInputStream);
        userInfos.stream().forEach(userInfo -> {
            System.out.println(userInfo);
        });
        //writeExcel(writePath);
        /*UserInfo userInfo = new UserInfo();
        userInfo.setDepartmentName("国安");
        userInfo.setInstitutionName("部门1");
        userInfo.setEmployeeName("李四");
        userInfo.setSecretLevel("秘密");
        userInfo.setRoleName("拍拖员工");
        userInfo.setStatus("正常");

        try {
            OutputStream outputStream = new FileOutputStream(new File(writePath));
            ExcelUtils.writeExcel(UserInfo.class,Arrays.asList(userInfo),outputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        //readExcel(new FileInputStream(new File(readPath)));
    }

    private static void readExcel(InputStream inputStream) {

        MyReadListener<UserInfo> myReadListener = new MyReadListener<UserInfo>();
        EasyExcel.read(inputStream,UserInfo.class, myReadListener).sheet().doRead();
        myReadListener.getList().stream().forEach(userInfo -> {
            System.out.println(userInfo);
        });

    }

    private static void writeExcel(String pathPath) {

        UserInfo userInfo = new UserInfo();
        userInfo.setDepartmentName("国安");
        userInfo.setInstitutionName("部门1");
        userInfo.setEmployeeName("李四");
        userInfo.setSecretLevel("秘密");
        userInfo.setRoleName("拍拖员工");
        userInfo.setStatus("正常");

        try {
            OutputStream outputStream = new FileOutputStream(new File(pathPath));
            EasyExcel.write(outputStream,UserInfo.class).sheet().doWrite(Arrays.asList(userInfo));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }


}
