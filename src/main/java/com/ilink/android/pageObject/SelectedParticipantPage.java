package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//已选择参与人页面元素_对象库类
public class SelectedParticipantPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(SelectedParticipantPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   SelectedParticipantPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 已选择联系人页面标题
* @return
* @throws IOException
*/
public  ElementBeans selected_participant_title() throws IOException
 {
   if(locatorMap.containsKey("selected_participant_title")||locatorMap.containsKey("ios_selected_participant_title")){
   ElementBeans elementBeans=locatorMap.get("selected_participant_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_selected_participant_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【selected_participant_title】元素信息"); return null;}
 }

/***
* 已选择联系人列表
* @return
* @throws IOException
*/
public  ElementBeans selected_participant_list() throws IOException
 {
   if(locatorMap.containsKey("selected_participant_list")||locatorMap.containsKey("ios_selected_participant_list")){
   ElementBeans elementBeans=locatorMap.get("selected_participant_list");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_selected_participant_list");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【selected_participant_list】元素信息"); return null;}
 }

/***
* 确认
* @return
* @throws IOException
*/
public  ElementBeans selected_participant_confirm() throws IOException
 {
   if(locatorMap.containsKey("selected_participant_confirm")||locatorMap.containsKey("ios_selected_participant_confirm")){
   ElementBeans elementBeans=locatorMap.get("selected_participant_confirm");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_selected_participant_confirm");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【selected_participant_confirm】元素信息"); return null;}
 }
}