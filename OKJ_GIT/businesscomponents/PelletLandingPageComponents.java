package businesscomponents;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.PelletPageObjects;

public class PelletLandingPageComponents extends ReusableLibrary {

	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper The {@link ScriptHelper} object passed from the
	 *                     {@link DriverScript}
	 */
	public PelletLandingPageComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
	LocalTime liveTime = LocalTime.now(ZoneId.of("America/New_York"));
	WebDriverUtil webdriverutil = new WebDriverUtil(driver);
	
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

			if (commonFunction.isElementPresentContainsText(getPageElement(PelletPageObjects.textHeroTitle),
					PelletPageObjects.textHeroTitle.getObjectname(), heroTitle))
			report.updateTestLog("Hero title Validation", "Hero Title is displayed correctly", Status.PASS);
			else
				report.updateTestLog("Hero title Validation", "Hero Title is not displayed correctly", Status.FAIL);
			if(commonFunction.isElementPresentContainsText(getPageElement(PelletPageObjects.textHeroButtomText),
					PelletPageObjects.textHeroButtomText.getObjectname(), heroText))
			report.updateTestLog("Hero text Validation", "Hero text is displayed correctly", Status.PASS);
			else
				report.updateTestLog("Hero text Validation", "Hero text is not displayed correctly", Status.FAIL);
			//System.out.println(getPageElement(PelletPageObjects.textHeroTitle).getText());
			//System.out.println(getPageElement(PelletPageObjects.textHeroButtomText).getText());
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
	public void validatePelletGuides() {
		try{
			commonFunction.clickIfElementPresent(getPageElement(PelletPageObjects.btnLearnProduct1), 
					PelletPageObjects.btnLearnProduct1.getObjectname());
			commonFunction.scrollIntoView(getPageElement(PelletPageObjects.linkFindPartsAndManuals));
			commonFunction.clickIfElementPresent(getPageElement(PelletPageObjects.linkFindPartsAndManuals), 
					PelletPageObjects.linkFindPartsAndManuals.getObjectname());
			if(commonFunction.verifyIfElementIsPresent(getPageElement(PelletPageObjects.linkReplacementGuide), PelletPageObjects.linkReplacementGuide.getObjectname()))
			report.updateTestLog("Verify replacement guide link is present", 
					"Replacement guide link is present", Status.PASS);
			else
				report.updateTestLog("Verify replacement guide link is present", 
						"Replacement guide link is not present", Status.FAIL);
			/*commonFunction.clickIfElementPresent(getPageElement(PelletPageObjects.linkReplacementGuide), 
					PelletPageObjects.linkReplacementGuide.getObjectname());
			//Thread.sleep(3000);
			//commonFunction.SwitchControlToChildTab();
			
			
				
			if (driver.getCurrentUrl().contains("content.wcbradley.com/"))
				report.updateTestLog("Verify replacement guide link navigated to currect PDF", 
						"Replacement guide link is navigated to correct PDF", Status.PASS);
			//commonFunction.verifyIfElementIsPresent(getPageElement(PelletPageObjects.contentPDFReplacementGuide), PelletPageObjects.contentPDFReplacementGuide.getObjectname());
			//commonFunction.SwitchControlToParentTab();
			driver.switchTo().window(tabs2.get(0));*/
			commonFunction.clickIfElementPresent(getPageElement(PelletPageObjects.linkProductGuide), 
					PelletPageObjects.linkProductGuide.getObjectname());
			if (driver.getCurrentUrl().contains("content.wcbradley.com/"))
				report.updateTestLog("Verify product guide link navigated to currect PDF", 
						"Product guide link is navigated to correct PDF", Status.PASS);
		}
		catch (Exception e) {
			report.updateTestLog("Pellet Page - components verification", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
}

