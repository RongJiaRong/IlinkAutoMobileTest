package com.ilink.android.pageObject;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
import com.crazy.auto.utils.XmlReadUtil;
import com.crazy.auto.utils.YamlReadUtil;

import java.util.HashMap;

/**
 * @author rongjia
 *
 */
public class BasePage {

	public DriverBase driver;
	public String platform;
	public String pagePath="src/main/resources/pageObjectFiles/yml/UILibrary-ilinkOfAndroid.yml";
	HashMap<String, ElementBeans> locatorMap;//{"username":elementbeans,"password":elementbeans,"loginBtn":elementbeans}

	public BasePage(DriverBase driver) {
		this.driver = driver;
		this.getLocatorMap();
	}

	public void getLocatorMap() {
		XmlReadUtil xmlReadUtil = new XmlReadUtil();
		YamlReadUtil yamlReadUtil = new YamlReadUtil();
		try {

			if (pagePath.contains(".xml")) {
				locatorMap = xmlReadUtil.readXMLDocument(pagePath, this.getClass().getCanonicalName());
			} else if (pagePath.contains(".yml")) {
				locatorMap = yamlReadUtil.getLocatorMap(pagePath, this.getClass().getCanonicalName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	
//	
//	public MobileElement getElement(String locatorValue){
//		//menu_mine
//		if(platform.equalsIgnoreCase("android")){
//			//driver.findElement(By.xpath("com.example.tiantang:id/iv_bookshelf_header"))
//			//locator.getByLocator("menu_mine")==By.xpath("//*[@text='我的']/preceding-sibling::*[1]")
//			return driver.findElement(locator.getByLocator(locatorValue));
//		}else{
//			return driver.findElement(locator.getByLocator("ios_"+locatorValue));
//		}
//	}
//	
//	public List<MobileElement> getElements(String locatorValue){
//		if(platform.equalsIgnoreCase("android")){
//			return driver.findElements(locator.getByLocator(locatorValue));
//		}else{
//			return driver.findElements(locator.getByLocator("ios_"+locatorValue));
//		}
//	}

	public static void main(String[] args) {

	}

}
