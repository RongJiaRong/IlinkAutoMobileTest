package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//创建日程页面元素_对象库类
public class ScheduleCreatePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(ScheduleCreatePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   ScheduleCreatePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 完成
* @return
* @throws IOException
*/
public  ElementBeans schedule_confirm() throws IOException
 {
   if(locatorMap.containsKey("schedule_confirm")||locatorMap.containsKey("ios_schedule_confirm")){
   ElementBeans elementBeans=locatorMap.get("schedule_confirm");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_confirm");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_confirm】元素信息"); return null;}
 }

/***
* 创建日程
* @return
* @throws IOException
*/
public  ElementBeans schedule_create_tittle() throws IOException
 {
   if(locatorMap.containsKey("schedule_create_tittle")||locatorMap.containsKey("ios_schedule_create_tittle")){
   ElementBeans elementBeans=locatorMap.get("schedule_create_tittle");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_create_tittle");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_create_tittle】元素信息"); return null;}
 }

/***
* 输入日程标题
* @return
* @throws IOException
*/
public  ElementBeans schedule_title_input() throws IOException
 {
   if(locatorMap.containsKey("schedule_title_input")||locatorMap.containsKey("ios_schedule_title_input")){
   ElementBeans elementBeans=locatorMap.get("schedule_title_input");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_title_input");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_title_input】元素信息"); return null;}
 }

/***
* 全天开关切换
* @return
* @throws IOException
*/
public  ElementBeans schedule_switch_lock() throws IOException
 {
   if(locatorMap.containsKey("schedule_switch_lock")||locatorMap.containsKey("ios_schedule_switch_lock")){
   ElementBeans elementBeans=locatorMap.get("schedule_switch_lock");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_switch_lock");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_switch_lock】元素信息"); return null;}
 }

/***
* 选择时间
* @return
* @throws IOException
*/
public  ElementBeans schedule_time_select() throws IOException
 {
   if(locatorMap.containsKey("schedule_time_select")||locatorMap.containsKey("ios_schedule_time_select")){
   ElementBeans elementBeans=locatorMap.get("schedule_time_select");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_time_select");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_time_select】元素信息"); return null;}
 }

/***
* 添加参与人（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans schedule_add_users() throws IOException
 {
   if(locatorMap.containsKey("schedule_add_users")||locatorMap.containsKey("ios_schedule_add_users")){
   ElementBeans elementBeans=locatorMap.get("schedule_add_users");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_add_users");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_add_users】元素信息"); return null;}
 }

/***
* 添加地点
* @return
* @throws IOException
*/
public  ElementBeans schedule_add_address() throws IOException
 {
   if(locatorMap.containsKey("schedule_add_address")||locatorMap.containsKey("ios_schedule_add_address")){
   ElementBeans elementBeans=locatorMap.get("schedule_add_address");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_add_address");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_add_address】元素信息"); return null;}
 }

/***
* 时间提醒选择（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans schedule_remind() throws IOException
 {
   if(locatorMap.containsKey("schedule_remind")||locatorMap.containsKey("ios_schedule_remind")){
   ElementBeans elementBeans=locatorMap.get("schedule_remind");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_remind");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_remind】元素信息"); return null;}
 }

/***
* 取消
* @return
* @throws IOException
*/
public  ElementBeans schedule_time_select_cancel() throws IOException
 {
   if(locatorMap.containsKey("schedule_time_select_cancel")||locatorMap.containsKey("ios_schedule_time_select_cancel")){
   ElementBeans elementBeans=locatorMap.get("schedule_time_select_cancel");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_time_select_cancel");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_time_select_cancel】元素信息"); return null;}
 }

/***
* 确定
* @return
* @throws IOException
*/
public  ElementBeans schedule_time_select_confirm() throws IOException
 {
   if(locatorMap.containsKey("schedule_time_select_confirm")||locatorMap.containsKey("ios_schedule_time_select_confirm")){
   ElementBeans elementBeans=locatorMap.get("schedule_time_select_confirm");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_time_select_confirm");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_time_select_confirm】元素信息"); return null;}
 }
}