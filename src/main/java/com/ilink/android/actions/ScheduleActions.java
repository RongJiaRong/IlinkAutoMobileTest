package com.ilink.android.actions;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementBeans;

import java.io.IOException;


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
                    ElementBeans list = selectParticipantPage.search_participant_list();
                    if (operate.getText(list).contains(searchText)){
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
