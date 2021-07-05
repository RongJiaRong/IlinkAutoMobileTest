package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//考勤统计汇总页_对象库类
public class AttendanceSumPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(AttendanceSumPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   AttendanceSumPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 周&月
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_attendance_sum_text() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_attendance_sum_text")||locatorMap.containsKey("ios_workbench_applicants_attendance_sum_text")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_attendance_sum_text");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_attendance_sum_text");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_attendance_sum_text】元素信息"); return null;}
 }
}