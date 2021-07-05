package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//日程提醒_对象库类
public class ScheduleReminderPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(ScheduleReminderPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   ScheduleReminderPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 日程提醒页标题
* @return
* @throws IOException
*/
public  ElementBeans schedule_reminder_title() throws IOException
 {
   if(locatorMap.containsKey("schedule_reminder_title")||locatorMap.containsKey("ios_schedule_reminder_title")){
   ElementBeans elementBeans=locatorMap.get("schedule_reminder_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_reminder_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_reminder_title】元素信息"); return null;}
 }

/***
* 完成
* @return
* @throws IOException
*/
public  ElementBeans schedule_reminder_confirm() throws IOException
 {
   if(locatorMap.containsKey("schedule_reminder_confirm")||locatorMap.containsKey("ios_schedule_reminder_confirm")){
   ElementBeans elementBeans=locatorMap.get("schedule_reminder_confirm");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_reminder_confirm");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_reminder_confirm】元素信息"); return null;}
 }

/***
* 无提醒
* @return
* @throws IOException
*/
public  ElementBeans schedule_reminder_no_reminder() throws IOException
 {
   if(locatorMap.containsKey("schedule_reminder_no_reminder")||locatorMap.containsKey("ios_schedule_reminder_no_reminder")){
   ElementBeans elementBeans=locatorMap.get("schedule_reminder_no_reminder");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_reminder_no_reminder");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_reminder_no_reminder】元素信息"); return null;}
 }

/***
* 开始时
* @return
* @throws IOException
*/
public  ElementBeans schedule_reminder_at_begin() throws IOException
 {
   if(locatorMap.containsKey("schedule_reminder_at_begin")||locatorMap.containsKey("ios_schedule_reminder_at_begin")){
   ElementBeans elementBeans=locatorMap.get("schedule_reminder_at_begin");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_reminder_at_begin");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_reminder_at_begin】元素信息"); return null;}
 }

/***
* 5分钟前
* @return
* @throws IOException
*/
public  ElementBeans schedule_reminder_5minutes() throws IOException
 {
   if(locatorMap.containsKey("schedule_reminder_5minutes")||locatorMap.containsKey("ios_schedule_reminder_5minutes")){
   ElementBeans elementBeans=locatorMap.get("schedule_reminder_5minutes");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_reminder_5minutes");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_reminder_5minutes】元素信息"); return null;}
 }

/***
* 15分钟前
* @return
* @throws IOException
*/
public  ElementBeans schedule_reminder_15minutes() throws IOException
 {
   if(locatorMap.containsKey("schedule_reminder_15minutes")||locatorMap.containsKey("ios_schedule_reminder_15minutes")){
   ElementBeans elementBeans=locatorMap.get("schedule_reminder_15minutes");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_reminder_15minutes");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_reminder_15minutes】元素信息"); return null;}
 }

/***
* 30分钟前
* @return
* @throws IOException
*/
public  ElementBeans schedule_reminder_30minutes() throws IOException
 {
   if(locatorMap.containsKey("schedule_reminder_30minutes")||locatorMap.containsKey("ios_schedule_reminder_30minutes")){
   ElementBeans elementBeans=locatorMap.get("schedule_reminder_30minutes");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_reminder_30minutes");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_reminder_30minutes】元素信息"); return null;}
 }

/***
* 1消失前
* @return
* @throws IOException
*/
public  ElementBeans schedule_reminder_1hour() throws IOException
 {
   if(locatorMap.containsKey("schedule_reminder_1hour")||locatorMap.containsKey("ios_schedule_reminder_1hour")){
   ElementBeans elementBeans=locatorMap.get("schedule_reminder_1hour");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_reminder_1hour");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_reminder_1hour】元素信息"); return null;}
 }

/***
* 1天前
* @return
* @throws IOException
*/
public  ElementBeans schedule_reminder_1day() throws IOException
 {
   if(locatorMap.containsKey("schedule_reminder_1day")||locatorMap.containsKey("ios_schedule_reminder_1day")){
   ElementBeans elementBeans=locatorMap.get("schedule_reminder_1day");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_reminder_1day");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_reminder_1day】元素信息"); return null;}
 }
}