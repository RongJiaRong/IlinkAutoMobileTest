package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//日程弹框_对象库类
public class ScheduleAlertPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(ScheduleAlertPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   ScheduleAlertPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 日程弹框标题
* @return
* @throws IOException
*/
public  ElementBeans schedule_alert_title() throws IOException
 {
   if(locatorMap.containsKey("schedule_alert_title")||locatorMap.containsKey("ios_schedule_alert_title")){
   ElementBeans elementBeans=locatorMap.get("schedule_alert_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_alert_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_alert_title】元素信息"); return null;}
 }

/***
* 邀请提示
* @return
* @throws IOException
*/
public  ElementBeans schedule_invitation_tip() throws IOException
 {
   if(locatorMap.containsKey("schedule_invitation_tip")||locatorMap.containsKey("ios_schedule_invitation_tip")){
   ElementBeans elementBeans=locatorMap.get("schedule_invitation_tip");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_invitation_tip");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_invitation_tip】元素信息"); return null;}
 }

/***
* 日程标题
* @return
* @throws IOException
*/
public  ElementBeans schedule_title() throws IOException
 {
   if(locatorMap.containsKey("schedule_title")||locatorMap.containsKey("ios_schedule_title")){
   ElementBeans elementBeans=locatorMap.get("schedule_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_title】元素信息"); return null;}
 }

/***
* 日程暂不处理
* @return
* @throws IOException
*/
public  ElementBeans schedule_no_process() throws IOException
 {
   if(locatorMap.containsKey("schedule_no_process")||locatorMap.containsKey("ios_schedule_no_process")){
   ElementBeans elementBeans=locatorMap.get("schedule_no_process");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_no_process");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_no_process】元素信息"); return null;}
 }

/***
* 日程拒绝
* @return
* @throws IOException
*/
public  ElementBeans schedule_reject() throws IOException
 {
   if(locatorMap.containsKey("schedule_reject")||locatorMap.containsKey("ios_schedule_reject")){
   ElementBeans elementBeans=locatorMap.get("schedule_reject");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_reject");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_reject】元素信息"); return null;}
 }

/***
* 日程接受
* @return
* @throws IOException
*/
public  ElementBeans schedule_accept() throws IOException
 {
   if(locatorMap.containsKey("schedule_accept")||locatorMap.containsKey("ios_schedule_accept")){
   ElementBeans elementBeans=locatorMap.get("schedule_accept");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_accept");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_accept】元素信息"); return null;}
 }
}