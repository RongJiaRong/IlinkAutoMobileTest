package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//音视频启动页_对象库类
public class MeetingInitPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(MeetingInitPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   MeetingInitPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 会议启动页会议标题
* @return
* @throws IOException
*/
public  ElementBeans meeting_init_tittle() throws IOException
 {
   if(locatorMap.containsKey("meeting_init_tittle")||locatorMap.containsKey("ios_meeting_init_tittle")){
   ElementBeans elementBeans=locatorMap.get("meeting_init_tittle");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_init_tittle");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_init_tittle】元素信息"); return null;}
 }

/***
* 会议启动页关闭
* @return
* @throws IOException
*/
public  ElementBeans meeting_init_close() throws IOException
 {
   if(locatorMap.containsKey("meeting_init_close")||locatorMap.containsKey("ios_meeting_init_close")){
   ElementBeans elementBeans=locatorMap.get("meeting_init_close");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_init_close");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_init_close】元素信息"); return null;}
 }

/***
* 静音按钮
* @return
* @throws IOException
*/
public  ElementBeans meeting_init_audio() throws IOException
 {
   if(locatorMap.containsKey("meeting_init_audio")||locatorMap.containsKey("ios_meeting_init_audio")){
   ElementBeans elementBeans=locatorMap.get("meeting_init_audio");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_init_audio");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_init_audio】元素信息"); return null;}
 }

/***
* 摄像头按钮
* @return
* @throws IOException
*/
public  ElementBeans meeting_init_video() throws IOException
 {
   if(locatorMap.containsKey("meeting_init_video")||locatorMap.containsKey("ios_meeting_init_video")){
   ElementBeans elementBeans=locatorMap.get("meeting_init_video");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_init_video");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_init_video】元素信息"); return null;}
 }

/***
* 扬声器按钮
* @return
* @throws IOException
*/
public  ElementBeans meeting_init_volume() throws IOException
 {
   if(locatorMap.containsKey("meeting_init_volume")||locatorMap.containsKey("ios_meeting_init_volume")){
   ElementBeans elementBeans=locatorMap.get("meeting_init_volume");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_init_volume");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_init_volume】元素信息"); return null;}
 }

/***
* 开始会议
* @return
* @throws IOException
*/
public  ElementBeans meeting_init_start() throws IOException
 {
   if(locatorMap.containsKey("meeting_init_start")||locatorMap.containsKey("ios_meeting_init_start")){
   ElementBeans elementBeans=locatorMap.get("meeting_init_start");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_init_start");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_init_start】元素信息"); return null;}
 }
}