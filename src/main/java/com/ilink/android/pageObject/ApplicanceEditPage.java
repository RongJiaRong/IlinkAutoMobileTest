package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//应用中心编辑_对象库类
public class ApplicanceEditPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(ApplicanceEditPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   ApplicanceEditPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 编辑应用标题
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_edit_title() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_edit_title")||locatorMap.containsKey("ios_workbench_applicants_edit_title")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_edit_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_edit_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_edit_title】元素信息"); return null;}
 }

/***
* 完成
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_edit_done() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_edit_done")||locatorMap.containsKey("ios_workbench_applicants_edit_done")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_edit_done");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_edit_done");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_edit_done】元素信息"); return null;}
 }
}