package com.ilink.android;

import com.crazy.auto.test.IlinkTestForAndroidBase;
import org.testng.annotations.Test;
import java.io.IOException;

public class IlinkTestAudioAndVedioPart extends IlinkTestForAndroidBase {

    @Test(description = "3-1-1。在登陆页通过账号密码正常登陆")
    public void test001_loginHappyFlow() throws Exception {
        loginActions.login(test001_loginHappyFlow_username,test001_loginHappyFlow_pwd);
        assertion.assertContainsText(proUtil.getKey("after_login_assert"),5);
    }

    @Test(description = "3-1-2。发起音频会议至会议启动页",dependsOnMethods = "test001_loginHappyFlow",priority = 1)
    public void test002_startAudioMeeting() throws IOException {
        audioAndVideoMeetingActions.startAudioMeeting(1); //发起音频会议：1； 发起视频会议：2 ； 取消：3
        assertion.assertContainsText(proUtil.getKey("after_audio_create"),5 );
    }

    @Test(description = "3-1-3。音频会议启动页发起音视频",dependsOnMethods = "test002_startAudioMeeting",priority = 1)
    public void test003_startAudioMeeting() throws IOException {
        audioAndVideoMeetingActions.meetingInit();
        assertion.assertContainsText(proUtil.getKey("after_audio_create"),5 );
    }

    @Test(description = "3-1-4-1. 音频会议中的按钮检验,直至退出会议到消息首页",dependsOnMethods = "test003_startAudioMeeting",priority = 1)
    public void test004_inAudioMeeting() throws IOException {
        audioAndVideoMeetingActions.inMeeting(test004_inAudioMeeting_searchText,1);
        assertion.assertContainsText(proUtil.getKey("leave_audio_meeting_to_homepage"),5 );
    }
    @Test(description = "3-1-5. 从首页进去音视频会议， 并结束会议，返回信息首页",dependsOnMethods = "test004_inAudioMeeting",priority = 1)
    public void test005_audioMeetingInAndClose() throws IOException {
        audioAndVideoMeetingActions.inAndCloseMeeting();
        assertion.assertContainsText(proUtil.getKey("close_audio_meeting"),5);
    }
}
