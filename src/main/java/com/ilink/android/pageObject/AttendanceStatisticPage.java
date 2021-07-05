package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//考勤统计页_对象库类
public class AttendanceStatisticPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(AttendanceStatisticPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   AttendanceStatisticPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 考勤统计页标题
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_statistic_title() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_statistic_title")||locatorMap.containsKey("ios_workbench_applicants_attendance_statistic_title")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_statistic_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_statistic_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_statistic_title】元素信息"); return null;}
 }

/***
* 考勤汇总查看(点击跳转)
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_statistic() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_statistic")||locatorMap.containsKey("ios_workbench_applicants_attendance_statistic")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_statistic");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_statistic");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_statistic】元素信息"); return null;}
 }

/***
* 考勤-处理异常
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_exception_handle() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_exception_handle")||locatorMap.containsKey("ios_workbench_applicants_attendance_exception_handle")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_exception_handle");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_exception_handle");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_exception_handle】元素信息"); return null;}
 }

/***
* 考勤-处理异常-补卡申请（点击跳转）
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_fillcard() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_fillcard")||locatorMap.containsKey("ios_workbench_applicants_attendance_fillcard")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_fillcard");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_fillcard");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_fillcard】元素信息"); return null;}
 }

/***
* 考勤-处理异常-取消
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_cancel() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_cancel")||locatorMap.containsKey("ios_workbench_applicants_attendance_cancel")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_cancel");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_cancel");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_cancel】元素信息"); return null;}
 }
}