package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//待办中心首页_对象库类
public class ToDoHomePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(ToDoHomePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   ToDoHomePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 待办中心标题
* @return
* @throws IOException
*/
public  ElementBeans to_do_title() throws IOException
 {
   if(locatorMap.containsKey("to_do_title")||locatorMap.containsKey("ios_to_do_title")){
   ElementBeans elementBeans=locatorMap.get("to_do_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_to_do_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【to_do_title】元素信息"); return null;}
 }

/***
* 待办搜索（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans to_do_search() throws IOException
 {
   if(locatorMap.containsKey("to_do_search")||locatorMap.containsKey("ios_to_do_search")){
   ElementBeans elementBeans=locatorMap.get("to_do_search");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_to_do_search");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【to_do_search】元素信息"); return null;}
 }

/***
* 已发起
* @return
* @throws IOException
*/
public  ElementBeans to_do_launch() throws IOException
 {
   if(locatorMap.containsKey("to_do_launch")||locatorMap.containsKey("ios_to_do_launch")){
   ElementBeans elementBeans=locatorMap.get("to_do_launch");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_to_do_launch");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【to_do_launch】元素信息"); return null;}
 }

/***
* 待处理
* @return
* @throws IOException
*/
public  ElementBeans to_do_pending() throws IOException
 {
   if(locatorMap.containsKey("to_do_pending")||locatorMap.containsKey("ios_to_do_pending")){
   ElementBeans elementBeans=locatorMap.get("to_do_pending");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_to_do_pending");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【to_do_pending】元素信息"); return null;}
 }

/***
* 已处理
* @return
* @throws IOException
*/
public  ElementBeans to_do_done() throws IOException
 {
   if(locatorMap.containsKey("to_do_done")||locatorMap.containsKey("ios_to_do_done")){
   ElementBeans elementBeans=locatorMap.get("to_do_done");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_to_do_done");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【to_do_done】元素信息"); return null;}
 }

/***
* 抄送我
* @return
* @throws IOException
*/
public  ElementBeans to_do_CC() throws IOException
 {
   if(locatorMap.containsKey("to_do_CC")||locatorMap.containsKey("ios_to_do_CC")){
   ElementBeans elementBeans=locatorMap.get("to_do_CC");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_to_do_CC");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【to_do_CC】元素信息"); return null;}
 }

/***
* 待办列表（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans to_do_list() throws IOException
 {
   if(locatorMap.containsKey("to_do_list")||locatorMap.containsKey("ios_to_do_list")){
   ElementBeans elementBeans=locatorMap.get("to_do_list");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_to_do_list");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【to_do_list】元素信息"); return null;}
 }

/***
* 待办标题刷选
* @return
* @throws IOException
*/
public  ElementBeans to_do_list_classify() throws IOException
 {
   if(locatorMap.containsKey("to_do_list_classify")||locatorMap.containsKey("ios_to_do_list_classify")){
   ElementBeans elementBeans=locatorMap.get("to_do_list_classify");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_to_do_list_classify");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【to_do_list_classify】元素信息"); return null;}
 }
}