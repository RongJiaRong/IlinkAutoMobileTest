package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//通知公告首页_对象库类
public class NoticeHomePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(NoticeHomePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   NoticeHomePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 通知公告标题
* @return
* @throws IOException
*/
public  ElementBeans workbench_notice_title() throws IOException
 {
   if(locatorMap.containsKey("workbench_notice_title")||locatorMap.containsKey("ios_workbench_notice_title")){
   ElementBeans elementBeans=locatorMap.get("workbench_notice_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_notice_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_notice_title】元素信息"); return null;}
 }
}