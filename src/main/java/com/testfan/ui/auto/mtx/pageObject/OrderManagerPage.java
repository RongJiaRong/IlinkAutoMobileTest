package com.testfan.ui.auto.mtx.pageObject;
import java.io.IOException;
import org.apache.log4j.Logger;
import java.io.InputStream;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//订单管理页_对象库类
public class OrderManagerPage extends BasePage {
private static Logger log = Logger.getLogger(OrderManagerPage.class);//用于eclipse工程内运行查找对象库文件路径
 public   OrderManagerPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);

}
/***
* 申请售后
* @return
* @throws IOException
*/
public  ElementBeans application() throws IOException
 {
   if(locatorMap.containsKey("application")||locatorMap.containsKey("ios_application")){
   ElementBeans elementBeans=locatorMap.get("application");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_application");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【application】元素信息"); return null;}
 }

/***
* 退款/退货
* @return
* @throws IOException
*/
public  ElementBeans refundOrgoods() throws IOException
 {
   if(locatorMap.containsKey("refundOrgoods")||locatorMap.containsKey("ios_refundOrgoods")){
   ElementBeans elementBeans=locatorMap.get("refundOrgoods");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_refundOrgoods");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【refundOrgoods】元素信息"); return null;}
 }

/***
* 货到付款
* @return
* @throws IOException
*/
public  ElementBeans sureBtn() throws IOException
 {
   if(locatorMap.containsKey("sureBtn")||locatorMap.containsKey("ios_sureBtn")){
   ElementBeans elementBeans=locatorMap.get("sureBtn");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_sureBtn");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【sureBtn】元素信息"); return null;}
 }

/***
* 评价
* @return
* @throws IOException
*/
public  ElementBeans evaluate() throws IOException
 {
   if(locatorMap.containsKey("evaluate")||locatorMap.containsKey("ios_evaluate")){
   ElementBeans elementBeans=locatorMap.get("evaluate");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_evaluate");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【evaluate】元素信息"); return null;}
 }

/***
* 退款/售后标签
* @return
* @throws IOException
*/
public  ElementBeans refund() throws IOException
 {
   if(locatorMap.containsKey("refund")||locatorMap.containsKey("ios_refund")){
   ElementBeans elementBeans=locatorMap.get("refund");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_refund");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【refund】元素信息"); return null;}
 }

/***
* 订单管理菜单
* @return
* @throws IOException
*/
public  ElementBeans ordermanager() throws IOException
 {
   if(locatorMap.containsKey("ordermanager")||locatorMap.containsKey("ios_ordermanager")){
   ElementBeans elementBeans=locatorMap.get("ordermanager");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_ordermanager");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【ordermanager】元素信息"); return null;}
 }
}