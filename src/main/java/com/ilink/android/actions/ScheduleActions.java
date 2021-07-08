package com.ilink.android.actions;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import java.io.IOException;
import java.util.List;


public class ScheduleActions extends PageBaseActions{

    public ScheduleActions(DriverBase driver) {
        super(driver);
    }

    public void scheduleCreate(String scheduleName,String searchText,String address) throws IOException {
       operate.click(homePage.schedule_page()); // 点击日程tab
       operate.click(schedulePage.new_schedule()); //在日程首页点击创建日程
        driver.sleep(2); // 等待2秒
        if (operate.getText(scheduleCreatePage.schedule_create_tittle()).equals("创建日程")){
            operate.sendKeys(scheduleCreatePage.schedule_title_input(),scheduleName);// 输入日程，会议标题
            operate.click(scheduleCreatePage.schedule_add_users());//点击添加参与人，跳转至参与人页面
            driver.sleep(2);
            if (operate.getText(reviewSelectParticipantPage.review_participant_title()).equals("选择参与人")){
                operate.click(reviewSelectParticipantPage.review_participant_add());
                driver.sleep(3);
                if (operate.getText(selectParticipantPage.select_participant_title()).equals("选择联系人")){
                    operate.click(selectParticipantPage.select_participant_search());
                    operate.sendKeys(selectParticipantPage.select_participant_search(),searchText);
                    driver.sleep(5);
//                   List<WebElement> list1 = driver.findElements(selectParticipantPage.select_participant_result());
//                    System.out.println(list1.get(0));
//                    for (WebElement element:list1) {
//                        if(element.getText().contains(searchText)){
//                            element.click();
//                        }
//                    }

                    if (driver.getPageSource().contains(searchText)){
                        operate.click(selectParticipantPage.select_participant_result());
                        driver.sleep(2);
                    }else{
                        System.out.println("搜索到的联系人为空");
                    }
                    operate.click(selectParticipantPage.select_participant_submit());
                }else{
                    System.out.println("选择联系人页出错");

                }
            }else{
                System.out.println("查看选择参与人页出错");
            }
            operate.sendKeys(scheduleCreatePage.schedule_add_address(),address);
            operate.click(scheduleCreatePage.schedule_confirm());
        }else{
            System.out.println("进去创建日程页出错");
        }


    }
}
