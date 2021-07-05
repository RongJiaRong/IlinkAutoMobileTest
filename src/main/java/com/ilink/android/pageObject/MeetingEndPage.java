package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//音视频会议结束页_对象库类
public class MeetingEndPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(MeetingEndPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   MeetingEndPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 返回按钮
* @return
* @throws IOException
*/
public  ElementBeans meeting_end_go_back() throws IOException
 {
   if(locatorMap.containsKey("meeting_end_go_back")||locatorMap.containsKey("ios_meeting_end_go_back")){
   ElementBeans elementBeans=locatorMap.get("meeting_end_go_back");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_end_go_back");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_end_go_back】元素信息"); return null;}
 }

/***
* 会议类型
* @return
* @throws IOException
*/
public  ElementBeans meeting_end_meeting_type() throws IOException
 {
   if(locatorMap.containsKey("meeting_end_meeting_type")||locatorMap.containsKey("ios_meeting_end_meeting_type")){
   ElementBeans elementBeans=locatorMap.get("meeting_end_meeting_type");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_meeting_end_meeting_type");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【meeting_end_meeting_type】元素信息"); return null;}
 }
}