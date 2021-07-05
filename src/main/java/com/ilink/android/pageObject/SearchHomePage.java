package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//搜索页_对象库类
public class SearchHomePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(SearchHomePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   SearchHomePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 搜索
* @return
* @throws IOException
*/
public  ElementBeans search_edit() throws IOException
 {
   if(locatorMap.containsKey("search_edit")||locatorMap.containsKey("ios_search_edit")){
   ElementBeans elementBeans=locatorMap.get("search_edit");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_search_edit");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【search_edit】元素信息"); return null;}
 }

/***
* 联系人筛选
* @return
* @throws IOException
*/
public  ElementBeans search_by_contract() throws IOException
 {
   if(locatorMap.containsKey("search_by_contract")||locatorMap.containsKey("ios_search_by_contract")){
   ElementBeans elementBeans=locatorMap.get("search_by_contract");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_search_by_contract");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【search_by_contract】元素信息"); return null;}
 }

/***
* 群组筛选
* @return
* @throws IOException
*/
public  ElementBeans search_by_groups() throws IOException
 {
   if(locatorMap.containsKey("search_by_groups")||locatorMap.containsKey("ios_search_by_groups")){
   ElementBeans elementBeans=locatorMap.get("search_by_groups");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_search_by_groups");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【search_by_groups】元素信息"); return null;}
 }

/***
* 日程筛选
* @return
* @throws IOException
*/
public  ElementBeans search_by_schedule() throws IOException
 {
   if(locatorMap.containsKey("search_by_schedule")||locatorMap.containsKey("ios_search_by_schedule")){
   ElementBeans elementBeans=locatorMap.get("search_by_schedule");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_search_by_schedule");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【search_by_schedule】元素信息"); return null;}
 }

/***
* 会议筛选
* @return
* @throws IOException
*/
public  ElementBeans search_by_meeting() throws IOException
 {
   if(locatorMap.containsKey("search_by_meeting")||locatorMap.containsKey("ios_search_by_meeting")){
   ElementBeans elementBeans=locatorMap.get("search_by_meeting");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_search_by_meeting");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【search_by_meeting】元素信息"); return null;}
 }

/***
* 搜索结果列表
* @return
* @throws IOException
*/
public  ElementBeans search_result() throws IOException
 {
   if(locatorMap.containsKey("search_result")||locatorMap.containsKey("ios_search_result")){
   ElementBeans elementBeans=locatorMap.get("search_result");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_search_result");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【search_result】元素信息"); return null;}
 }
}