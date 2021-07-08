package com.ilink.android;

import com.crazy.auto.test.IlinkTestForAndroidBase;
import org.testng.annotations.Test;

import java.io.IOException;

public class IlinkTestSchedulePart extends IlinkTestForAndroidBase {

    @Test (description = "2-1-1。在登陆页通过账号密码正常登陆",priority = 0)
    public void test001_loginHappyFlow() throws Exception {
        loginActions.login(test001_loginHappyFlow_username,test001_loginHappyFlow_pwd);
        assertion.assertContainsText(proUtil.getKey("after_login_assert"),5);
    }

    @Test(description="2-1-2。在日程首页正常创建日程",dependsOnMethods = "test001_loginHappyFlow")
    public void test001_createSchedule() throws IOException {
        scheduleActions.scheduleCreate(test001_createSchedule_scheduleName,
                                        test001_createSchedule_searchText,
                                        test001_createSchedule_address);
        assertion.assertContainsText(proUtil.getKey("after_schedule_create"),5);
    }
}
