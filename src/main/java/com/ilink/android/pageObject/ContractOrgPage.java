package com.ilink.android.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
//组织架构页_对象库类
public class ContractOrgPage extends BasePage {
//用于eclipse工程内运行查找对象库文件路径
private static Logger log = Logger.getLogger(ContractOrgPage.class);private String path="src/main/resources/pageObjectFiles/yml/";
 public   ContractOrgPage(DriverBase driver) {
//工程内读取对象库文件
	super(driver);
}
/***
* 架构标题
* @return
* @throws IOException
*/
public  ElementBeans contract_org_tittle() throws IOException
 {
   if(locatorMap.containsKey("contract_org_tittle")||locatorMap.containsKey("ios_contract_org_tittle")){
   ElementBeans elementBeans=locatorMap.get("contract_org_tittle");
       if(driver.platform.equalsIgnoreCase("ios")){
           elementBeans=locatorMap.get("ios_contract_org_tittle");
       }
   return elementBeans;
 }
   else{
 log.error("在"+pagePath+"中不存在【contract_org_tittle】元素信息"); return null;}
 }
}