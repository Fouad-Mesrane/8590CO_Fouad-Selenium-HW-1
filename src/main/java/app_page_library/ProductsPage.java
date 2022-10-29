package app_page_library;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class ProductsPage extends BasePage {

    public ProductsPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search_query_top")
    WebElement searchbar;

    @FindBy(name = "submit_search")
    WebElement searchBtn;

    @FindBy(css = ".product_list")
    List<WebElement> productList;


    By prodList = By.cssSelector(".product_list");
    public void searchProducts (String productName){
        searchbar.sendKeys(productName);
        searchBtn.click();

    }

    public WebElement getProductName(String productName){
        getVisibleElement(prodList);
       WebElement prod =  productList.stream().filter(product ->
                                    product.findElement(By.cssSelector("#center_column > ul > li > div > div > h5")).getText().equalsIgnoreCase(productName)).findFirst().orElse(null);
        return prod;
    }

    public void addToCart(String productName){
        WebElement prod = getProductName(productName);
        hoverOverElement(prod);
    }


}


