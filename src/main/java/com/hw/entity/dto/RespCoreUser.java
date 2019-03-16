package com.hw.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespCoreUser {

    /*
    用户表主键
    */
    private Integer id ;
    /*
    创建人，0为初始化
    */
    private Integer creator ;
    /*
    用户状态，1启用，0禁用
    */
    private Integer flag ;
    /*
    租户id，0为系统用户
    */
    private Integer tenantid ;
    /*
    更新者id
    */
    private Integer updateuser ;
    /*
    用户邮箱
    */
    private String email ;
    /*
    用户名
    */
    private String name ;

    /*
    用户账户
    */
    private String account ;

    /*
    用户电话
    */
    private String phone ;
    /*
    创建时间
    */
    private Date createtime ;
    /*
    最后登录时间
    */
    private Date logintime ;
    /*
    更新时间
    */
    private Date updatetime ;
    /*
    vo字段设置角色
    */
    private String role;

    /*
    vo字段设置角色
    */
    private Integer inviteId;
    /*
    vo字段设置角色
    */
    private Integer inviteName;
    /*
    vo字段设置角色
    */
    private Integer inviteAccount;
    /*
    vo字段设置角色
    */
    private String levelName;
    /*
    vo字段设置角色
    */
    private Double levelRate;
    /*
    vo字段设置角色
    */
    private Integer invitedNum;

    private String token;
    /*
    金额
    */
    private Double totlAmount;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public Integer getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(Integer updateuser) {
        this.updateuser = updateuser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getTotlAmount() {
        return totlAmount;
    }

    public void setTotlAmount(Double totlAmount) {
        this.totlAmount = totlAmount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getInviteId() {
        return inviteId;
    }

    public void setInviteId(Integer inviteId) {
        this.inviteId = inviteId;
    }

    public Integer getInviteName() {
        return inviteName;
    }

    public void setInviteName(Integer inviteName) {
        this.inviteName = inviteName;
    }

    public Integer getInviteAccount() {
        return inviteAccount;
    }

    public void setInviteAccount(Integer inviteAccount) {
        this.inviteAccount = inviteAccount;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Double getLevelRate() {
        return levelRate;
    }

    public void setLevelRate(Double levelRate) {
        this.levelRate = levelRate;
    }

    public Integer getInvitedNum() {
        return invitedNum;
    }

    public void setInvitedNum(Integer invitedNum) {
        this.invitedNum = invitedNum;
    }
}
