package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//工作台首页_对象库类
public class WorkBenchPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(WorkBenchPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   WorkBenchPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 现有组织名称
* @return
* @throws IOException
*/
public  ElementBeans workbench_company_name() throws IOException
 {
   if(locatorMap.containsKey("workbench_company_name")||locatorMap.containsKey("ios_workbench_company_name")){
   ElementBeans elementBeans=locatorMap.get("workbench_company_name");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_company_name");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_company_name】元素信息"); return null;}
 }

/***
* 工作台卡片设置(点击跳转)
* @return
* @throws IOException
*/
public  ElementBeans workbench_card_settings() throws IOException
 {
   if(locatorMap.containsKey("workbench_card_settings")||locatorMap.containsKey("ios_workbench_card_settings")){
   ElementBeans elementBeans=locatorMap.get("workbench_card_settings");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_card_settings");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_card_settings】元素信息"); return null;}
 }

/***
* banner图(点击跳转)
* @return
* @throws IOException
*/
public  ElementBeans workbench_banner() throws IOException
 {
   if(locatorMap.containsKey("workbench_banner")||locatorMap.containsKey("ios_workbench_banner")){
   ElementBeans elementBeans=locatorMap.get("workbench_banner");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_banner");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_banner】元素信息"); return null;}
 }

/***
* 公告通知-全部(点击跳转)
* @return
* @throws IOException
*/
public  ElementBeans workbench_notice_all() throws IOException
 {
   if(locatorMap.containsKey("workbench_notice_all")||locatorMap.containsKey("ios_workbench_notice_all")){
   ElementBeans elementBeans=locatorMap.get("workbench_notice_all");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_notice_all");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_notice_all】元素信息"); return null;}
 }

/***
* 轮播公告通知(点击跳转)
* @return
* @throws IOException
*/
public  ElementBeans workbench_notice_show() throws IOException
 {
   if(locatorMap.containsKey("workbench_notice_show")||locatorMap.containsKey("ios_workbench_notice_show")){
   ElementBeans elementBeans=locatorMap.get("workbench_notice_show");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_notice_show");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_notice_show】元素信息"); return null;}
 }

/***
* 轮播公告通知标题(点击跳转)
* @return
* @throws IOException
*/
public  ElementBeans workbench_notice_title() throws IOException
 {
   if(locatorMap.containsKey("workbench_notice_title")||locatorMap.containsKey("ios_workbench_notice_title")){
   ElementBeans elementBeans=locatorMap.get("workbench_notice_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_notice_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_notice_title】元素信息"); return null;}
 }

/***
* 应用-全部(点击跳转)
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_all() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_all")||locatorMap.containsKey("ios_workbench_applicants_all")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_all");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_all");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_all】元素信息"); return null;}
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

/***
* 更多（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_suggestion_more() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_suggestion_more")||locatorMap.containsKey("ios_workbench_applicants_suggestion_more")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_suggestion_more");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_suggestion_more");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_suggestion_more】元素信息"); return null;}
 }

/***
* 快捷考勤打卡(点击跳转)
* @return
* @throws IOException
*/
public  ElementBeans workbench_attendance_quick_entrance() throws IOException
 {
   if(locatorMap.containsKey("workbench_attendance_quick_entrance")||locatorMap.containsKey("ios_workbench_attendance_quick_entrance")){
   ElementBeans elementBeans=locatorMap.get("workbench_attendance_quick_entrance");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_attendance_quick_entrance");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_attendance_quick_entrance】元素信息"); return null;}
 }

/***
* 快捷考勤打卡按钮
* @return
* @throws IOException
*/
public  ElementBeans workbench_attendance_quick_click_in() throws IOException
 {
   if(locatorMap.containsKey("workbench_attendance_quick_click_in")||locatorMap.containsKey("ios_workbench_attendance_quick_click_in")){
   ElementBeans elementBeans=locatorMap.get("workbench_attendance_quick_click_in");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_attendance_quick_click_in");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_attendance_quick_click_in】元素信息"); return null;}
 }

/***
* 上班打卡时间
* @return
* @throws IOException
*/
public  ElementBeans workbench_attendance_quick_work_begin_time() throws IOException
 {
   if(locatorMap.containsKey("workbench_attendance_quick_work_begin_time")||locatorMap.containsKey("ios_workbench_attendance_quick_work_begin_time")){
   ElementBeans elementBeans=locatorMap.get("workbench_attendance_quick_work_begin_time");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_attendance_quick_work_begin_time");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_attendance_quick_work_begin_time】元素信息"); return null;}
 }

/***
* 上班打卡状态
* @return
* @throws IOException
*/
public  ElementBeans workbench_attendance_quick_work_begin_clink_in_status() throws IOException
 {
   if(locatorMap.containsKey("workbench_attendance_quick_work_begin_clink_in_status")||locatorMap.containsKey("ios_workbench_attendance_quick_work_begin_clink_in_status")){
   ElementBeans elementBeans=locatorMap.get("workbench_attendance_quick_work_begin_clink_in_status");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_attendance_quick_work_begin_clink_in_status");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_attendance_quick_work_begin_clink_in_status】元素信息"); return null;}
 }

/***
* 下班打卡时间
* @return
* @throws IOException
*/
public  ElementBeans workbench_attendance_quick_off_work_time() throws IOException
 {
   if(locatorMap.containsKey("workbench_attendance_quick_off_work_time")||locatorMap.containsKey("ios_workbench_attendance_quick_off_work_time")){
   ElementBeans elementBeans=locatorMap.get("workbench_attendance_quick_off_work_time");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_attendance_quick_off_work_time");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_attendance_quick_off_work_time】元素信息"); return null;}
 }

/***
* 下班打卡状态
* @return
* @throws IOException
*/
public  ElementBeans workbench_attendance_quick_off_work_clink_in_status() throws IOException
 {
   if(locatorMap.containsKey("workbench_attendance_quick_off_work_clink_in_status")||locatorMap.containsKey("ios_workbench_attendance_quick_off_work_clink_in_status")){
   ElementBeans elementBeans=locatorMap.get("workbench_attendance_quick_off_work_clink_in_status");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_attendance_quick_off_work_clink_in_status");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_attendance_quick_off_work_clink_in_status】元素信息"); return null;}
 }

/***
* 全部（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_todo_list_all() throws IOException
 {
   if(locatorMap.containsKey("workbench_todo_list_all")||locatorMap.containsKey("ios_workbench_todo_list_all")){
   ElementBeans elementBeans=locatorMap.get("workbench_todo_list_all");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_todo_list_all");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_todo_list_all】元素信息"); return null;}
 }

/***
* 立即处理（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_todo_list_handle_immediately() throws IOException
 {
   if(locatorMap.containsKey("workbench_todo_list_handle_immediately")||locatorMap.containsKey("ios_workbench_todo_list_handle_immediately")){
   ElementBeans elementBeans=locatorMap.get("workbench_todo_list_handle_immediately");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_todo_list_handle_immediately");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_todo_list_handle_immediately】元素信息"); return null;}
 }

/***
* 展开
* @return
* @throws IOException
*/
public  ElementBeans workbench_todo_list_expand() throws IOException
 {
   if(locatorMap.containsKey("workbench_todo_list_expand")||locatorMap.containsKey("ios_workbench_todo_list_expand")){
   ElementBeans elementBeans=locatorMap.get("workbench_todo_list_expand");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_todo_list_expand");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_todo_list_expand】元素信息"); return null;}
 }

/***
* 查看更多
* @return
* @throws IOException
*/
public  ElementBeans workbench_todo_list_check_more() throws IOException
 {
   if(locatorMap.containsKey("workbench_todo_list_check_more")||locatorMap.containsKey("ios_workbench_todo_list_check_more")){
   ElementBeans elementBeans=locatorMap.get("workbench_todo_list_check_more");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_todo_list_check_more");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_todo_list_check_more】元素信息"); return null;}
 }
}