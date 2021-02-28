package avicPages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
    private WebElement appleSoreButton;

    @FindBy(xpath = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'cart_count')]")
    private WebElement amountOfProductsInCart;

    @FindBy(xpath = "//span[contains(text(), 'Телевизоры')]")
    private WebElement tVsButton;

    @FindBy(xpath = "//div[@class='partner-box height']//img[@alt='Xiaomi']")
    private WebElement miBrand;

    @FindBy(xpath = "//a[@class='category-box-item']")
    private List<WebElement> productsList;

    @FindBy(xpath = "//a[@class='brand__more']")
    private List<WebElement> categoriesList;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword, Keys enter) {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnProductCatalogButton() {
        productCatalogButton.click();
    }

    public void clickToTVsButton(){ tVsButton.click(); }

    public void clickToMi(){ miBrand.click(); }

    public int getNumberOfElementsInPage(){ return productsList.size(); }

    public int getListOfCategories(){ return categoriesList.size();}


}