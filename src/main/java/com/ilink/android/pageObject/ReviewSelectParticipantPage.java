package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//查看选择参与人页面元素_对象库类
public class ReviewSelectParticipantPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(ReviewSelectParticipantPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   ReviewSelectParticipantPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 选择参与人
* @return
* @throws IOException
*/
public  ElementBeans review_participant_title() throws IOException
 {
   if(locatorMap.containsKey("review_participant_title")||locatorMap.containsKey("ios_review_participant_title")){
   ElementBeans elementBeans=locatorMap.get("review_participant_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_review_participant_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【review_participant_title】元素信息"); return null;}
 }

/***
* 完成
* @return
* @throws IOException
*/
public  ElementBeans review_participant_confirm() throws IOException
 {
   if(locatorMap.containsKey("review_participant_confirm")||locatorMap.containsKey("ios_review_participant_confirm")){
   ElementBeans elementBeans=locatorMap.get("review_participant_confirm");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_review_participant_confirm");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【review_participant_confirm】元素信息"); return null;}
 }

/***
* 选择新的参与人（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans review_participant_add() throws IOException
 {
   if(locatorMap.containsKey("review_participant_add")||locatorMap.containsKey("ios_review_participant_add")){
   ElementBeans elementBeans=locatorMap.get("review_participant_add");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_review_participant_add");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【review_participant_add】元素信息"); return null;}
 }

/***
* 全选
* @return
* @throws IOException
*/
public  ElementBeans review_participant_all_select() throws IOException
 {
   if(locatorMap.containsKey("review_participant_all_select")||locatorMap.containsKey("ios_review_participant_all_select")){
   ElementBeans elementBeans=locatorMap.get("review_participant_all_select");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_review_participant_all_select");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【review_participant_all_select】元素信息"); return null;}
 }

/***
* 已选择的参与人
* @return
* @throws IOException
*/
public  ElementBeans review_participant_selected() throws IOException
 {
   if(locatorMap.containsKey("review_participant_selected")||locatorMap.containsKey("ios_review_participant_selected")){
   ElementBeans elementBeans=locatorMap.get("review_participant_selected");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_review_participant_selected");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【review_participant_selected】元素信息"); return null;}
 }
}