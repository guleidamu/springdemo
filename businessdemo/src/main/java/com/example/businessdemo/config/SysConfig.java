package com.example.businessdemo.config;

import com.example.businessdemo.util.DateUtil;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;

public class SysConfig {


//    private String p5url;   //p5地址
//    public boolean callPortalOnOff; //是否通知门户
//    private String portalUrl;   //门户地址

    @Value("${crme.encrypt.password}")
    public String encryptPassword; //加密参数
    @Value("${crme.encrypt.IV}")
    public String encryptIV;   //加密参数
    @Value("${crme.uploadPath}")
    public String uploadPath;  //文件上传目录
    @Value("${crme.downloadPath}")
    public String downloadPath;  //文件下载目录

    /**
     * 获取当日的上传文件路径
     */
    public String getSysDateUploadPath(){
        return uploadPath + File.separator + DateUtil.getDate("yyyyMMdd");    //添加日期目录
    }
    /**
     * 获取当日的下载文件路径
     */
    public String getSysDateDownloadPath(){
        return downloadPath + File.separator + DateUtil.getDate("yyyyMMdd");    //添加日期目录
    }

    /**
     * 获取用户上传文件路径
     */
    public String getUserUploadPath(){
//        User user = (User) ThreadLocalUtil.getUser();
//        return getSysDateUploadPath() + File.separator +
////                user.getGroupCode() + File.separator +
////                user.getUserCode();
        return getSysDateUploadPath() + File.separator +
                "@ccb.com"+ File.separator +
                "linzj"+ File.separator +"import";
    }
    /**
     * 获取用户下载文件路径
     */
    public String getUserDownloadPath(){
//        User user = (User) ThreadLocalUtil.getUser();
//        return getSysDateUploadPath() + File.separator +
////                user.getGroupCode() + File.separator +
////                user.getUserCode();
        return getSysDateDownloadPath() + File.separator +
                "@ccb.com"+ File.separator +
                "linzj"+ File.separator +"export";
    }

}
