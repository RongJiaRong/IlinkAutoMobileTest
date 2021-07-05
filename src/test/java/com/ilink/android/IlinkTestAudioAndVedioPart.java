package com.ilink.android;

import com.crazy.auto.test.IlinkTestForAndroidBase;
import org.testng.annotations.Test;

import java.io.IOException;

public class IlinkTestAudioAndVedioPart extends IlinkTestForAndroidBase {

    @Test(description = "1。在登陆页通过账号密码正常登陆",dataProvider = "loginHappyFlow",priority = 0)
    public void test001_loginHappyFlow(String username,String pwd) throws Exception {
        loginActions.login(username,pwd);
        assertion.assertContainsText(proUtil.getKey("after_login_assert"),5);
    }

    @Test(description = "2。发起音频会议至会议启动页",dependsOnMethods = "test001_loginHappyFlow",priority = 1)
    public void test002_startAudioMeeting() throws IOException {
        audioAndVideoMeetingActions.startAudioMeeting(1); //发起音频会议：1； 发起视频会议：2 ； 取消：3
        assertion.assertContainsText(proUtil.getKey("after_audio_create"),5 );
    }

    @Test(description = "3。音频会议启动页发起音视频",dependsOnMethods = "test002_startAudioMeeting",priority = 1)
    public void test003_startAudioMeeting() throws IOException {
        audioAndVideoMeetingActions.meetingInit();
        assertion.assertContainsText(proUtil.getKey("after_audio_create"),5 );
    }

    @Test(description = "4. 音频会议中的按钮检验",dependsOnMethods = "test003_startAudioMeeting",priority = 1)
    public void test004_inAudioMeeting() throws IOException {
        audioAndVideoMeetingActions.inMeeting();
    }


}
