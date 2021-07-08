package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//选择参与人页面元素_对象库类
public class SelectParticipantPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(SelectParticipantPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   SelectParticipantPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 选择联系人
* @return
* @throws IOException
*/
public  ElementBeans select_participant_title() throws IOException
 {
   if(locatorMap.containsKey("select_participant_title")||locatorMap.containsKey("ios_select_participant_title")){
   ElementBeans elementBeans=locatorMap.get("select_participant_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_select_participant_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【select_participant_title】元素信息"); return null;}
 }

/***
* 搜索框
* @return
* @throws IOException
*/
public  ElementBeans select_participant_search() throws IOException
 {
   if(locatorMap.containsKey("select_participant_search")||locatorMap.containsKey("ios_select_participant_search")){
   ElementBeans elementBeans=locatorMap.get("select_participant_search");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_select_participant_search");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【select_participant_search】元素信息"); return null;}
 }

/***
* 按好友选（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans select_participant_by_friends() throws IOException
 {
   if(locatorMap.containsKey("select_participant_by_friends")||locatorMap.containsKey("ios_select_participant_by_friends")){
   ElementBeans elementBeans=locatorMap.get("select_participant_by_friends");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_select_participant_by_friends");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【select_participant_by_friends】元素信息"); return null;}
 }

/***
* 按架构选（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans select_participant_by_framework() throws IOException
 {
   if(locatorMap.containsKey("select_participant_by_framework")||locatorMap.containsKey("ios_select_participant_by_framework")){
   ElementBeans elementBeans=locatorMap.get("select_participant_by_framework");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_select_participant_by_framework");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【select_participant_by_framework】元素信息"); return null;}
 }

/***
* 常用联系人列表
* @return
* @throws IOException
*/
public  ElementBeans select_participant_list() throws IOException
 {
   if(locatorMap.containsKey("select_participant_list")||locatorMap.containsKey("ios_select_participant_list")){
   ElementBeans elementBeans=locatorMap.get("select_participant_list");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_select_participant_list");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【select_participant_list】元素信息"); return null;}
 }

/***
* 搜索结果列表
* @return
* @throws IOException
*/
public  ElementBeans search_participant_list() throws IOException
 {
   if(locatorMap.containsKey("search_participant_list")||locatorMap.containsKey("ios_search_participant_list")){
   ElementBeans elementBeans=locatorMap.get("search_participant_list");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_search_participant_list");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【search_participant_list】元素信息"); return null;}
 }

/***
* 容嘉荣
* @return
* @throws IOException
*/
public  ElementBeans select_participant_result() throws IOException
 {
   if(locatorMap.containsKey("select_participant_result")||locatorMap.containsKey("ios_select_participant_result")){
   ElementBeans elementBeans=locatorMap.get("select_participant_result");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_select_participant_result");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【select_participant_result】元素信息"); return null;}
 }

/***
* 查看已选择人列表（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans review_select_participant_list() throws IOException
 {
   if(locatorMap.containsKey("review_select_participant_list")||locatorMap.containsKey("ios_review_select_participant_list")){
   ElementBeans elementBeans=locatorMap.get("review_select_participant_list");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_review_select_participant_list");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【review_select_participant_list】元素信息"); return null;}
 }

/***
* 确定
* @return
* @throws IOException
*/
public  ElementBeans select_participant_submit() throws IOException
 {
   if(locatorMap.containsKey("select_participant_submit")||locatorMap.containsKey("ios_select_participant_submit")){
   ElementBeans elementBeans=locatorMap.get("select_participant_submit");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_select_participant_submit");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【select_participant_submit】元素信息"); return null;}
 }
}