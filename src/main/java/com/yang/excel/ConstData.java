package com.yang.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConstData {
    private Properties pro=null;
    private float lastSum;

    public void init() throws IOException {
        pro = new Properties();
        FileInputStream in = new FileInputStream("const.properties");
        pro.load(in);
        //lastSum=Float.parseFloat(pro.getProperty("lastSum"));
        in.close();
    }

    public void setProperty(String key,String value){
        pro.setProperty(key,value);
    }

    public String getProperty(String key){
        return pro.getProperty(key);
    }

    public void store() throws IOException {
        FileOutputStream oFile = new FileOutputStream("const.properties",false);
        pro.store(oFile, "Comment");
        oFile.close();
    }
}
