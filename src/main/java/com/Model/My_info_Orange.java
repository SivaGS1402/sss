package com.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_info_Orange {

	private  WebDriver driver;

	@FindBy(xpath = "//*[text()='My Info']")
	private WebElement myInfoBtn;
	
	@FindBy(xpath = "//*[@placeholder='First Name']")
	private WebElement firstName;

	@FindBy(xpath = "//*[@name='middleName']")
	private WebElement middleName;

	@FindBy(xpath = "//*[@name='lastName']")
	private WebElement lastName;

	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
	private WebElement nickName;

	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")
	private WebElement employeeID;

	@FindBy(xpath = "(//label[text()='Other Id']/following::input)[1]")
	private WebElement otherId;

	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input" )
	private WebElement drivervLicenseNum;

	@FindBy(xpath = "(//label[text()='License Expiry Date']/following::input)[1]")
	private WebElement licenseExpDate;
	
	@FindBy(xpath = "//div[text()='16']")
	private WebElement selectExpDate;

	@FindBy(xpath = "(//label[text()='SSN Number']/following::input)[1]")
	private WebElement ssnNumber;

	@FindBy(xpath = "(//label[text()='SIN Number']/following::input)[1]")
	private WebElement sinNumber;

	@FindBy(xpath = "(//*[@class='oxd-select-text-input'])[1]")
	private WebElement Nationality;

	@FindBy(xpath = "//*[text()='Indian']")
	private WebElement selectIndian;

	@FindBy(xpath = "(//*[@class='oxd-select-text-input'])[2]")
	private WebElement maritalStatus;

	@FindBy(xpath = "//*[text()='Married']")
	private WebElement selectMarried;

	@FindBy(xpath = "(//label[text()='Date of Birth']/following::input)[1]")
	private WebElement dOB;
	
	@FindBy(xpath = "//*[text()='15']")
	private WebElement selectdOB;


	@FindBy(xpath = "//label[text()='Male']")
	private WebElement genderBtn;

	@FindBy(xpath = "(//label[text()='Military Service']/following::input)[1]")
	private WebElement militarySer;

	@FindBy(xpath = "(//i[contains(@class,'oxd-icon bi-check')])[1]")
	private WebElement smoke;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement saveSub;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
	private WebElement bloodGrp;

	@FindBy(xpath = "//*[text()='AB+']")
	private WebElement selectbloodGrp;

	@FindBy(xpath = "(//button[text()=' Save '])[2]")
	private WebElement saveSub1;
	
	@FindBy(xpath = "(//i[contains(@class,'oxd-icon bi-caret-down-fill')])[1]")
	private WebElement logout;
	
	@FindBy(xpath = "//*[text()='Logout']")
	private WebElement logoutBtn;
	
	public WebElement getSelectdOB() {
		return selectdOB;
	}
	public void setSelectdOB(WebElement selectdOB) {
		this.selectdOB = selectdOB;
	}
	

	public WebElement getSelectExpDate() {
		return selectExpDate;
	}
	public void setSelectExpDate(WebElement selectExpDate) {
		this.selectExpDate = selectExpDate;
	}
	public WebElement getSelectbloodGrp() {
		return selectbloodGrp;
	}
	public void setSelectbloodGrp(WebElement selectbloodGrp) {
		this.selectbloodGrp = selectbloodGrp;
	}


	public WebElement getLogout() {
		return logout;
	}
	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	public void setLogoutBtn(WebElement logoutBtn) {
		this.logoutBtn = logoutBtn;
	}
	public WebElement getMyInfoBtn() {
		return myInfoBtn;
	}
	public WebElement getSelectMarried() {
		return selectMarried;
	}
	public void setSelectMarried(WebElement selectMarried) {
		this.selectMarried = selectMarried;
	}
	public WebElement getSelectIndian() {
		return selectIndian;
	}

	public void setSelectIndian(WebElement selectIndian) {
		this.selectIndian = selectIndian;
	}


	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getNickName() {
		return nickName;
	}

	public WebElement getDrivervLicenseNum() {
		return drivervLicenseNum;
	}

	public void setDrivervLicenseNum(WebElement drivervLicenseNum) {
		this.drivervLicenseNum = drivervLicenseNum;
	}

	public void setMyInfoBtn(WebElement myInfoBtn) {
		this.myInfoBtn = myInfoBtn;
	}

	public void setMiddleName(WebElement middleName) {
		this.middleName = middleName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public void setNickName(WebElement nickName) {
		this.nickName = nickName;
	}

	public void setEmployeeID(WebElement employeeID) {
		this.employeeID = employeeID;
	}

	public void setOtherId(WebElement otherId) {
		this.otherId = otherId;
	}

	public WebElement getEmployeeID() {
		return employeeID;
	}

	public WebElement getOtherId() {
		return otherId;
	}

	public WebElement getDriervLicenseNum() {
		return drivervLicenseNum;
	}
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public void setDriervLicenseNum(WebElement driervLicenseNum) {
		this.drivervLicenseNum = driervLicenseNum;
	}

	public WebElement getLicenseExpDate() {
		return licenseExpDate;
	}

	public void setLicenseExpDate(WebElement licenseExpDate) {
		this.licenseExpDate = licenseExpDate;
	}

	public WebElement getSsnNumber() {
		return ssnNumber;
	}

	public void setSsnNumber(WebElement ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

	public WebElement getSinNumber() {
		return sinNumber;
	}

	public void setSinNumber(WebElement sinNumber) {
		this.sinNumber = sinNumber;
	}

	public WebElement getNationality() {
		return Nationality;
	}

	public void setNationality(WebElement nationality) {
		Nationality = nationality;
	}

	public WebElement getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(WebElement maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public WebElement getdOB() {
		return dOB;
	}

	public void setdOB(WebElement dOB) {
		this.dOB = dOB;
	}

	public WebElement getGenderBtn() {
		return genderBtn;
	}

	public void setGenderBtn(WebElement genderBtn) {
		this.genderBtn = genderBtn;
	}

	public WebElement getMilitarySer() {
		return militarySer;
	}

	public void setMilitarySer(WebElement militarySer) {
		this.militarySer = militarySer;
	}

	public WebElement getSmoke() {
		return smoke;
	}

	public void setSmoke(WebElement smoke) {
		this.smoke = smoke;
	}

	public WebElement getSaveSub() {
		return saveSub;
	}

	public void setSaveSub(WebElement saveSub) {
		this.saveSub = saveSub;
	}

	public WebElement getBloodGrp() {
		return bloodGrp;
	}

	public void setBloodGrp(WebElement bloodGrp) {
		this.bloodGrp = bloodGrp;
	}

	public WebElement getSaveSub1() {
		return saveSub1;
	}

	public void setSaveSub1(WebElement saveSub1) {
		this.saveSub1 = saveSub1;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void enterFirstName() {
		Actions action1 = new Actions(driver);
		action1.doubleClick(firstName).perform();

	}


	public My_info_Orange(WebDriver abc){
		driver= abc;
		PageFactory.initElements(driver, this);

	}
}