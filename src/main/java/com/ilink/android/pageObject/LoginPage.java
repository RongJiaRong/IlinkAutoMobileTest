package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//登录页面元素_对象库类
public class LoginPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(LoginPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   LoginPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 密码登录
* @return
* @throws IOException
*/
public  ElementBeans pwd_login() throws IOException
 {
   if(locatorMap.containsKey("pwd_login")||locatorMap.containsKey("ios_pwd_login")){
   ElementBeans elementBeans=locatorMap.get("pwd_login");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_pwd_login");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【pwd_login】元素信息"); return null;}
 }

/***
* 验证码登录
* @return
* @throws IOException
*/
public  ElementBeans validate_code_login() throws IOException
 {
   if(locatorMap.containsKey("validate_code_login")||locatorMap.containsKey("ios_validate_code_login")){
   ElementBeans elementBeans=locatorMap.get("validate_code_login");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_validate_code_login");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【validate_code_login】元素信息"); return null;}
 }

/***
* 手机号输入
* @return
* @throws IOException
*/
public  ElementBeans phone_num_input() throws IOException
 {
   if(locatorMap.containsKey("phone_num_input")||locatorMap.containsKey("ios_phone_num_input")){
   ElementBeans elementBeans=locatorMap.get("phone_num_input");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_phone_num_input");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【phone_num_input】元素信息"); return null;}
 }

/***
* 发送验证码
* @return
* @throws IOException
*/
public  ElementBeans send_validate_code() throws IOException
 {
   if(locatorMap.containsKey("send_validate_code")||locatorMap.containsKey("ios_send_validate_code")){
   ElementBeans elementBeans=locatorMap.get("send_validate_code");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_send_validate_code");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【send_validate_code】元素信息"); return null;}
 }

/***
* 验证码输入
* @return
* @throws IOException
*/
public  ElementBeans validate_code_input() throws IOException
 {
   if(locatorMap.containsKey("validate_code_input")||locatorMap.containsKey("ios_validate_code_input")){
   ElementBeans elementBeans=locatorMap.get("validate_code_input");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_validate_code_input");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【validate_code_input】元素信息"); return null;}
 }

/***
* 手机账号输入
* @return
* @throws IOException
*/
public  ElementBeans login_account_input() throws IOException
 {
   if(locatorMap.containsKey("login_account_input")||locatorMap.containsKey("ios_login_account_input")){
   ElementBeans elementBeans=locatorMap.get("login_account_input");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_login_account_input");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【login_account_input】元素信息"); return null;}
 }

/***
* 密码输入
* @return
* @throws IOException
*/
public  ElementBeans login_pwd_input() throws IOException
 {
   if(locatorMap.containsKey("login_pwd_input")||locatorMap.containsKey("ios_login_pwd_input")){
   ElementBeans elementBeans=locatorMap.get("login_pwd_input");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_login_pwd_input");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【login_pwd_input】元素信息"); return null;}
 }

/***
* 登陆按钮
* @return
* @throws IOException
*/
public  ElementBeans login_button() throws IOException
 {
   if(locatorMap.containsKey("login_button")||locatorMap.containsKey("ios_login_button")){
   ElementBeans elementBeans=locatorMap.get("login_button");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_login_button");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【login_button】元素信息"); return null;}
 }

/***
* 忘记密码按钮
* @return
* @throws IOException
*/
public  ElementBeans pwd_forgot_button() throws IOException
 {
   if(locatorMap.containsKey("pwd_forgot_button")||locatorMap.containsKey("ios_pwd_forgot_button")){
   ElementBeans elementBeans=locatorMap.get("pwd_forgot_button");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_pwd_forgot_button");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【pwd_forgot_button】元素信息"); return null;}
 }
}