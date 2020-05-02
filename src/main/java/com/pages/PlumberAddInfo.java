package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class PlumberAddInfo extends TestBase {

	@FindBy(xpath = "//div[text()='Is there anything else that the Plumber needs to know?']")
	WebElement plumberAddInfoTitle;

	@FindBy(xpath = "//textarea[@data-test='step_4']")
	WebElement optionalTextBox;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextInPlumberAddInfoPage;

	public PlumberAddInfo() {
		PageFactory.initElements(driver, this);
	}

	public void getplumberAdditionalInfoPage(String data) {
		if (plumberAddInfoTitle.isDisplayed()) {
			optionalTextBox.sendKeys(data);
			nextInPlumberAddInfoPage.click();
		}
	}

}
