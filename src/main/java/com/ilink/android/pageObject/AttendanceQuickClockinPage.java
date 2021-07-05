package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//快捷打卡页_对象库类
public class AttendanceQuickClockinPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(AttendanceQuickClockinPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   AttendanceQuickClockinPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 快捷打卡标题
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_quick_clock_title() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_quick_clock_title")||locatorMap.containsKey("ios_workbench_applicants_attendance_quick_clock_title")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_quick_clock_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_quick_clock_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_quick_clock_title】元素信息"); return null;}
 }

/***
* 快捷打卡开关
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_quick_clock_switch() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_quick_clock_switch")||locatorMap.containsKey("ios_workbench_applicants_attendance_quick_clock_switch")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_quick_clock_switch");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_quick_clock_switch");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_quick_clock_switch】元素信息"); return null;}
 }

/***
* 上班选择
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_quick_clock_work_on_choose() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_quick_clock_work_on_choose")||locatorMap.containsKey("ios_workbench_applicants_attendance_quick_clock_work_on_choose")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_quick_clock_work_on_choose");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_quick_clock_work_on_choose");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_quick_clock_work_on_choose】元素信息"); return null;}
 }

/***
* 下班选择
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_quick_clock_work_off_choose() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_quick_clock_work_off_choose")||locatorMap.containsKey("ios_workbench_applicants_attendance_quick_clock_work_off_choose")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_quick_clock_work_off_choose");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_quick_clock_work_off_choose");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_quick_clock_work_off_choose】元素信息"); return null;}
 }

/***
* 提醒闹钟
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_quick_clock_alarm() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_quick_clock_alarm")||locatorMap.containsKey("ios_workbench_applicants_attendance_quick_clock_alarm")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_quick_clock_alarm");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_quick_clock_alarm");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_quick_clock_alarm】元素信息"); return null;}
 }

/***
* 极速打卡
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_quick_clock_fast() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_quick_clock_fast")||locatorMap.containsKey("ios_workbench_applicants_attendance_quick_clock_fast")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_quick_clock_fast");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_quick_clock_fast");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_quick_clock_fast】元素信息"); return null;}
 }

/***
* 开始时间选择
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_quick_clock_start() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_quick_clock_start")||locatorMap.containsKey("ios_workbench_applicants_attendance_quick_clock_start")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_quick_clock_start");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_quick_clock_start");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_quick_clock_start】元素信息"); return null;}
 }

/***
* 时间选择列表
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_quick_clock_time_list() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_quick_clock_time_list")||locatorMap.containsKey("ios_workbench_applicants_attendance_quick_clock_time_list")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_quick_clock_time_list");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_quick_clock_time_list");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_quick_clock_time_list】元素信息"); return null;}
 }

/***
* 结束时间选择
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_quick_clock_end() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_quick_clock_end")||locatorMap.containsKey("ios_workbench_applicants_attendance_quick_clock_end")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_quick_clock_end");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_quick_clock_end");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_quick_clock_end】元素信息"); return null;}
 }

/***
* 声音震动提醒
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_quick_clock_sound_remind() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_quick_clock_sound_remind")||locatorMap.containsKey("ios_workbench_applicants_attendance_quick_clock_sound_remind")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_quick_clock_sound_remind");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_quick_clock_sound_remind");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_quick_clock_sound_remind】元素信息"); return null;}
 }
}