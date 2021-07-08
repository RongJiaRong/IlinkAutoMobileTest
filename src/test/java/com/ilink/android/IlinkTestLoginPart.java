package com.ilink.android;

import com.crazy.auto.test.IlinkTestForAndroidBase;
import org.testng.annotations.Test;

public class IlinkTestLoginPart extends IlinkTestForAndroidBase {


    @Test (description = "1-1-1。在登陆页通过账号密码正常登陆")
    public void test001_loginHappyFlow() throws Exception {
        loginActions.login(test001_loginHappyFlow_username,test001_loginHappyFlow_pwd);
        assertion.assertContainsText(proUtil.getKey("after_login_assert"),5);
    }


//    @Test (description = "账号密码登陆错误场景",dataProvider = "loginDataException")
//    public void test002_login_exception() {
//
//    }
//
//
//    @Test (description = "退出账号")
//    public void test002_quit() {
//
//    }


}
