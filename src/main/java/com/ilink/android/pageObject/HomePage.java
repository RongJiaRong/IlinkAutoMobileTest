package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//消息首页页面元素_对象库类
public class HomePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(HomePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   HomePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 侧栏头像信息
* @return
* @throws IOException
*/
public  ElementBeans userinfo() throws IOException
 {
   if(locatorMap.containsKey("userinfo")||locatorMap.containsKey("ios_userinfo")){
   ElementBeans elementBeans=locatorMap.get("userinfo");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_userinfo");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【userinfo】元素信息"); return null;}
 }

/***
* 工作状态
* @return
* @throws IOException
*/
public  ElementBeans work_state() throws IOException
 {
   if(locatorMap.containsKey("work_state")||locatorMap.containsKey("ios_work_state")){
   ElementBeans elementBeans=locatorMap.get("work_state");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_work_state");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【work_state】元素信息"); return null;}
 }

/***
* 我的名片
* @return
* @throws IOException
*/
public  ElementBeans business_card_tab() throws IOException
 {
   if(locatorMap.containsKey("business_card_tab")||locatorMap.containsKey("ios_business_card_tab")){
   ElementBeans elementBeans=locatorMap.get("business_card_tab");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_business_card_tab");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【business_card_tab】元素信息"); return null;}
 }

/***
* 红包
* @return
* @throws IOException
*/
public  ElementBeans red_pocket_tab() throws IOException
 {
   if(locatorMap.containsKey("red_pocket_tab")||locatorMap.containsKey("ios_red_pocket_tab")){
   ElementBeans elementBeans=locatorMap.get("red_pocket_tab");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_red_pocket_tab");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【red_pocket_tab】元素信息"); return null;}
 }

/***
* ilink护航榜
* @return
* @throws IOException
*/
public  ElementBeans escort_list_tab() throws IOException
 {
   if(locatorMap.containsKey("escort_list_tab")||locatorMap.containsKey("ios_escort_list_tab")){
   ElementBeans elementBeans=locatorMap.get("escort_list_tab");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_escort_list_tab");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【escort_list_tab】元素信息"); return null;}
 }

/***
* 账号与设置
* @return
* @throws IOException
*/
public  ElementBeans settings_tab() throws IOException
 {
   if(locatorMap.containsKey("settings_tab")||locatorMap.containsKey("ios_settings_tab")){
   ElementBeans elementBeans=locatorMap.get("settings_tab");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_settings_tab");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【settings_tab】元素信息"); return null;}
 }

/***
* 帮助中心
* @return
* @throws IOException
*/
public  ElementBeans help_center_tab() throws IOException
 {
   if(locatorMap.containsKey("help_center_tab")||locatorMap.containsKey("ios_help_center_tab")){
   ElementBeans elementBeans=locatorMap.get("help_center_tab");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_help_center_tab");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【help_center_tab】元素信息"); return null;}
 }

/***
* 进入音视频首页
* @return
* @throws IOException
*/
public  ElementBeans start_meeting() throws IOException
 {
   if(locatorMap.containsKey("start_meeting")||locatorMap.containsKey("ios_start_meeting")){
   ElementBeans elementBeans=locatorMap.get("start_meeting");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_start_meeting");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【start_meeting】元素信息"); return null;}
 }

/***
* 首页加号
* @return
* @throws IOException
*/
public  ElementBeans add_tab() throws IOException
 {
   if(locatorMap.containsKey("add_tab")||locatorMap.containsKey("ios_add_tab")){
   ElementBeans elementBeans=locatorMap.get("add_tab");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_add_tab");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【add_tab】元素信息"); return null;}
 }

/***
* 音视频横幅
* @return
* @throws IOException
*/
public  ElementBeans voice_meeting_quick_entrance() throws IOException
 {
   if(locatorMap.containsKey("voice_meeting_quick_entrance")||locatorMap.containsKey("ios_voice_meeting_quick_entrance")){
   ElementBeans elementBeans=locatorMap.get("voice_meeting_quick_entrance");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_voice_meeting_quick_entrance");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【voice_meeting_quick_entrance】元素信息"); return null;}
 }

/***
* 直播横幅
* @return
* @throws IOException
*/
public  ElementBeans live_quick_entrance() throws IOException
 {
   if(locatorMap.containsKey("live_quick_entrance")||locatorMap.containsKey("ios_live_quick_entrance")){
   ElementBeans elementBeans=locatorMap.get("live_quick_entrance");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_live_quick_entrance");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【live_quick_entrance】元素信息"); return null;}
 }

/***
* 创建群聊
* @return
* @throws IOException
*/
public  ElementBeans create_groups_chat() throws IOException
 {
   if(locatorMap.containsKey("create_groups_chat")||locatorMap.containsKey("ios_create_groups_chat")){
   ElementBeans elementBeans=locatorMap.get("create_groups_chat");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_create_groups_chat");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【create_groups_chat】元素信息"); return null;}
 }

/***
* 扫一扫
* @return
* @throws IOException
*/
public  ElementBeans scanning() throws IOException
 {
   if(locatorMap.containsKey("scanning")||locatorMap.containsKey("ios_scanning")){
   ElementBeans elementBeans=locatorMap.get("scanning");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_scanning");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【scanning】元素信息"); return null;}
 }

/***
* 搜索
* @return
* @throws IOException
*/
public  ElementBeans searching() throws IOException
 {
   if(locatorMap.containsKey("searching")||locatorMap.containsKey("ios_searching")){
   ElementBeans elementBeans=locatorMap.get("searching");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_searching");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【searching】元素信息"); return null;}
 }

/***
* 待办中心（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans to_do_center() throws IOException
 {
   if(locatorMap.containsKey("to_do_center")||locatorMap.containsKey("ios_to_do_center")){
   ElementBeans elementBeans=locatorMap.get("to_do_center");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_to_do_center");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【to_do_center】元素信息"); return null;}
 }

/***
* 日程首页（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans schedule() throws IOException
 {
   if(locatorMap.containsKey("schedule")||locatorMap.containsKey("ios_schedule")){
   ElementBeans elementBeans=locatorMap.get("schedule");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule】元素信息"); return null;}
 }

/***
* 消息tab
* @return
* @throws IOException
*/
public  ElementBeans message_page() throws IOException
 {
   if(locatorMap.containsKey("message_page")||locatorMap.containsKey("ios_message_page")){
   ElementBeans elementBeans=locatorMap.get("message_page");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_message_page");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【message_page】元素信息"); return null;}
 }

/***
* 日程tab
* @return
* @throws IOException
*/
public  ElementBeans schedule_page() throws IOException
 {
   if(locatorMap.containsKey("schedule_page")||locatorMap.containsKey("ios_schedule_page")){
   ElementBeans elementBeans=locatorMap.get("schedule_page");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_page");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_page】元素信息"); return null;}
 }

/***
* 工作台tab
* @return
* @throws IOException
*/
public  ElementBeans workspace_page() throws IOException
 {
   if(locatorMap.containsKey("workspace_page")||locatorMap.containsKey("ios_workspace_page")){
   ElementBeans elementBeans=locatorMap.get("workspace_page");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workspace_page");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workspace_page】元素信息"); return null;}
 }

/***
* 通讯录tab
* @return
* @throws IOException
*/
public  ElementBeans address_book_page() throws IOException
 {
   if(locatorMap.containsKey("address_book_page")||locatorMap.containsKey("ios_address_book_page")){
   ElementBeans elementBeans=locatorMap.get("address_book_page");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_address_book_page");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【address_book_page】元素信息"); return null;}
 }

/***
* 信息列表
* @return
* @throws IOException
*/
public  ElementBeans message_list() throws IOException
 {
   if(locatorMap.containsKey("message_list")||locatorMap.containsKey("ios_message_list")){
   ElementBeans elementBeans=locatorMap.get("message_list");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_message_list");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【message_list】元素信息"); return null;}
 }
}