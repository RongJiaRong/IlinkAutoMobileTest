package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//加班反馈首页_对象库类
public class OTReplyHomePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(OTReplyHomePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   OTReplyHomePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 加班反馈标题
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_OT_reply_title() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_OT_reply_title")||locatorMap.containsKey("ios_workbench_applicants_OT_reply_title")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_OT_reply_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_OT_reply_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_OT_reply_title】元素信息"); return null;}
 }
}