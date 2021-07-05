package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//按架构选择参与人页面元素_对象库类
public class SelectParticipantByFrameworkPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(SelectParticipantByFrameworkPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   SelectParticipantByFrameworkPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 选择联系人页面标题
* @return
* @throws IOException
*/
public  ElementBeans select_participant_by_framework_title() throws IOException
 {
   if(locatorMap.containsKey("select_participant_by_framework_title")||locatorMap.containsKey("ios_select_participant_by_framework_title")){
   ElementBeans elementBeans=locatorMap.get("select_participant_by_framework_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_select_participant_by_framework_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【select_participant_by_framework_title】元素信息"); return null;}
 }

/***
* 搜索框
* @return
* @throws IOException
*/
public  ElementBeans select_participant_by_framework_search() throws IOException
 {
   if(locatorMap.containsKey("select_participant_by_framework_search")||locatorMap.containsKey("ios_select_participant_by_framework_search")){
   ElementBeans elementBeans=locatorMap.get("select_participant_by_framework_search");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_select_participant_by_framework_search");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【select_participant_by_framework_search】元素信息"); return null;}
 }

/***
* 点击通讯录
* @return
* @throws IOException
*/
public  ElementBeans select_participant_by_framework_click_address() throws IOException
 {
   if(locatorMap.containsKey("select_participant_by_framework_click_address")||locatorMap.containsKey("ios_select_participant_by_framework_click_address")){
   ElementBeans elementBeans=locatorMap.get("select_participant_by_framework_click_address");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_select_participant_by_framework_click_address");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【select_participant_by_framework_click_address】元素信息"); return null;}
 }

/***
* 组织架构
* @return
* @throws IOException
*/
public  ElementBeans select_participant_by_framework_framework_check() throws IOException
 {
   if(locatorMap.containsKey("select_participant_by_framework_framework_check")||locatorMap.containsKey("ios_select_participant_by_framework_framework_check")){
   ElementBeans elementBeans=locatorMap.get("select_participant_by_framework_framework_check");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_select_participant_by_framework_framework_check");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【select_participant_by_framework_framework_check】元素信息"); return null;}
 }

/***
* 领域查看
* @return
* @throws IOException
*/
public  ElementBeans select_participant_by_framework_department_check() throws IOException
 {
   if(locatorMap.containsKey("select_participant_by_framework_department_check")||locatorMap.containsKey("ios_select_participant_by_framework_department_check")){
   ElementBeans elementBeans=locatorMap.get("select_participant_by_framework_department_check");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_select_participant_by_framework_department_check");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【select_participant_by_framework_department_check】元素信息"); return null;}
 }

/***
* 查看已选择人列表
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

/***
* 退出弹出框标题
* @return
* @throws IOException
*/
public  ElementBeans exit_title() throws IOException
 {
   if(locatorMap.containsKey("exit_title")||locatorMap.containsKey("ios_exit_title")){
   ElementBeans elementBeans=locatorMap.get("exit_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_exit_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【exit_title】元素信息"); return null;}
 }

/***
* 退出弹出框确定
* @return
* @throws IOException
*/
public  ElementBeans exit_confirm() throws IOException
 {
   if(locatorMap.containsKey("exit_confirm")||locatorMap.containsKey("ios_exit_confirm")){
   ElementBeans elementBeans=locatorMap.get("exit_confirm");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_exit_confirm");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【exit_confirm】元素信息"); return null;}
 }

/***
* 退出弹出框取消
* @return
* @throws IOException
*/
public  ElementBeans exit_cancel() throws IOException
 {
   if(locatorMap.containsKey("exit_cancel")||locatorMap.containsKey("ios_exit_cancel")){
   ElementBeans elementBeans=locatorMap.get("exit_cancel");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_exit_cancel");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【exit_cancel】元素信息"); return null;}
 }
}