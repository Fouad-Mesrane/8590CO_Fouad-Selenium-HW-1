package test_searchbar;

import app_page_library.ProductsPage;
import base.BasePage;
import org.testng.annotations.Test;
import test_authentication.TestAuthentication;

public class TestSearchBar extends BasePage {


    String product = "dress";
    @Test
    public void searchItem(){
        TestAuthentication login = new TestAuthentication();
        login.authentication();
        ProductsPage productsPage = new ProductsPage();
        productsPage.searchProducts(product);

    }
}
