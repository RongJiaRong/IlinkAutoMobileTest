package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//过渡页授权页面元素_对象库类
public class PermisionAskPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(PermisionAskPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   PermisionAskPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 权限申请
* @return
* @throws IOException
*/
public  ElementBeans phone_permission() throws IOException
 {
   if(locatorMap.containsKey("phone_permission")||locatorMap.containsKey("ios_phone_permission")){
   ElementBeans elementBeans=locatorMap.get("phone_permission");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_phone_permission");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【phone_permission】元素信息"); return null;}
 }

/***
* 允许
* @return
* @throws IOException
*/
public  ElementBeans allow_button() throws IOException
 {
   if(locatorMap.containsKey("allow_button")||locatorMap.containsKey("ios_allow_button")){
   ElementBeans elementBeans=locatorMap.get("allow_button");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_allow_button");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【allow_button】元素信息"); return null;}
 }
}