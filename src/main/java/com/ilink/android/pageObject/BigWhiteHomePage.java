package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//大白关爱首页_对象库类
public class BigWhiteHomePage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(BigWhiteHomePage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   BigWhiteHomePage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 大白关爱标题
* @return
* @throws IOException
*/
public  ElementBeans workbench_applicants_bigwhite_title() throws IOException
 {
   if(locatorMap.containsKey("workbench_applicants_bigwhite_title")||locatorMap.containsKey("ios_workbench_applicants_bigwhite_title")){
   ElementBeans elementBeans=locatorMap.get("workbench_applicants_bigwhite_title");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_workbench_applicants_bigwhite_title");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【workbench_applicants_bigwhite_title】元素信息"); return null;}
 }
}