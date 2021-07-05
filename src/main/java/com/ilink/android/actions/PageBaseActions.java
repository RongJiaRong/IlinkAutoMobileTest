package com.ilink.android.actions;

import com.crazy.auto.driver.DriverBase;
import com.crazy.auto.element.ElementOperate;
import com.ilink.android.pageObject.*;
import com.ilink.data.IlinkToast;
import io.appium.java_client.HasOnScreenKeyboard;

public class PageBaseActions {
    public ElementOperate operate;//元素操作对象
    public DriverBase driver;//driver对象
    public IlinkToast ilinkToast; //Toast 初始化
    public LoginPage loginPage;
    public PermisionAskPage permisionAskPage;
    public ApplicanceEditPage applicanceEditPage;
    public ApplicanceHomePage applicanceHomePage;
    public AttendanceHomePage attendanceHomePage;
    public AttendanceQuickClockinPage attendanceQuickClockinPage;
    public AttendanceReLocatePage attendanceReLocatePage;
    public AttendanceSettingPage attendanceSettingPage;
    public AttendanceStatisticPage attendanceStatisticPage;
    public AttendanceSumPage attendanceSumPage;
    public BigWhiteHomePage bigWhiteHomePage;
    public ContractFriendsPage contractFriendsPage;
    public ContractHomePage contractHomePage;
    public ContractOrgPage contractOrgPage;
    public FeedbackHomePage feedbackHomePage;
    public FillCardHomePage fillCardHomePage;
    public HomePage homePage;
    public LeaveHomePage leaveHomePage;
    public MeetingHomePage meetingHomePage;
    public NoticeHomePage noticeHomePage;
    public OTApplyHomePage otApplyHomePage;
    public OTReplyHomePage otReplyHomePage;
    public ReviewSelectParticipantPage reviewSelectParticipantPage;
    public ScheduleAlertPage scheduleAlertPage;
    public ScheduleCreatePage scheduleCreatePage;
    public SchedulePage schedulePage;
    public ScheduleReminderPage scheduleReminderPage;
    public SearchHomePage searchHomePage;
    public SelectedParticipantPage selectedParticipantPage;
    public SelectParticipantByFrameworkPage selectParticipantByFrameworkPage;
    public SelectParticipantByFriendsPage selectParticipantByFriendsPage;
    public SelectParticipantPage selectParticipantPage;
    public ToDoHomePage toDoHomePage;
    public WorkBenchPage workBenchPage;
    public WorkBenchSettingsPage workBenchSettingsPage;
    public MeetingInitPage meetingInitPage;
    public InMeetingPage inMeetingPage;
    public MeetingEndPage meetingEndPage;


    public PageBaseActions(DriverBase driver) {
        this.driver = driver;
        this.operate = new ElementOperate(driver);
        this.loginPage = new LoginPage(driver);
        this.permisionAskPage = new PermisionAskPage(driver);
        this.applicanceEditPage = new ApplicanceEditPage(driver);
        this.applicanceHomePage = new ApplicanceHomePage(driver);
        this.attendanceHomePage = new AttendanceHomePage(driver);
        this.attendanceQuickClockinPage = new AttendanceQuickClockinPage(driver);
        this.attendanceReLocatePage =new AttendanceReLocatePage(driver);
        this.attendanceSettingPage = new AttendanceSettingPage(driver);
        this.attendanceStatisticPage = new AttendanceStatisticPage(driver);
        this.attendanceSumPage = new AttendanceSumPage(driver);
        this.bigWhiteHomePage = new BigWhiteHomePage(driver);
        this.contractFriendsPage = new ContractFriendsPage(driver);
        this.contractHomePage=  new ContractHomePage(driver);
        this.contractOrgPage =  new ContractOrgPage(driver);
        this.feedbackHomePage = new FeedbackHomePage(driver);
        this.fillCardHomePage = new FillCardHomePage(driver);
        this.homePage = new HomePage(driver);
        this.leaveHomePage = new LeaveHomePage(driver);
        this.meetingHomePage = new MeetingHomePage(driver);
        this.noticeHomePage = new NoticeHomePage(driver);
        this.otApplyHomePage = new OTApplyHomePage(driver);
        this.otReplyHomePage = new OTReplyHomePage(driver);
        this.reviewSelectParticipantPage= new ReviewSelectParticipantPage(driver);
        this.scheduleAlertPage =new ScheduleAlertPage(driver);
        this.scheduleCreatePage = new ScheduleCreatePage(driver);
        this.schedulePage = new SchedulePage(driver);
        this.scheduleReminderPage = new ScheduleReminderPage(driver);
        this.searchHomePage = new SearchHomePage(driver);
        this.selectedParticipantPage =new SelectedParticipantPage(driver);
        this.selectParticipantByFrameworkPage = new SelectParticipantByFrameworkPage(driver);
        this.selectParticipantByFriendsPage = new SelectParticipantByFriendsPage(driver);
        this.selectParticipantPage = new SelectParticipantPage(driver);
        this.toDoHomePage = new ToDoHomePage(driver);
        this .workBenchPage = new WorkBenchPage(driver);
        this.workBenchSettingsPage = new WorkBenchSettingsPage(driver);
        this.meetingInitPage = new MeetingInitPage(driver);
        this.inMeetingPage = new InMeetingPage(driver);
        this.meetingEndPage = new MeetingEndPage(driver);



    }
}
