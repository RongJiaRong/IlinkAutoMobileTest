package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//考勤打卡首页_对象库类
public class AttendanceHomePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(AttendanceHomePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   AttendanceHomePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 考勤打卡首页标题
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_title() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_title")||locatorMap.containsKey("ios_workbench_applicants_attendance_title")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_title】元素信息"); return null;}
 }

/***
* 考勤组
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_group() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_group")||locatorMap.containsKey("ios_workbench_applicants_attendance_group")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_group");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_group");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_group】元素信息"); return null;}
 }

/***
* 上班时间
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_work_on_time() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_work_on_time")||locatorMap.containsKey("ios_workbench_applicants_attendance_work_on_time")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_work_on_time");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_work_on_time");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_work_on_time】元素信息"); return null;}
 }

/***
* 下班时间
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_work_off_time() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_work_off_time")||locatorMap.containsKey("ios_workbench_applicants_attendance_work_off_time")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_work_off_time");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_work_off_time");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_work_off_time】元素信息"); return null;}
 }

/***
* 上班打卡时间
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_work_on_clock_time() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_work_on_clock_time")||locatorMap.containsKey("ios_workbench_applicants_attendance_work_on_clock_time")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_work_on_clock_time");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_work_on_clock_time");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_work_on_clock_time】元素信息"); return null;}
 }

/***
* 下班打卡时间
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_work_off_clock_time() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_work_off_clock_time")||locatorMap.containsKey("ios_workbench_applicants_attendance_work_off_clock_time")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_work_off_clock_time");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_work_off_clock_time");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_work_off_clock_time】元素信息"); return null;}
 }

/***
* 打卡按钮
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_clock_in() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_clock_in")||locatorMap.containsKey("ios_workbench_applicants_attendance_clock_in")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_clock_in");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_clock_in");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_clock_in】元素信息"); return null;}
 }

/***
* 打卡按钮显示文本
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_clock_in_text() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_clock_in_text")||locatorMap.containsKey("ios_workbench_applicants_attendance_clock_in_text")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_clock_in_text");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_clock_in_text");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_clock_in_text】元素信息"); return null;}
 }

/***
* 打卡按钮显示时间
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_clock_in_time() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_clock_in_time")||locatorMap.containsKey("ios_workbench_applicants_attendance_clock_in_time")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_clock_in_time");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_clock_in_time");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_clock_in_time】元素信息"); return null;}
 }

/***
* 重新定位（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_re_locate() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_re_locate")||locatorMap.containsKey("ios_workbench_applicants_attendance_re_locate")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_re_locate");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_re_locate");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_re_locate】元素信息"); return null;}
 }

/***
* 打卡tab
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_clock_in_tab() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_clock_in_tab")||locatorMap.containsKey("ios_workbench_applicants_attendance_clock_in_tab")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_clock_in_tab");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_clock_in_tab");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_clock_in_tab】元素信息"); return null;}
 }

/***
* 统计tab（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_statistics_tab() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_statistics_tab")||locatorMap.containsKey("ios_workbench_applicants_attendance_statistics_tab")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_statistics_tab");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_statistics_tab");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_statistics_tab】元素信息"); return null;}
 }

/***
* 设置tab（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_settings_tab() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_settings_tab")||locatorMap.containsKey("ios_workbench_applicants_attendance_settings_tab")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_settings_tab");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_settings_tab");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_settings_tab】元素信息"); return null;}
 }
}