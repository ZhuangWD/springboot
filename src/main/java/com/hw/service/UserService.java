package com.hw.service;

import com.hw.entity.dto.RespCoreUser;
import com.hw.mapper.CoreUserMapper;
import com.hw.entity.CoreUser;
import com.hw.vo.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jinbin
 * @date 2018-07-08 20:52
 */
@Service("UserService")
public class UserService {

    @Autowired
    private CoreUserMapper userMapper;

    public CoreUser findByUsername(CoreUser user){
        return userMapper.findByUsername(user.getName());
    }

    public CoreUser findByUserPhone(String phone){
        return userMapper.findByUserPhone(phone);
    }

    public CoreUser findUserById(String userId) {
        return userMapper.findUserById(userId);
    }

    public int register(CoreUser coreUser){
        return userMapper.register(coreUser);
    }

    public ResultMsg update(CoreUser coreUser) {
        userMapper.edit(coreUser);
        return new ResultMsg("编辑成功",true);
    }
    //获取单个用户信息
    public RespCoreUser getUser(String id){
        return userMapper.findRespUserById(id);
    }

}
