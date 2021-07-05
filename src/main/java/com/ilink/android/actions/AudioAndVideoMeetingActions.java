package com.ilink.android.actions;

import com.crazy.auto.driver.DriverBase;
import java.io.IOException;

public class AudioAndVideoMeetingActions extends PageBaseActions{

    public AudioAndVideoMeetingActions(DriverBase driver) {
        super(driver);
    }

    //发起音频会议：1； 发起视频会议：2 ； 取消：3   至音视频会议启动页
    public void startAudioMeeting(int num) throws IOException {
        operate.click(homePage.message_page());
        operate.click(homePage.start_meeting());
        driver.sleep(3);
        if(operate.getText(meetingHomePage.meeting_tittle()).equals("会议")){
            operate.click(meetingHomePage.meeting_create());
            driver.sleep(1);
            switch (num){
                case 1 : // 1是发起音频会议
                    operate.click(meetingHomePage.meeting_create_voice());
                    break;
                case 2 : // 2是发起视频会议
                    operate.click(meetingHomePage.meeting_create_video());
                    break;
                case 3 : // 3是取消
                    operate.click(meetingHomePage.meeting_create_cancel());
                    break;
            }
            driver.sleep(3);
        }else{
            System.out.println("跳转音视频会议首页失败");
        }
    }

    //发起语音会议 或视频视频会议启动页检查，并发起语音或者视频会议
    public void meetingInit() throws IOException {
        // 1. 判断静音按钮状态
        if(operate.isElementExist(meetingInitPage.meeting_init_audio())){
            operate.click(meetingInitPage.meeting_init_audio());
            if(driver.isToast("已静音")){
                System.out.println("已静音");
            }else if(driver.isToast("已取消静音")){
                System.out.println("已取消静音");
            }
            operate.click(meetingInitPage.meeting_init_audio());
            driver.sleep(2);
            System.out.println("启动页静音功能ok");
        }else{
            System.out.println("静音按钮缺失");
        }
        // 2. 判断摄像头按钮状态
        if(operate.isElementExist(meetingInitPage.meeting_init_video())){
            operate.click(meetingInitPage.meeting_init_video());
            if(driver.isToast("已关闭摄像头")){
                System.out.println("已关闭摄像头");
            }else if(driver.isToast("已开启摄像头")){
                System.out.println("已开启摄像头");
            }
            operate.click(meetingInitPage.meeting_init_video());
            driver.sleep(2);
            System.out.println("启动页摄像头功能ok");
        }else{
            System.out.println("摄像头按钮缺失，开启的是语音会议");
        }
        // 3. 判断扬声器状态
        if(operate.isElementExist(meetingInitPage.meeting_init_volume())){
            operate.click(meetingInitPage.meeting_init_volume());
            if(driver.isToast("声音将通过听筒播放")){
                System.out.println("声音将通过听筒播放");
            }else if(driver.isToast("声音将通过扬声器播放")){
                System.out.println("声音将通过扬声器播放");
            }
            operate.click(meetingInitPage.meeting_init_volume());
            driver.sleep(2);
            System.out.println("启动页扬声器功能ok");
        }else{
            System.out.println("扬声器按钮缺失");
        }
        //4 启动会议
        if(operate.isElementExist(meetingInitPage.meeting_init_start())){
            operate.click(meetingInitPage.meeting_init_start());
            driver.sleep(5);
            System.out.println("启动页启动会议成功");
        }else{
            System.out.println("开启会议按钮缺失");
        }
    }

    // 发起会议后，检查会议中的各种操作
    public void inMeeting() throws IOException {
        // 1. 检查静音按钮开启与关闭
        if(operate.isElementExist(inMeetingPage.in_meeting_audio())){
            operate.click(inMeetingPage.in_meeting_audio());
            if(driver.isToast("已静音")){
                System.out.println("已静音");
            }else if(driver.isToast("已取消静音")){
                System.out.println("已取消静音");
            }
            operate.click(inMeetingPage.in_meeting_audio());
            driver.sleep(2);
            System.out.println("会议中静音功能ok");
        }else{
            System.out.println("静音按钮缺失");
        }
        // 2. 判断摄像头按钮状态
        if(operate.isElementExist(inMeetingPage.in_meeting_video())){
            operate.click(inMeetingPage.in_meeting_video());
            if(driver.isToast("已关闭摄像头")){
                System.out.println("已关闭摄像头");
            }else if(driver.isToast("已开启摄像头")){
                System.out.println("已开启摄像头");
            }
            operate.click(inMeetingPage.in_meeting_video());
            driver.sleep(2);
            System.out.println("启动页摄像头功能ok");
        }else{
            System.out.println("摄像头按钮缺失，开启的是语音会议");
        }
        //3. 检查扬声器功能开启与关闭
        if(operate.isElementExist(inMeetingPage.in_meeting_volume())){
            operate.click(inMeetingPage.in_meeting_volume());
            if(driver.isToast("声音将通过听筒播放")){
                System.out.println("声音将通过听筒播放");
            }else if(driver.isToast("声音将通过扬声器播放")){
                System.out.println("声音将通过扬声器播放");
            }
            operate.click(inMeetingPage.in_meeting_volume());
            driver.sleep(2);
            System.out.println("会议中扬声器功能ok");
        }else{
            System.out.println("扬声器按钮缺失");
        }
        //4。语音会议全员静音开启与关闭
        if(operate.isElementExist(inMeetingPage.in_meeting_member_all_silence_audio())){
            operate.click(inMeetingPage.in_meeting_member_all_silence_audio());
            if(driver.isToast("已全员静音！")){
                System.out.println("已全员静音！");
            }else if(driver.isToast("已全员解除静音！")){
                System.out.println("已全员解除静音！");
            }
            operate.click(inMeetingPage.in_meeting_audio());
            driver.sleep(2);
            System.out.println("语音会议中全员静音功能ok");
        }else{
            System.out.println("全员静音按钮缺失");
        }
        //5。 上拉菜单复制口令
        if(operate.isElementExist(inMeetingPage.in_meeting_expend())){
            operate.click(inMeetingPage.in_meeting_expend());
            driver.sleep(2);
            if(operate.isElementExist(inMeetingPage.in_meeting_id_copy())){
                operate.click(inMeetingPage.in_meeting_id_copy());
                if(driver.isToast("复制成功")){
                    System.out.println("复制功能OK");
                }
            }else{
                System.out.println("复制按钮缺失");
            }
        }else {
            System.out.println("上拉菜单按钮缺失");
        }
        //6。 锁定会议
        if(operate.isElementExist(inMeetingPage.in_meeting_lock())){
            operate.click(inMeetingPage.in_meeting_lock());
            if(driver.isToast("会议锁定了")){
                System.out.println("会议锁定了");
            }else{
                System.out.println("会议锁定解除了");
            }
            operate.click(inMeetingPage.in_meeting_lock());
            System.out.println("会议所以功能ok");
        }else{
            System.out.println("会议锁定功能缺失");
        }
        //7。 视频会议全员静音按钮检查并收回菜单
        if(operate.isElementExist(inMeetingPage.in_meeting_all_silence_video())){
            operate.click(inMeetingPage.in_meeting_all_silence_video());
            if(driver.isToast("已全员静音")){
                System.out.println("已全员静音");
            }else if(driver.isToast("已全员解除静音")){
                System.out.println("已全员解除静音");
            }
            operate.click(inMeetingPage.in_meeting_all_silence_video());
            operate.click(inMeetingPage.in_meeting_expend()); //收回菜单显示
            driver.sleep(2);
        }else{
            System.out.println("开启的是语音会议，不存在此按钮");
        }

        //8. 点击成员管理按钮
        if(operate.isElementExist(inMeetingPage.in_meeting_member())){
            operate.click(inMeetingPage.in_meeting_member());
            driver.sleep(1);
            if(operate.getText(inMeetingPage.in_meeting_member_manage_tittle()).equals("人员管理")){
                System.out.println("打开成员管理成功");
            }else{
                System.out.println("打开成员管理失败");
            }
        }else {
            System.out.println("成员管理功能缺失");
        }
        //9.成员管理操作-复制入会口令
    }
}
