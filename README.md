## JWT登录验证  
### 1.
通过发送用户手机和密码的post登陆请求，调用登陆服务接口
![成功启动取到token](https://github.com/ZhuangWD/springboot/blob/master/img/登录.png)
### 2.
通过账号信息抽取出userId、psw等信息加密组成一个payload，与加密后的header以及密钥secret组装成一个JWT，服务端会根据这个secret密钥进行生成token和验证。
![成功启动取到token](https://github.com/ZhuangWD/springboot/blob/master/img/getToken.png)
### 3.
登录成功，获取到token
![成功启动取到token](https://github.com/ZhuangWD/springboot/blob/master/img/tokenImg.png)

### 4.
http请求传到后台，AuthenticationInterceptor会检查是否有passtoken注释，有则跳过认证； 如果没有跳过认证注释，会验证是否有token，根据token解析出user，再从token中根据secret密钥，看和之前生成token是否一致。
![成功启动取到token](https://github.com/ZhuangWD/springboot/blob/master/img/preHandle1.png)
![成功启动取到token](https://github.com/ZhuangWD/springboot/blob/master/img/preHandle2.png)
