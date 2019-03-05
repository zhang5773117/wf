package com.zb.service;

import com.zb.pojo.QgUser;

public interface RpcQgUserTokenService {

    public String generateToken(String userAgentStr, QgUser qgUser);

    public void saveToken(QgUser user,String token);

}
