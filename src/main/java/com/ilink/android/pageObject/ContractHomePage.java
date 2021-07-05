package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//通讯录首页_对象库类
public class ContractHomePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(ContractHomePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   ContractHomePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 通讯录标题
* @return
* @throws IOException
*/
public  ElementBeans contract_tittle() throws IOException
 {
   if(locatorMap.containsKey("contract_tittle")||locatorMap.containsKey("ios_contract_tittle")){
   ElementBeans elementBeans=locatorMap.get("contract_tittle");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_contract_tittle");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【contract_tittle】元素信息"); return null;}
 }

/***
* 通讯录搜索（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans contract_search() throws IOException
 {
   if(locatorMap.containsKey("contract_search")||locatorMap.containsKey("ios_contract_search")){
   ElementBeans elementBeans=locatorMap.get("contract_search");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_contract_search");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【contract_search】元素信息"); return null;}
 }

/***
* 用户组织名称
* @return
* @throws IOException
*/
public  ElementBeans contract_company_name() throws IOException
 {
   if(locatorMap.containsKey("contract_company_name")||locatorMap.containsKey("ios_contract_company_name")){
   ElementBeans elementBeans=locatorMap.get("contract_company_name");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_contract_company_name");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【contract_company_name】元素信息"); return null;}
 }

/***
* 组织架构跳转（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans contract_org() throws IOException
 {
   if(locatorMap.containsKey("contract_org")||locatorMap.containsKey("ios_contract_org")){
   ElementBeans elementBeans=locatorMap.get("contract_org");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_contract_org");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【contract_org】元素信息"); return null;}
 }

/***
* 部门跳转（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans contract_department() throws IOException
 {
   if(locatorMap.containsKey("contract_department")||locatorMap.containsKey("ios_contract_department")){
   ElementBeans elementBeans=locatorMap.get("contract_department");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_contract_department");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【contract_department】元素信息"); return null;}
 }

/***
* 我的好友（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans contract_friends() throws IOException
 {
   if(locatorMap.containsKey("contract_friends")||locatorMap.containsKey("ios_contract_friends")){
   ElementBeans elementBeans=locatorMap.get("contract_friends");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_contract_friends");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【contract_friends】元素信息"); return null;}
 }

/***
* 常用联系人列表
* @return
* @throws IOException
*/
public  ElementBeans contract_friends_common() throws IOException
 {
   if(locatorMap.containsKey("contract_friends_common")||locatorMap.containsKey("ios_contract_friends_common")){
   ElementBeans elementBeans=locatorMap.get("contract_friends_common");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_contract_friends_common");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【contract_friends_common】元素信息"); return null;}
 }
}