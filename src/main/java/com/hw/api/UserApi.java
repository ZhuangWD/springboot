package com.hw.api;

import com.auth0.jwt.JWT;
import com.hw.entity.CoreUser;
import com.hw.service.TokenService;
import com.hw.service.UserService;
import com.hw.annotation.UserLoginToken;
import com.hw.util.MD5Util;
import com.hw.vo.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jinbin
 * @date 2018-07-08 20:45
 */
@RestController
@RequestMapping("api")
@CrossOrigin
public class UserApi {
    @Autowired
    UserService userService;
    @Autowired
    TokenService tokenService;

    //登录
    @PostMapping("/login")
    public ResultMsg login(@RequestBody CoreUser user){
        CoreUser userForBase=userService.findByUserPhone(user.getPhone());
        if(userForBase==null){
            return new ResultMsg("登录失败,用户不存在",false);
        }else {
            if (!userForBase.getPsw().equals(MD5Util.MD5(user.getPsw()))){
                return new ResultMsg("登录失败,密码错误",false);
            }else {
                String token = tokenService.getToken(userForBase);
                userForBase.setToken(token);
                return new ResultMsg(userForBase);
            }
        }
    }


    //注册
    @PostMapping("/register")
    public ResultMsg register(@RequestBody CoreUser user){
        CoreUser userForBase=userService.findByUserPhone(user.getPhone());
        if(userForBase !=null){
            return new ResultMsg("注册失败手机号已存在",false,1);
        }else {
            user.setPsw(MD5Util.MD5(user.getPsw()));
            user.setName(user.getPhone());
            user.setAccount(user.getPhone());
            userService.register(user);
            return new ResultMsg(user);
        }
    }

    @UserLoginToken
    @PostMapping("/getMessage")
    public String getMessage(){
        return "你已通过验证";
    }

    @UserLoginToken
    @PostMapping("/user/put")
    public ResultMsg updateState(HttpServletRequest httpServletRequest,CoreUser coreUser){
        String token = httpServletRequest.getHeader("token");// 从 http 请求头中取出 token
        String userId = JWT.decode(token).getAudience().get(0);
        coreUser.setId(Integer.valueOf(userId));
        return userService.update(coreUser);
    }

    //获取用户单条信息
    @UserLoginToken
    @PostMapping("/getUser/{id}")
    public ResultMsg  getUser(@PathVariable("id") String id){
        return  new ResultMsg(userService.getUser(id));
    }

}
