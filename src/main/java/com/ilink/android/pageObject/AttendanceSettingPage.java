package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//考勤设置页_对象库类
public class AttendanceSettingPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(AttendanceSettingPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   AttendanceSettingPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 考勤设置标题
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_settings_title() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_settings_title")||locatorMap.containsKey("ios_workbench_applicants_attendance_settings_title")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_settings_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_settings_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_settings_title】元素信息"); return null;}
 }

/***
* 快捷打卡方式选择(点击跳转)
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_settings_quick_clock() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_settings_quick_clock")||locatorMap.containsKey("ios_workbench_applicants_attendance_settings_quick_clock")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_settings_quick_clock");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_settings_quick_clock");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_settings_quick_clock】元素信息"); return null;}
 }
}