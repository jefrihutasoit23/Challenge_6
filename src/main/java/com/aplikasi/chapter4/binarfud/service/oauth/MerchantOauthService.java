package com.aplikasi.chapter4.binarfud.service.oauth;


import com.aplikasi.chapter4.binarfud.request.LoginModel;
import com.aplikasi.chapter4.binarfud.request.RegisterMerchantModel;

import java.util.Map;

public interface MerchantOauthService {
    Map registerManual(RegisterMerchantModel objModel) ;

    Map registerByGoogle(RegisterMerchantModel objModel) ;

    public Map login(LoginModel objLogin);
}




