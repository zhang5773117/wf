package com.zb.service;

import com.zb.pojo.QgUser;

public interface RpcQgUserService {
    public QgUser findQgUserLogin(String phone , String pwd)throws Exception;
}
