package com.aplikasi.chapter4.binarfud.service.oauth;


import com.aplikasi.chapter4.binarfud.request.LoginModel;
import com.aplikasi.chapter4.binarfud.request.RegisterUserModel;

import java.util.Map;

public interface UserService {
    Map registerManual(RegisterUserModel objModel) ;

    Map registerByGoogle(RegisterUserModel objModel) ;

    public Map login(LoginModel objLogin);
}




