package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//工作台设置首页_对象库类
public class WorkBenchSettingsPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(WorkBenchSettingsPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   WorkBenchSettingsPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 工作台设置页标题
* @return
* @throws IOException
*/
public  ElementBeans workbench_settings_title() throws IOException
 {
   if(locatorMap.containsKey("workbench_settings_title")||locatorMap.containsKey("ios_workbench_settings_title")){
   ElementBeans elementBeans=locatorMap.get("workbench_settings_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_settings_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_settings_title】元素信息"); return null;}
 }

/***
* 完成
* @return
* @throws IOException
*/
public  ElementBeans workbench_settings_confirm() throws IOException
 {
   if(locatorMap.containsKey("workbench_settings_confirm")||locatorMap.containsKey("ios_workbench_settings_confirm")){
   ElementBeans elementBeans=locatorMap.get("workbench_settings_confirm");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_settings_confirm");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_settings_confirm】元素信息"); return null;}
 }

/***
* 卡片列表
* @return
* @throws IOException
*/
public  ElementBeans workbench_settings_cards_list() throws IOException
 {
   if(locatorMap.containsKey("workbench_settings_cards_list")||locatorMap.containsKey("ios_workbench_settings_cards_list")){
   ElementBeans elementBeans=locatorMap.get("workbench_settings_cards_list");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_settings_cards_list");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_settings_cards_list】元素信息"); return null;}
 }
}