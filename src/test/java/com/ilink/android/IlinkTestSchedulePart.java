package com.ilink.android;

import com.crazy.auto.test.IlinkTestForAndroidBase;
import org.testng.annotations.Test;

import java.io.IOException;

public class IlinkTestSchedulePart extends IlinkTestForAndroidBase {

    @Test (description = "1。在登陆页通过账号密码正常登陆",dataProvider = "loginHappyFlow",priority = 0)
    public void test001_loginHappyFlow(String username,String pwd) throws Exception {
        loginActions.login(username,pwd);
        assertion.assertContainsText(proUtil.getKey("after_login_assert"),5);
    }

    @Test(description="2。在日程首页正常创建日程",dataProvider = "scheduleCreateDataNormal",dependsOnMethods = "test001_login_normal")
    public void test001_createSchedule(String scheduleName,String searchText,String address) throws IOException {
        scheduleActions.scheduleCreate(scheduleName,searchText,address);
        assertion.assertContainsText(proUtil.getKey("after_schedule_create"),5);
    }
}
