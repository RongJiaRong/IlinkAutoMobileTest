package com.ilink.android.actions;

import com.crazy.auto.driver.DriverBase;
import com.ilink.android.pageObject.LoginPage;

public class LoginActions extends PageBaseActions{

    public LoginActions(DriverBase driver) {

        super(driver);
    }

    public void login(String accountPhoneNum,String pwd) throws Exception {
        operate.click(loginPage.pwd_login());// 1. 在登陆页切换到账号密码登陆
        operate.sendKeys(loginPage.login_account_input(),accountPhoneNum); //2. 输入账号
        operate.sendKeys(loginPage.login_pwd_input(),pwd); //3. 输入密码
        operate.click(loginPage.login_button()); //4. 点击登陆
        driver.sleep(8);  // 5. 等待8秒刷新数据

    }

}
