package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BaiduHomePage {

    WebDriver driver;

    //文本框
    By inputText = By.name("wd");
    //搜索按钮
    By searchButton = By.id("su");

    public BaiduHomePage(WebDriver driver){
        this.driver = driver;
    }

    //输入关键字
    public void setKeyWords(String keyWords){

        driver.findElement(inputText).sendKeys(keyWords);

    }

    //点击搜索按钮
    public void clickSearchButton(){

        driver.findElement(searchButton).click();

    }

}
