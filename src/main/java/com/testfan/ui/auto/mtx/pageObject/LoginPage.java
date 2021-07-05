package com.testfan.ui.auto.mtx.pageObject;
import java.io.IOException;
import org.apache.log4j.Logger;
import java.io.InputStream;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//javamall登录页面_对象库类
public class LoginPage extends BasePage {
private static Logger log = Logger.getLogger(LoginPage.class);//用于eclipse工程内运行查找对象库文件路径
 public   LoginPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);

}
/***
* 用户名
* @return
* @throws IOException
*/
public  ElementBeans username() throws IOException
 {
   if(locatorMap.containsKey("username")||locatorMap.containsKey("ios_username")){
   ElementBeans elementBeans=locatorMap.get("username");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_username");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【username】元素信息"); return null;}
 }

/***
* 密码
* @return
* @throws IOException
*/
public  ElementBeans password() throws IOException
 {
   if(locatorMap.containsKey("password")||locatorMap.containsKey("ios_password")){
   ElementBeans elementBeans=locatorMap.get("password");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_password");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【password】元素信息"); return null;}
 }

/***
* 验证码
* @return
* @throws IOException
*/
public  ElementBeans validcode() throws IOException
 {
   if(locatorMap.containsKey("validcode")||locatorMap.containsKey("ios_validcode")){
   ElementBeans elementBeans=locatorMap.get("validcode");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_validcode");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【validcode】元素信息"); return null;}
 }

/***
* 登录按钮
* @return
* @throws IOException
*/
public  ElementBeans loginBtn() throws IOException
 {
   if(locatorMap.containsKey("loginBtn")||locatorMap.containsKey("ios_loginBtn")){
   ElementBeans elementBeans=locatorMap.get("loginBtn");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_loginBtn");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【loginBtn】元素信息"); return null;}
 }
}