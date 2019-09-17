package com.example.businessdemo.service.impl;

import com.example.businessdemo.entity.User;
import com.example.businessdemo.mapper.UserMapper;
import com.example.businessdemo.response.exception.BusinessException;
import com.example.businessdemo.service.UserService;
import com.example.businessdemo.util.AssertUtil;
import com.example.businessdemo.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service(value="userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    public int delete(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    public int updateUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public int upload(MultipartFile file, String code) {
        if(!ExcelUtil.existSheet(file,code)){
            throw new BusinessException("模板错误，请重新下载");
        }
        String originalFilename = file.getOriginalFilename();
        AssertUtil.isNull(originalFilename,"上传文件不能为空");
        //校验Excel数据
        List<List<String[]>> realDataAll;
        return 0;
    }
}
