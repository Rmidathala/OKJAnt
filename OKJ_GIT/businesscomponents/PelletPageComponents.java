package businesscomponents;

import java.util.List;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.ShoppingCartPageObjects;
import pages.SupportPageObjects;
import pages.AccountInformationPageObjects;
import pages.HomePageObjects;
import pages.PartListingPageObjects;
import pages.PelletPageObjects;
import pages.ProTipsPageObjects;
import pages.ProductRegistrationPageObjects;

public class PelletPageComponents extends ReusableLibrary {

	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper The {@link ScriptHelper} object passed from the
	 *                     {@link DriverScript}
	 */
	public PelletPageComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
	LocalTime liveTime = LocalTime.now(ZoneId.of("America/New_York"));
	WebDriverUtil webdriverutil = new WebDriverUtil(driver);

	private WebElement getPageElement(PartListingPageObjects pageEnum) {
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
			report.updateTestLog("Parts Listing Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	private WebElement getPageElement(ProTipsPageObjects pageEnum) {
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
			report.updateTestLog("Pro Tips Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	private WebElement getPageElement(ShoppingCartPageObjects pageEnum) {
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
			report.updateTestLog("Shopping Cart - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	private WebElement getPageElement(HomePageObjects pageEnum) {
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
			report.updateTestLog("Home Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	private WebElement getPageElement(ProductRegistrationPageObjects pageEnum) {
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
			report.updateTestLog("Product Registration Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	private WebElement getPageElement(AccountInformationPageObjects pageEnum) {
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
			report.updateTestLog("Account Information Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}
	
	private WebElement getPageElement(PelletPageObjects pageEnum) {
		WebElement element;
		try {
			element = commonFunction.getElementByProperty(pageEnum.getProperty(), pageEnum.getLocatorType().toString(),
					true);
			if (element != null) {
				System.out.println("Found the element: " + pageEnum.getObjectname());
			return element;
			}
			else {
				System.out.println("Element Not Found: "+pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Product Support Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}
	public void verifyPelletPageHeroImage() {

		try {
			String heroTitle = dataTable.getData("General_Data", "Hero Title");
			String heroText = dataTable.getData("General_Data", "Hero Text");
			commonFunction.verifyIfElementIsPresent(getPageElement(PelletPageObjects.headerLogo),
					PelletPageObjects.headerLogo.getObjectname());

			commonFunction.isElementPresentContainsText(getPageElement(PelletPageObjects.textHeroTitle),
					PelletPageObjects.textHeroTitle.getObjectname(), heroTitle);
			commonFunction.isElementPresentContainsText(getPageElement(PelletPageObjects.textHeroButtomText),
					PelletPageObjects.textHeroButtomText.getObjectname(), heroText);
			System.out.println(getPageElement(PelletPageObjects.textHeroTitle).getText());
			System.out.println(getPageElement(PelletPageObjects.textHeroButtomText).getText());
		} catch (Exception e) {
			report.updateTestLog("Pellet Page - Hero Image Validation", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}

	}
	public void verifyPelletPagecomponents() {
		try {
			
			commonFunction.verifyIfElementIsPresent(getPageElement(PelletPageObjects.texproduct1),
					PelletPageObjects.texproduct1.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(PelletPageObjects.btnLearnProduct1), 
					PelletPageObjects.btnLearnProduct1.getObjectname());
			if (driver.getCurrentUrl().contains("rider-dlx-pellet-grill")) {
				report.updateTestLog("Verify user is navigated to corrected PDP when clicked on Learn more link 1st Product", 
						"Navigated to correct PDP", Status.PASS);	
			}	
			else {
				report.updateTestLog("Verify user is navigated to corrected PDP when clicked on Learn more link 1st Product", 
						"Not Navigated to correct PDP", Status.FAIL);	
			}
			driver.navigate().back();
			commonFunction.verifyIfElementIsPresent(getPageElement(PelletPageObjects.texproduct2),
					PelletPageObjects.texproduct2.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(PelletPageObjects.btnLearnProduct2), 
					PelletPageObjects.btnLearnProduct2.getObjectname());
			if (driver.getCurrentUrl().contains("rider-900-pellet-grill")) {
				report.updateTestLog("Verify user is navigated to corrected PDP when clicked on Learn more link 2nd Product", 
						"Navigated to correct PDP", Status.PASS);	
			}	
			else {
				report.updateTestLog("Verify user is navigated to corrected PDP when clicked on Learn more link 2nd Product", 
						"Not Navigated to correct PDP", Status.FAIL);	
			}
			driver.navigate().back();
			commonFunction.verifyIfElementIsPresent(getPageElement(PelletPageObjects.texproduct3),
					PelletPageObjects.texproduct3.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(PelletPageObjects.btnLearnProduct3), 
					PelletPageObjects.btnLearnProduct3.getObjectname());
			if (driver.getCurrentUrl().contains("rider-600-pellet-grill")) {
				report.updateTestLog("Verify user is navigated to corrected PDP when clicked on Learn more link 3rd Product", 
						"Navigated to correct PDP", Status.PASS);	
			}	
			else {
				report.updateTestLog("Verify user is navigated to corrected PDP when clicked on Learn more link 3rd Product", 
						"Not Navigated to correct PDP", Status.FAIL);	
			}
			driver.navigate().back();
			commonFunction.clickIfElementPresent(getPageElement(PelletPageObjects.linkLearnMoreAboutPellet), 
					PelletPageObjects.linkLearnMoreAboutPellet.getObjectname());
			if (driver.getCurrentUrl().contains("/faqs")) {
				report.updateTestLog("Verify user is navigated to Faqs page", 
						"User is navigated to Faqa page", Status.PASS);	
			}	
			else {
				report.updateTestLog("Verify user is navigated to Faqs page", 
						"User is not navigated to Faqs page", Status.FAIL);	
			}
			driver.navigate().back();
			commonFunction.clickIfElementPresent(getPageElement(PelletPageObjects.linkSeeRecipe1), 
					PelletPageObjects.linkSeeRecipe1.getObjectname());
			if (driver.getCurrentUrl().contains("/recipes")) {
				report.updateTestLog("Verify user is navigated to recipes page", 
						"User is navigated to recipes page", Status.PASS);	
			}	
			else {
				report.updateTestLog("Verify user is navigated to recipes page", 
						"User is not navigated to recipes page", Status.FAIL);	
			}
			driver.navigate().back();
			commonFunction.clickIfElementPresent(getPageElement(PelletPageObjects.linkSeeRecipe2), 
					PelletPageObjects.linkSeeRecipe2.getObjectname());
			if (driver.getCurrentUrl().contains("/recipes")) {
				report.updateTestLog("Verify user is navigated to recipes page", 
						"User is navigated to recipes page", Status.PASS);	
			}	
			else {
				report.updateTestLog("Verify user is navigated to recipes page", 
						"User is not navigated to recipes page", Status.FAIL);	
			}
			
			driver.navigate().back();
			
	}
		catch (Exception e) {
			report.updateTestLog("Pellet Page - components verification", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
}
}
