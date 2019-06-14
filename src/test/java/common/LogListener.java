package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

/**
 * Created by wangdx on 2019/6/14.
 */
public class LogListener implements WebDriverEventListener {


	public void beforeAlertAccept(WebDriver webDriver) {

	}

	public void afterAlertAccept(WebDriver webDriver) {

	}

	public void afterAlertDismiss(WebDriver webDriver) {

	}

	public void beforeAlertDismiss(WebDriver webDriver) {

	}

	public void beforeNavigateTo(String s, WebDriver webDriver) {

	}

	public void afterNavigateTo(String s, WebDriver webDriver) {

	}

	public void beforeNavigateBack(WebDriver webDriver) {

	}

	public void afterNavigateBack(WebDriver webDriver) {

	}

	public void beforeNavigateForward(WebDriver webDriver) {

	}

	public void afterNavigateForward(WebDriver webDriver) {

	}

	public void beforeNavigateRefresh(WebDriver webDriver) {

	}

	public void afterNavigateRefresh(WebDriver webDriver) {

	}

	public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {

	}

	public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
		System.out.println("页面元素定位方法："+by.toString());
	}

	public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
		System.out.println("点击页面元素："+webElement.getAttribute("value"));

	}

	public void afterClickOn(WebElement webElement, WebDriver webDriver) {

	}

	public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

	}

	public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
		System.out.println("输入关键字:"+webElement.getAttribute("value"));


	}

	public void beforeScript(String s, WebDriver webDriver) {

	}

	public void afterScript(String s, WebDriver webDriver) {

	}

	public void onException(Throwable throwable, WebDriver webDriver) {

	}
}
