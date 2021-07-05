package com.crazy.auto.test;

import com.crazy.auto.driver.AppiumServers;
import com.crazy.auto.driver.CrazyMobileDriver;
import com.crazy.auto.element.ElementOperate;
import com.crazy.auto.utils.ProUtil;
import com.ilink.android.actions.AudioAndVideoMeetingActions;
import com.ilink.android.actions.LoginActions;
import com.ilink.android.actions.ScheduleActions;
import com.mtx.ui.auto.douban.pageObject.HomePage;
import com.mtx.ui.auto.douban.pageObject.PersonInoPage;
import org.apache.log4j.Logger;
import org.testng.annotations.*;

public class IlinkTestForAndroidBase extends TestDriverBase{
    private static Logger log = Logger.getLogger(IlinkTestForAndroidBase.class);
    //public DriverBase driver;
    public Assertion assertion;//咱们封装的断言
    public ElementOperate operate;
    public AppiumServers appiumServers;
    public LoginActions loginActions;
    public ScheduleActions scheduleActions;
    public ProUtil proUtil;
    public AudioAndVideoMeetingActions audioAndVideoMeetingActions;


//    @Parameters({"port"})
//    @BeforeTest
//    public void startServer(String port) {
//        appiumServers=new AppiumServers();
//        appiumServers.startServer(port);
//    }
    @Parameters({ "platform","udid","port","chromedriverpath"})
    @BeforeClass
    public void init(String platform, String udid, String port,String chromedriverpath) {
        driver=new CrazyMobileDriver(platform, udid, port,chromedriverpath);
        proUtil = new ProUtil("/Users/lanylanyouou/Documents/AutoTest(iLink)/CrazyAutoTest1/src/main/resources/ilinkAssersionPros/ilinkUIdata.properties");
        assertion=new Assertion(driver);
        operate=new ElementOperate(driver);
        loginActions = new LoginActions(driver);
        scheduleActions = new ScheduleActions(driver);
        audioAndVideoMeetingActions = new AudioAndVideoMeetingActions(driver);
        driver.implicitlyWaitDefault();
        log.info("app启动成功");
    }


    @AfterMethod(enabled = false)
    public void backHome() throws Exception {
        if(driver.platform.equalsIgnoreCase("android")) {
            driver.startActivity("com.lanyou.base.ilink", "com.lanyou.base.ilink.activity.login.SplashActivity");
        }else {
            HomePage homePage=new HomePage(driver);
            PersonInoPage personInoPage=new PersonInoPage(driver);
            while (!operate.isElementExist(homePage.mine_menu())) {
                operate.click(personInoPage.back());
            }
            //operate.activateApp("com.douban.frodo");只能在ios应用没有启动的时候才可以启动他
            //driver.findElement(homePage.)
        }

    }
    @AfterClass(enabled = false)
    public void quit() {
        driver.quit();//测试执行完成以后关闭浏览器
    }
//    @AfterTest
//    public void stopServer() {
//
//        appiumServers.stop();
//    }

}
