## JWT验证流程  
### 1.初次登录：  
用户初次登录，输入用户名密码
### 2.密码验证：  
服务器从数据库取出用户名和密码进行验证
### 3.生成JWT：
服务器端验证通过，根据从数据库返回的信息，以及预设规则，生成JWT  
![成功启动取到token](https://github.com/ZhuangWD/springboot/blob/master/img/生成JWT1.png)
### 4.返还JWT：
服务器的HTTP RESPONSE中将JWT返还
![成功启动取到token](https://github.com/ZhuangWD/springboot/blob/master/img/返回JWT.png)
### 4.带JWT的请求：  
以后客户端发起请求，HTTP REQUEST HEADER中的Authorizatio字段都要有值，为JWT
### 6.成功启动通过postman获取token
![成功启动取到token](https://github.com/ZhuangWD/springboot/blob/master/img/tokenImg.png)
