package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//日程页面元素_对象库类
public class SchedulePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(SchedulePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   SchedulePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 日程页搜索
* @return
* @throws IOException
*/
public  ElementBeans schedule_search() throws IOException
 {
   if(locatorMap.containsKey("schedule_search")||locatorMap.containsKey("ios_schedule_search")){
   ElementBeans elementBeans=locatorMap.get("schedule_search");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_search");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_search】元素信息"); return null;}
 }

/***
* 新建日程
* @return
* @throws IOException
*/
public  ElementBeans new_schedule() throws IOException
 {
   if(locatorMap.containsKey("new_schedule")||locatorMap.containsKey("ios_new_schedule")){
   ElementBeans elementBeans=locatorMap.get("new_schedule");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_new_schedule");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【new_schedule】元素信息"); return null;}
 }

/***
* 日程列表
* @return
* @throws IOException
*/
public  ElementBeans schedule_list() throws IOException
 {
   if(locatorMap.containsKey("schedule_list")||locatorMap.containsKey("ios_schedule_list")){
   ElementBeans elementBeans=locatorMap.get("schedule_list");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_schedule_list");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【schedule_list】元素信息"); return null;}
 }
}