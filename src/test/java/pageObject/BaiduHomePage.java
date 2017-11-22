package pageObject;

/**
 * Created by wangdx on 2017/11/22.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BaiduHomePage {

    //文本框
    @FindBy(name="wd")
    WebElement inputText;
    //搜索按钮
    @FindBy(id = "su")
    WebElement searchButton;

    //操作方法 搜索
    public void search(String keyword){
        inputText.sendKeys(keyword);
        searchButton.click();
    }

}
