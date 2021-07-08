package com.ilink.android.actions;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;

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
            System.exit(0);
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
            System.exit(0);
        }
        //4 启动会议
        if(operate.isElementExist(meetingInitPage.meeting_init_start())){
            operate.click(meetingInitPage.meeting_init_start());
            driver.sleep(5);
            System.out.println("启动页启动会议成功");
        }else{
            System.out.println("开启会议按钮缺失");
            System.exit(0);
        }
    }

    // 发起会议后，检查会议中的各种操作
    public void inMeeting(String searchText,int num) throws IOException {
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
            System.exit(0);
        }
        // 2. 判断摄像头按钮状态
        if(operate.isElementExist(inMeetingPage.in_meeting_video())){
            System.out.println("摄像头按钮存在");
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
            System.exit(0);
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
                System.exit(0);
            }
        }else {
            System.out.println("上拉菜单按钮缺失");
            System.exit(0);
        }
        //6。 锁定音频或者视频会议
        if(operate.getText(inMeetingPage.in_meeting_tittle()).contains("语音会议")){
            if(operate.isElementExist(inMeetingPage.in_audio_meeting_lock())){
                operate.click(inMeetingPage.in_audio_meeting_lock());
                if(driver.isToast("会议室锁定了")){
                    System.out.println("会议室锁定了");
                }else{
                    System.out.println("会议室锁定解除了");
                }
                operate.click(inMeetingPage.in_audio_meeting_lock());
                System.out.println("语音会议锁定功能ok");
            }else{
                System.out.println("语音会议锁定功能缺失");
                System.exit(0);
            }
        }else {
            if (operate.isElementExist(inMeetingPage.in_video_meeting_lock())) {
                operate.click(inMeetingPage.in_video_meeting_lock());
                if (driver.isToast("会议室锁定了")) {
                    System.out.println("会议室锁定了");
                } else {
                    System.out.println("会议室锁定解除了");
                }
                operate.click(inMeetingPage.in_video_meeting_lock());
                System.out.println("视频会议所以功能ok");
            } else {
                System.out.println("语音会议锁定功能缺失");
                System.exit(0);
            }
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

        // 暂时结束会议，再重开
        operate.click(inMeetingPage.in_meeting_hang_up());
        if (operate.isElementExist(inMeetingPage.in_meeting__close())){
            operate.click((inMeetingPage.in_meeting__close()));
            driver.sleep(2);
            if(operate.getText(meetingEndPage.meeting_end_meeting_type()).equals("语音会议")||
                    operate.getText(meetingEndPage.meeting_end_meeting_type()).equals("视频会议")){
                operate.click(meetingEndPage.meeting_end_go_back());
                driver.sleep(2);
            }else{
                System.out.println("结束会议失败");
                System.exit(0);
            }
        }else{
            System.out.println("结束会议失败");
        }
        operate.click(meetingHomePage.meeting_go_back());
        driver.sleep(2);
//        operate.click(homePage.start_meeting());
//        driver.sleep(2);
        startAudioMeeting(num);
        operate.click(meetingInitPage.meeting_init_start());
        driver.sleep(2);

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
            System.exit(0);
        }
        //9.成员管理操作-复制入会口令
        if(operate.isElementExist(inMeetingPage.in_meeting_member_manage_share())){
            operate.click(inMeetingPage.in_meeting_member_manage_share());
            if(driver.isToast("复制成功")){
                System.out.println("复制功能OK");
            }
        }else{
            System.out.println("复制按钮缺失");
            System.exit(0);
        }


        //10 . 检查添加参与人按钮
        if(operate.isElementExist(inMeetingPage.in_meeting_member_manage_add())) {
            operate.click(inMeetingPage.in_meeting_member_manage_add());
            driver.sleep(2);
            if (operate.getText(selectParticipantPage.select_participant_title()).equals("选择联系人")) {
                operate.click(selectParticipantPage.select_participant_search());
                operate.sendKeys(selectParticipantPage.select_participant_search(), searchText);
                driver.sleep(3);
                if (driver.getPageSource().contains(searchText)){
                    operate.click(selectParticipantPage.select_participant_result());
                    driver.sleep(2);
                }else{
                    System.out.println("搜索到的联系人为空");
                }
                operate.click(selectParticipantPage.select_participant_submit());
                driver.sleep(2);
                //.未入会检查
                operate.swipe("left",500);
                if (driver.getPageSource().contains(searchText)){
                    System.out.println("添加成员成功");
                }else{
                    System.out.println("添加成员失败");
                }
                operate.swipe("right",500);
            } else {
                System.out.println("选择联系人页出错");
            }
        }else{
            System.out.println("添加联系人按钮不存在");
            System.exit(0);
        }
        // 11. 成员管理-已入会-全员静音
        if(operate.isElementExist(inMeetingPage.in_meeting_member_all_silence())){
            operate.click(inMeetingPage.in_meeting_member_all_silence());
            if(driver.isToast("已全员静音")){
                System.out.println("已全员静音");
            }else if(driver.isToast("已全员解除静音")){
                System.out.println("已全员解除静音");
            }else{
                System.out.println("全员静音提示不对");
            }
            operate.click(inMeetingPage.in_meeting_member_all_silence());
        }else{
            System.out.println("全员静音按钮不存在，执行终止");
        }
        // 12。 成员管理-未入会-全员重呼(暂时不跑)
//        operate.swipe("right",500);
//        if(operate.isElementExist(inMeetingPage.in_meeting_member_all_recall())){
//            operate.click(inMeetingPage.in_meeting_member_all_recall());
//        }
        // 13. 收回人员管理显示
        operate.click(inMeetingPage.in_meeting_member_manage_navigate());
        driver.sleep(2);
        //14.退出会议
        operate.click(inMeetingPage.in_meeting_hang_up());
        if(operate.isElementExist(inMeetingPage.in_meeting__exit())){
            operate.click(inMeetingPage.in_meeting__exit());
            driver.sleep(2);
        }else{
            System.out.println("退出会议按钮不存在");
            System.exit(0);
        }
        //15. 从结束页返回音视频会议首页,然后从音视频首页返回信息首页
        if(operate.getText(meetingEndPage.meeting_end_meeting_type()).equals("语音会议")||
                operate.getText(meetingEndPage.meeting_end_meeting_type()).equals("视频会议")){
            operate.click(meetingEndPage.meeting_end_go_back());
            driver.sleep(2);
            operate.click(meetingHomePage.meeting_go_back());
            driver.sleep(1);
        }else{
            System.out.println("退出会议失败");
            System.exit(0);
        }

    }

    // 退出会议后， 从信息首页快捷入口重新进去会议，然后结束会议
    public void inAndCloseMeeting() throws IOException{
        operate.click(homePage.message_page());
        if(operate.isElementExist(homePage.voice_meeting_quick_entrance())){
            operate.click(homePage.voice_meeting_quick_entrance());
            driver.sleep(5);
            operate.click(inMeetingPage.in_meeting_hang_up());
            if (operate.isElementExist(inMeetingPage.in_meeting__close())){
                operate.click((inMeetingPage.in_meeting__close()));
                driver.sleep(2);
                if(operate.getText(meetingEndPage.meeting_end_meeting_type()).equals("语音会议")||
                        operate.getText(meetingEndPage.meeting_end_meeting_type()).equals("视频会议")){
                            operate.click(meetingEndPage.meeting_end_go_back());
                            driver.sleep(2);
                }else{
                    System.out.println("结束会议失败");
                    System.exit(0);
                }
            }else{
                System.out.println("结束会议失败");
            }
        }else{
            System.out.println("音视频快捷入口不存在");
            System.exit(0);
        }
    }

}
