package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//音视频会议中页面_对象库类
public class InMeetingPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(InMeetingPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   InMeetingPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 会议标题
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_tittle() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_tittle")||locatorMap.containsKey("ios_in_meeting_tittle")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_tittle");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_tittle");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_tittle】元素信息"); return null;}
 }

/***
* 静音按钮
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_audio() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_audio")||locatorMap.containsKey("ios_in_meeting_audio")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_audio");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_audio");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_audio】元素信息"); return null;}
 }

/***
* 摄像头按钮
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_video() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_video")||locatorMap.containsKey("ios_in_meeting_video")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_video");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_video");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_video】元素信息"); return null;}
 }

/***
* 扬声器按钮
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_volume() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_volume")||locatorMap.containsKey("ios_in_meeting_volume")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_volume");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_volume");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_volume】元素信息"); return null;}
 }

/***
* 上拉菜单
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_expend() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_expend")||locatorMap.containsKey("ios_in_meeting_expend")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_expend");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_expend");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_expend】元素信息"); return null;}
 }

/***
* 成员管理按钮
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_member() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_member")||locatorMap.containsKey("ios_in_meeting_member")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_member");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_member");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_member】元素信息"); return null;}
 }

/***
* 挂断按钮
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_hang_up() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_hang_up")||locatorMap.containsKey("ios_in_meeting_hang_up")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_hang_up");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_hang_up");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_hang_up】元素信息"); return null;}
 }

/***
* 口令复制
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_id_copy() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_id_copy")||locatorMap.containsKey("ios_in_meeting_id_copy")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_id_copy");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_id_copy");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_id_copy】元素信息"); return null;}
 }

/***
* 锁定视频会议
* @return
* @throws IOException
*/
public  ElementBeans in_video_meeting_lock() throws IOException
 {
   if(locatorMap.containsKey("in_video_meeting_lock")||locatorMap.containsKey("ios_in_video_meeting_lock")){
   ElementBeans elementBeans=locatorMap.get("in_video_meeting_lock");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_video_meeting_lock");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_video_meeting_lock】元素信息"); return null;}
 }

/***
* 锁定音频会议
* @return
* @throws IOException
*/
public  ElementBeans in_audio_meeting_lock() throws IOException
 {
   if(locatorMap.containsKey("in_audio_meeting_lock")||locatorMap.containsKey("ios_in_audio_meeting_lock")){
   ElementBeans elementBeans=locatorMap.get("in_audio_meeting_lock");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_audio_meeting_lock");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_audio_meeting_lock】元素信息"); return null;}
 }

/***
* 视频会议全员静音
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_all_silence_video() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_all_silence_video")||locatorMap.containsKey("ios_in_meeting_all_silence_video")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_all_silence_video");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_all_silence_video");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_all_silence_video】元素信息"); return null;}
 }

/***
* 退出会议
* @return
* @throws IOException
*/
public  ElementBeans in_meeting__exit() throws IOException
 {
   if(locatorMap.containsKey("in_meeting__exit")||locatorMap.containsKey("ios_in_meeting__exit")){
   ElementBeans elementBeans=locatorMap.get("in_meeting__exit");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting__exit");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting__exit】元素信息"); return null;}
 }

/***
* 结束会议
* @return
* @throws IOException
*/
public  ElementBeans in_meeting__close() throws IOException
 {
   if(locatorMap.containsKey("in_meeting__close")||locatorMap.containsKey("ios_in_meeting__close")){
   ElementBeans elementBeans=locatorMap.get("in_meeting__close");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting__close");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting__close】元素信息"); return null;}
 }

/***
* 取消
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_cancel() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_cancel")||locatorMap.containsKey("ios_in_meeting_cancel")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_cancel");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_cancel");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_cancel】元素信息"); return null;}
 }

/***
* 成员管理标题
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_member_manage_tittle() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_member_manage_tittle")||locatorMap.containsKey("ios_in_meeting_member_manage_tittle")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_member_manage_tittle");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_member_manage_tittle");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_member_manage_tittle】元素信息"); return null;}
 }

/***
* 成员管理返回
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_member_manage_navigate() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_member_manage_navigate")||locatorMap.containsKey("ios_in_meeting_member_manage_navigate")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_member_manage_navigate");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_member_manage_navigate");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_member_manage_navigate】元素信息"); return null;}
 }

/***
* 入会口令
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_member_manage_share() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_member_manage_share")||locatorMap.containsKey("ios_in_meeting_member_manage_share")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_member_manage_share");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_member_manage_share");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_member_manage_share】元素信息"); return null;}
 }

/***
* 添加参与人
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_member_manage_add() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_member_manage_add")||locatorMap.containsKey("ios_in_meeting_member_manage_add")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_member_manage_add");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_member_manage_add");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_member_manage_add】元素信息"); return null;}
 }

/***
* 已入会
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_in_meeting() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_in_meeting")||locatorMap.containsKey("ios_in_meeting_in_meeting")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_in_meeting");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_in_meeting");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_in_meeting】元素信息"); return null;}
 }

/***
* 未入会
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_off__meeting() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_off__meeting")||locatorMap.containsKey("ios_in_meeting_off__meeting")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_off__meeting");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_off__meeting");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_off__meeting】元素信息"); return null;}
 }

/***
* 全员重呼
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_member_all_recall() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_member_all_recall")||locatorMap.containsKey("ios_in_meeting_member_all_recall")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_member_all_recall");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_member_all_recall");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_member_all_recall】元素信息"); return null;}
 }

/***
* 全员静音
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_member_all_silence() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_member_all_silence")||locatorMap.containsKey("ios_in_meeting_member_all_silence")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_member_all_silence");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_member_all_silence");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_member_all_silence】元素信息"); return null;}
 }

/***
* 未入会列表
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_member_un_join_list() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_member_un_join_list")||locatorMap.containsKey("ios_in_meeting_member_un_join_list")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_member_un_join_list");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_member_un_join_list");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_member_un_join_list】元素信息"); return null;}
 }

/***
* 语音会议全员静音
* @return
* @throws IOException
*/
public  ElementBeans in_meeting_member_all_silence_audio() throws IOException
 {
   if(locatorMap.containsKey("in_meeting_member_all_silence_audio")||locatorMap.containsKey("ios_in_meeting_member_all_silence_audio")){
   ElementBeans elementBeans=locatorMap.get("in_meeting_member_all_silence_audio");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_in_meeting_member_all_silence_audio");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【in_meeting_member_all_silence_audio】元素信息"); return null;}
 }
}