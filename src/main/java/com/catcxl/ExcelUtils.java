package com.catcxl;

import com.alibaba.excel.EasyExcel;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class ExcelUtils {

    /**
     * Excel文件数据读取
     * @param clazz
     * @param inputStream
     * @param <T>
     * @return
     */
    public static <T> List<T> readExcel(Class<T> clazz, InputStream inputStream){

        MyReadListener<T>  myReadListener = new MyReadListener<T>();

        EasyExcel.read(inputStream,clazz,myReadListener).sheet().doRead();

        return myReadListener.getList();
    }

    /**
     * 数据写入Excel文件
     * @param clazz
     * @param data
     * @param outputStream
     */
    public static void writeExcel(Class clazz, List data,OutputStream outputStream){
        EasyExcel.write(outputStream,UserInfo.class).sheet().doWrite(data);
    }

}
