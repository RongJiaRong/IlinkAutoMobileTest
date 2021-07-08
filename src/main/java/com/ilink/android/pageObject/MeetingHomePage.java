package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//音视频首页_对象库类
public class MeetingHomePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(MeetingHomePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   MeetingHomePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 音视频首页标题
* @return
* @throws IOException
*/
public  ElementBeans meeting_tittle() throws IOException
 {
   if(locatorMap.containsKey("meeting_tittle")||locatorMap.containsKey("ios_meeting_tittle")){
   ElementBeans elementBeans=locatorMap.get("meeting_tittle");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_tittle");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_tittle】元素信息"); return null;}
 }

/***
* 音视频首页返回
* @return
* @throws IOException
*/
public  ElementBeans meeting_go_back() throws IOException
 {
   if(locatorMap.containsKey("meeting_go_back")||locatorMap.containsKey("ios_meeting_go_back")){
   ElementBeans elementBeans=locatorMap.get("meeting_go_back");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_go_back");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_go_back】元素信息"); return null;}
 }

/***
* 创建会议
* @return
* @throws IOException
*/
public  ElementBeans meeting_create() throws IOException
 {
   if(locatorMap.containsKey("meeting_create")||locatorMap.containsKey("ios_meeting_create")){
   ElementBeans elementBeans=locatorMap.get("meeting_create");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_create");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_create】元素信息"); return null;}
 }

/***
* 创建会议入口标题
* @return
* @throws IOException
*/
public  ElementBeans meeting_create_entrance_tittle() throws IOException
 {
   if(locatorMap.containsKey("meeting_create_entrance_tittle")||locatorMap.containsKey("ios_meeting_create_entrance_tittle")){
   ElementBeans elementBeans=locatorMap.get("meeting_create_entrance_tittle");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_create_entrance_tittle");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_create_entrance_tittle】元素信息"); return null;}
 }

/***
* 发起语音会议（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans meeting_create_voice() throws IOException
 {
   if(locatorMap.containsKey("meeting_create_voice")||locatorMap.containsKey("ios_meeting_create_voice")){
   ElementBeans elementBeans=locatorMap.get("meeting_create_voice");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_create_voice");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_create_voice】元素信息"); return null;}
 }

/***
* 发起视频会议（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans meeting_create_video() throws IOException
 {
   if(locatorMap.containsKey("meeting_create_video")||locatorMap.containsKey("ios_meeting_create_video")){
   ElementBeans elementBeans=locatorMap.get("meeting_create_video");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_create_video");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_create_video】元素信息"); return null;}
 }

/***
* 取消
* @return
* @throws IOException
*/
public  ElementBeans meeting_create_cancel() throws IOException
 {
   if(locatorMap.containsKey("meeting_create_cancel")||locatorMap.containsKey("ios_meeting_create_cancel")){
   ElementBeans elementBeans=locatorMap.get("meeting_create_cancel");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_create_cancel");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_create_cancel】元素信息"); return null;}
 }

/***
* 加入会议（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans meeting_join() throws IOException
 {
   if(locatorMap.containsKey("meeting_join")||locatorMap.containsKey("ios_meeting_join")){
   ElementBeans elementBeans=locatorMap.get("meeting_join");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_join");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_join】元素信息"); return null;}
 }

/***
* 预约会议（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans meeting_appointment() throws IOException
 {
   if(locatorMap.containsKey("meeting_appointment")||locatorMap.containsKey("ios_meeting_appointment")){
   ElementBeans elementBeans=locatorMap.get("meeting_appointment");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_appointment");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_appointment】元素信息"); return null;}
 }

/***
* 预约会议列表
* @return
* @throws IOException
*/
public  ElementBeans meeting_appointment_list() throws IOException
 {
   if(locatorMap.containsKey("meeting_appointment_list")||locatorMap.containsKey("ios_meeting_appointment_list")){
   ElementBeans elementBeans=locatorMap.get("meeting_appointment_list");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_appointment_list");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_appointment_list】元素信息"); return null;}
 }

/***
* 历史会议列表
* @return
* @throws IOException
*/
public  ElementBeans meeting_record_list() throws IOException
 {
   if(locatorMap.containsKey("meeting_record_list")||locatorMap.containsKey("ios_meeting_record_list")){
   ElementBeans elementBeans=locatorMap.get("meeting_record_list");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_record_list");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_record_list】元素信息"); return null;}
 }
}