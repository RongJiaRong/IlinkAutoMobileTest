package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//应用中心首页_对象库类
public class ApplicanceHomePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(ApplicanceHomePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   ApplicanceHomePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 应用中心标题
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_center_title() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_center_title")||locatorMap.containsKey("ios_workbench_applicants_center_title")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_center_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_center_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_center_title】元素信息"); return null;}
 }

/***
* 编辑（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_center_edit() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_center_edit")||locatorMap.containsKey("ios_workbench_applicants_center_edit")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_center_edit");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_center_edit");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_center_edit】元素信息"); return null;}
 }

/***
* 搜索
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_center_search() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_center_search")||locatorMap.containsKey("ios_workbench_applicants_center_search")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_center_search");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_center_search");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_center_search】元素信息"); return null;}
 }

/***
* 考勤打卡（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance")||locatorMap.containsKey("ios_workbench_applicants_attendance")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance】元素信息"); return null;}
 }

/***
* 大白关爱（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_bigwhite() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_bigwhite")||locatorMap.containsKey("ios_workbench_applicants_bigwhite")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_bigwhite");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_bigwhite");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_bigwhite】元素信息"); return null;}
 }

/***
* 补卡申请（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_card_replacement() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_card_replacement")||locatorMap.containsKey("ios_workbench_applicants_card_replacement")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_card_replacement");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_card_replacement");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_card_replacement】元素信息"); return null;}
 }

/***
* 加班申请（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_ot() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_ot")||locatorMap.containsKey("ios_workbench_applicants_ot")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_ot");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_ot");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_ot】元素信息"); return null;}
 }

/***
* 加班反馈（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_ot_feedback() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_ot_feedback")||locatorMap.containsKey("ios_workbench_applicants_ot_feedback")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_ot_feedback");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_ot_feedback");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_ot_feedback】元素信息"); return null;}
 }

/***
* 请假申请（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_leave() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_leave")||locatorMap.containsKey("ios_workbench_applicants_leave")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_leave");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_leave");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_leave】元素信息"); return null;}
 }

/***
* 通知公告（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_notice() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_notice")||locatorMap.containsKey("ios_workbench_applicants_notice")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_notice");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_notice");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_notice】元素信息"); return null;}
 }

/***
* 员工助手（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_staff_assistant() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_staff_assistant")||locatorMap.containsKey("ios_workbench_applicants_staff_assistant")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_staff_assistant");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_staff_assistant");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_staff_assistant】元素信息"); return null;}
 }

/***
* PQC（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_pqc() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_pqc")||locatorMap.containsKey("ios_workbench_applicants_pqc")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_pqc");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_pqc");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_pqc】元素信息"); return null;}
 }

/***
* 联友易报（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_reimbursement() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_reimbursement")||locatorMap.containsKey("ios_workbench_applicants_reimbursement")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_reimbursement");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_reimbursement");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_reimbursement】元素信息"); return null;}
 }

/***
* 北极星OKR（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_okr() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_okr")||locatorMap.containsKey("ios_workbench_applicants_okr")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_okr");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_okr");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_okr】元素信息"); return null;}
 }

/***
* eLIAS（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_elias() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_elias")||locatorMap.containsKey("ios_workbench_applicants_elias")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_elias");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_elias");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_elias】元素信息"); return null;}
 }

/***
* 魔学院（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_school() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_school")||locatorMap.containsKey("ios_workbench_applicants_school")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_school");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_school");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_school】元素信息"); return null;}
 }

/***
* 意见反馈（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_suggestion_feedback() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_suggestion_feedback")||locatorMap.containsKey("ios_workbench_applicants_suggestion_feedback")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_suggestion_feedback");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_suggestion_feedback");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_suggestion_feedback】元素信息"); return null;}
 }
}