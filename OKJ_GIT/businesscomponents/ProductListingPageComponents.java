package businesscomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.ProductListingPageObjects;

public class ProductListingPageComponents extends ReusableLibrary {

	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	public ProductListingPageComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
	WebDriverUtil webdriverutil = new WebDriverUtil(driver);

	private WebElement getPageElement(ProductListingPageObjects pageEnum) {
		WebElement element;
		try {
			element = commonFunction.getElementByProperty(pageEnum.getProperty(), pageEnum.getLocatorType().toString(),
					true);
			if (element != null) {
				System.out.println("Found the element: " + pageEnum.getObjectname());
				return element;
			} else {
				System.out.println("Element Not Found: " + pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Product Listing Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	public void validateProductListingPage() {
		try {
			
			webdriverutil.waitUntilPageReadyStateComplete(30);
			// Validate the if the elements are displayed in product listing page
			commonFunction.scrollIntoView(getPageElement(ProductListingPageObjects.itmFirstProduct));
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.itmFirstProduct),
					ProductListingPageObjects.itmFirstProduct.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.firstProductTitle),
					ProductListingPageObjects.firstProductTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.firstProductImg),
					ProductListingPageObjects.firstProductImg.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.firstProdcutPrice),
					ProductListingPageObjects.firstProdcutPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.firstProuctStars),
					ProductListingPageObjects.firstProuctStars.getObjectname());

			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.btnLoadMore),
					ProductListingPageObjects.btnLoadMore.getObjectname());

			// Click on the load more until there are no products
			By by = By.xpath(ProductListingPageObjects.btnLoadMore.getProperty());
			while (driver.findElement(by).isDisplayed()) {
				commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnLoadMore),
						ProductListingPageObjects.btnLoadMore.getObjectname());
				Thread.sleep(5000);
				webdriverutil.waitUntilPageReadyStateComplete(30);
			}
		} catch (Exception e) {
			report.updateTestLog("Product Listing Page -  Validation", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	public void validateTipsFilterHowToPage() {
		try {
			// Scroll to filter and click on filter
			commonFunction.scrollIntoView(getPageElement(ProductListingPageObjects.btnFilterHowToPage));
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnFilterHowToPage),
					ProductListingPageObjects.btnFilterHowToPage.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.expandCateoryHowToPage),
					ProductListingPageObjects.expandCateoryHowToPage.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.checkBoxFoodHowTo),
					ProductListingPageObjects.checkBoxFoodHowTo.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnApplyHowToPage),
					ProductListingPageObjects.btnApplyHowToPage.getObjectname());

			if (commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.itmFirstProductHowToPage),
					ProductListingPageObjects.itmFirstProductHowToPage.getObjectname())) {
				report.updateTestLog("Verify tips displayed after applying Category filter",
						"The filtered tips are displayed after the applying the Category filter", Status.PASS);
			} else {
				report.updateTestLog("Verify tips displayed after applying Category filter",
						"The filtered tips are NOT displayed after the applying the Category filter", Status.FAIL);
			}
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnFilterHowToPage),
					ProductListingPageObjects.btnFilterHowToPage.getObjectname());
			
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.lnkclearAllFilters),
					ProductListingPageObjects.lnkclearAllFilters.getObjectname());
						

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnFilterHowToPage),
					ProductListingPageObjects.btnFilterHowToPage.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.expandDifficultyHowToPage),
					ProductListingPageObjects.expandDifficultyHowToPage.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.checkBoxBeginner),
					ProductListingPageObjects.checkBoxBeginner.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnApplyHowToPage),
					ProductListingPageObjects.btnApplyHowToPage.getObjectname());

			if (commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.itmFirstProductHowToPage),
					ProductListingPageObjects.itmFirstProductHowToPage.getObjectname())) {
				report.updateTestLog("Verify tips displayed after applying Difficulty filter",
						"The filtered tips are displayed after the applying the Difficulty filter",
						Status.PASS);
			} else {
				report.updateTestLog("Verify Products displayed after applying Difficulty filter",
						"The filtered tips are NOT displayed after the applying the Difficulty filter",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("How To Page- Filter products -  Validation",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	public void validateProductFilter() {
		try {
			// Scroll to filter and click on filter
			commonFunction.scrollIntoView(getPageElement(ProductListingPageObjects.btnFilter));
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnFilter),
					ProductListingPageObjects.btnFilter.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.expandCategory),
					ProductListingPageObjects.expandCategory.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.firstCategoryOption),
					ProductListingPageObjects.firstCategoryOption.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnApply),
					ProductListingPageObjects.btnApply.getObjectname());

			if (commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.itmFirstProduct),
					ProductListingPageObjects.itmFirstProduct.getObjectname())) {
				report.updateTestLog("Verify Products displayed after applying category filter",
						"The filtered prodcuts are displayed after the applying the category filter", Status.PASS);
			} else {
				report.updateTestLog("Verify Products displayed after applying category filter",
						"The filtered products are NOT displayed after the applying the category filter", Status.FAIL);
			}
			
			Thread.sleep(8000);
			commonFunction.chatBoxclose();
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnFilter),
					ProductListingPageObjects.btnFilter.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.expandPrice),
					ProductListingPageObjects.expandPrice.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.firstPriceOption),
					ProductListingPageObjects.firstPriceOption.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnApply),
					ProductListingPageObjects.btnApply.getObjectname());

			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.itmFirstProduct),
					ProductListingPageObjects.itmFirstProduct.getObjectname());

			if (commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.itmFirstProduct),
					ProductListingPageObjects.itmFirstProduct.getObjectname())) {
				report.updateTestLog("Verify Products displayed after applying Color and Price filter",
						"The filtered prodcuts are displayed after the applying the category and Price filter",
						Status.PASS);
			} else {
				report.updateTestLog("Verify Products displayed after applying Color and Price filter",
						"The filtered products are NOT displayed after the applying the category and Price filter",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Product Listing Page - Filter products -  Validation",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateProductSort() {
		try {
			commonFunction.scrollIntoView(getPageElement(ProductListingPageObjects.lnkSortdropDown));
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.lnkSortdropDown),
					ProductListingPageObjects.lnkSortdropDown.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.optionDropDownProductName),
					ProductListingPageObjects.optionDropDownProductName.getObjectname());

		}catch(Exception e) {
			report.updateTestLog("Product Listing Page - Sort products -  Validation",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void selectInStockProduct() {
		try {
			webdriverutil.waitUntilPageReadyStateComplete(30);
			
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.itmFirstProduct),
					ProductListingPageObjects.itmFirstProduct.getObjectname());
			webdriverutil.waitUntilPageReadyStateComplete(30);
		}catch(Exception e) {
			report.updateTestLog("Product Listing Page - Select a product -  Validation",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void selectInStockProductStaging() {
		try {
			webdriverutil.waitUntilPageReadyStateComplete(30);
			
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.itmThirdProduct),
					ProductListingPageObjects.itmThirdProduct.getObjectname());
			webdriverutil.waitUntilPageReadyStateComplete(30);
		}catch(Exception e) {
			report.updateTestLog("Product Listing Page - Select a product -  Validation",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateProductFilterSection() {
		try {
			commonFunction.scrollIntoView(getPageElement(ProductListingPageObjects.btnFilter));
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnFilter),
					ProductListingPageObjects.btnFilter.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.expandCategory),
					ProductListingPageObjects.expandCategory.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.expandColor),
					ProductListingPageObjects.expandColor.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.expandPrice),
					ProductListingPageObjects.expandPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.lnkCancel),
					ProductListingPageObjects.lnkCancel.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.btnApplyDisabled),
					ProductListingPageObjects.btnApplyDisabled.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Product Listing Page - validate Filter Section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
}
