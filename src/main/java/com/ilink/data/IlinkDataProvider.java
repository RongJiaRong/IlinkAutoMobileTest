package com.ilink.data;

import org.testng.annotations.DataProvider;

public  class IlinkDataProvider {


    @DataProvider(name = "loginHappyFlow")
    public static Object[][] loginHappyFlow(){
        return new Object[][]{
                // 正常使用测试账号登陆
                {"18888888816","123456"}
        };
    }


    @DataProvider(name = "loginException")
    public static Object[][] loginException(){
        return new Object[][]{
                {"18888888816","123456"},
                {"13632298287","123456"}
        };
    }


    @DataProvider(name = "scheduleCreateDataNormal")
    public static Object[][] scheduleCreateDataNormal(){
        return new Object[][]{
                // 正常使用测试账号登陆
                {"自动化创建日程测试","测试账号17","广州"}
        };
    }
}
