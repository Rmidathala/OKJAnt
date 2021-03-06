package businesscomponents;

import java.time.LocalTime;
import java.time.ZoneId;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.HomePageObjects;
import pages.ProductDetailsPageObjects;
import pages.SupportPageObjects;


public class ProductDetailsPageComponents extends ReusableLibrary {
	
	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	public ProductDetailsPageComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
	LocalTime liveTime = LocalTime.now(ZoneId.of("America/New_York"));
	
	WebDriverUtil webdriverutil = new WebDriverUtil(driver);

	private WebElement getPageElement(ProductDetailsPageObjects pageEnum) {
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
			report.updateTestLog("Product Details Page - get page element",
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
			report.updateTestLog("Product Details Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	public void validateProductDetailsPage() {
		try {
			Thread.sleep(5000);
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblProductTitle), ProductDetailsPageObjects.lblProductTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.imgProductImage), ProductDetailsPageObjects.imgProductImage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblProductPrice), ProductDetailsPageObjects.lblProductPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnProductStarRating), ProductDetailsPageObjects.btnProductStarRating.getObjectname());
			commonFunction.mouseOver(getPageElement(ProductDetailsPageObjects.btnProductStarRating), ProductDetailsPageObjects.btnProductStarRating.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.overlayStarReviews), ProductDetailsPageObjects.overlayStarReviews.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnReadReviews), ProductDetailsPageObjects.btnReadReviews.getObjectname());
		
			commonFunction.mouseOver(getPageElement(ProductDetailsPageObjects.lblProductPrice), ProductDetailsPageObjects.lblProductPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblAvgRatingNumber), ProductDetailsPageObjects.lblAvgRatingNumber.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblTotalReviews), ProductDetailsPageObjects.lblTotalReviews.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lnkWriteAReview), ProductDetailsPageObjects.lnkWriteAReview.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lnkAskAQuestion), ProductDetailsPageObjects.lnkAskAQuestion.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnAddToCart), ProductDetailsPageObjects.btnAddToCart.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnWhereToBuy), ProductDetailsPageObjects.btnWhereToBuy.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.txtProductInfoOverview), ProductDetailsPageObjects.txtProductInfoOverview.getObjectname());
			
			
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.videoProduct), ProductDetailsPageObjects.videoProduct.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.imgCloserLook), ProductDetailsPageObjects.imgCloserLook.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.slidRightCloserLook), ProductDetailsPageObjects.slidRightCloserLook.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.imgDimensions), ProductDetailsPageObjects.imgDimensions.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.imgCookingArea), ProductDetailsPageObjects.imgCookingArea.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblFeaturesAndSpecifications), ProductDetailsPageObjects.lblFeaturesAndSpecifications.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblFeatures), ProductDetailsPageObjects.lblFeatures.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblSpecifiations), ProductDetailsPageObjects.lblSpecifiations.getObjectname());
			
		
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - Validate the Produc details Page",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateProductDetailsPage_STG() {
		try {
			Thread.sleep(5000);
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblProductTitle), ProductDetailsPageObjects.lblProductTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.imgProductImage), ProductDetailsPageObjects.imgProductImage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblProductPrice), ProductDetailsPageObjects.lblProductPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnProductStarRating), ProductDetailsPageObjects.btnProductStarRating.getObjectname());
			commonFunction.mouseOver(getPageElement(ProductDetailsPageObjects.btnProductStarRating), ProductDetailsPageObjects.btnProductStarRating.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.overlayStarReviews), ProductDetailsPageObjects.overlayStarReviews.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnReadReviews), ProductDetailsPageObjects.btnReadReviews.getObjectname());
		
			commonFunction.mouseOver(getPageElement(ProductDetailsPageObjects.lblProductPrice), ProductDetailsPageObjects.lblProductPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblAvgRatingNumber), ProductDetailsPageObjects.lblAvgRatingNumber.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblTotalReviews), ProductDetailsPageObjects.lblTotalReviews.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lnkWriteAReview), ProductDetailsPageObjects.lnkWriteAReview.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lnkAskAQuestion), ProductDetailsPageObjects.lnkAskAQuestion.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnAddToCart), ProductDetailsPageObjects.btnAddToCart.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnWhereToBuy), ProductDetailsPageObjects.btnWhereToBuy.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.txtProductInfoOverview_STG), ProductDetailsPageObjects.txtProductInfoOverview_STG.getObjectname());
			
			
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.videoProduct), ProductDetailsPageObjects.videoProduct.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.imgCloserLook), ProductDetailsPageObjects.imgCloserLook.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.slidRightCloserLook), ProductDetailsPageObjects.slidRightCloserLook.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.imgDimensions), ProductDetailsPageObjects.imgDimensions.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.imgCookingArea), ProductDetailsPageObjects.imgCookingArea.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblFeaturesAndSpecifications), ProductDetailsPageObjects.lblFeaturesAndSpecifications.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblFeatures_STG), ProductDetailsPageObjects.lblFeatures_STG.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblSpecifiations_STG), ProductDetailsPageObjects.lblSpecifiations_STG.getObjectname());
			
		
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - Validate the Produc details Page",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateItemAddedToCartModel() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.btnAddToCart), ProductDetailsPageObjects.btnAddToCart.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.imgProductImageOnOverlay), ProductDetailsPageObjects.imgProductImageOnOverlay.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblProductNameOnOverlay), ProductDetailsPageObjects.lblProductNameOnOverlay.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblProductPriceOnOverlay), ProductDetailsPageObjects.lblProductPriceOnOverlay.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnContinuShoppingOnOverlay), ProductDetailsPageObjects.btnContinuShoppingOnOverlay.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnCheckOutOnOverlay), ProductDetailsPageObjects.btnCheckOutOnOverlay.getObjectname());
			commonFunction.chatBoxclose();
			if (driver.findElement(By.xpath("//button[@id='btn-minicart-continue']")).isDisplayed()) 
			//commonFunction.verifyIfElementPresent(getPageElement(ProductDetailsPageObjects.btnContinuShoppingOnOverlay), ProductDetailsPageObjects.btnContinuShoppingOnOverlay.getObjectname())
			{
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.btnContinuShoppingOnOverlay), ProductDetailsPageObjects.btnContinuShoppingOnOverlay.getObjectname());
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblCartItemCount), ProductDetailsPageObjects.lblCartItemCount.getObjectname());
			
			if(Integer.parseInt(getPageElement(ProductDetailsPageObjects.lblCartItemCount).getText())>0) {
				report.updateTestLog("Verify Product added to cart", "Product added to cart successfully", Status.PASS);
			}else {
				report.updateTestLog("Verify Product added to cart", "Product is not added to cart", Status.FAIL);
			}
			
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - Validate the Item Added to Cart Model Overlay",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateWhereToBuyModel() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.btnWhereToBuy), ProductDetailsPageObjects.btnWhereToBuy.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.imgBrandIcon), ProductDetailsPageObjects.imgBrandIcon.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblProductTitleOnWhereToBuyOverlay), ProductDetailsPageObjects.lblProductTitleOnWhereToBuyOverlay.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.txtBoxLocationAddress), ProductDetailsPageObjects.txtBoxLocationAddress.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.btnLocationSearch), ProductDetailsPageObjects.txtBoxLocationAddress.getObjectname());

			//commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.imgMapOnWhereToBuy), ProductDetailsPageObjects.imgMapOnWhereToBuy.getObjectname());
			//commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblOnlineSeller), ProductDetailsPageObjects.lblOnlineSeller.getObjectname());
			
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.btnCloseWhereToBuyOverlay), ProductDetailsPageObjects.btnCloseWhereToBuyOverlay.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - Validate the Where to Buy Overlay",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void updateQuantityInProductDetailsPage() {
		try {
			commonFunction.selectAnyElement(getPageElement(ProductDetailsPageObjects.txtBoxQuantity), "4", ProductDetailsPageObjects.txtBoxQuantity.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.btnUpdateCart), ProductDetailsPageObjects.btnUpdateCart.getObjectname());
						
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - Update Quantity order",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void addProductToCart() {
		try {
			commonFunction.chatBoxclose();
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.btnAddToCart), ProductDetailsPageObjects.btnAddToCart.getObjectname());
			Thread.sleep(5000);
			commonFunction.chatBoxclose();
			if (driver.findElement(By.xpath("//button[@id='btn-minicart-continue']")).isDisplayed())  {
			//commonFunction.verifyIfElementPresent(getPageElement(ProductDetailsPageObjects.btnContinuShoppingOnOverlay), ProductDetailsPageObjects.btnContinuShoppingOnOverlay.getObjectname()); 			
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.btnContinuShoppingOnOverlay), ProductDetailsPageObjects.btnContinuShoppingOnOverlay.getObjectname());
			}
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - Add Product to Cart",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void addProductToCartAndProceedToCheckout() {
		try {
			commonFunction.chatBoxclose();
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.btnAddToCart), ProductDetailsPageObjects.btnAddToCart.getObjectname());
			Thread.sleep(5000);
			commonFunction.chatBoxclose();
			
			if (driver.findElement(By.id("top-cart-btn-checkout")).isDisplayed()) {
					//commonFunction.verifyIfElementPresent(getPageElement(ProductDetailsPageObjects.btnCheckOutOnOverlay), ProductDetailsPageObjects.btnCheckOutOnOverlay.getObjectname())) 
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.btnCheckOutOnOverlay), ProductDetailsPageObjects.btnCheckOutOnOverlay.getObjectname());
		}
			else {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnCart),HomePageObjects.btnCart.getObjectname());
			}
			}
			catch(Exception e) {
			report.updateTestLog("Product Details Page - Add Product to Cart and Checkout",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateAskAQuestionLink() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.lnkAskAQuestion), ProductDetailsPageObjects.lnkAskAQuestion.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.txtAreaAskAQuestion), ProductDetailsPageObjects.txtAreaAskAQuestion.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.txtBoxNickName), ProductDetailsPageObjects.txtBoxNickName.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.txtBoxLocation), ProductDetailsPageObjects.txtBoxLocation.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.txtBoxEmail), ProductDetailsPageObjects.txtBoxEmail.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnPostQuestion), ProductDetailsPageObjects.btnPostQuestion.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - Ask a Question section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateImageSectionArrows() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.rightArrow), ProductDetailsPageObjects.rightArrow.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.leftArrow), ProductDetailsPageObjects.leftArrow.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.leftArrow), ProductDetailsPageObjects.leftArrow.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.leftArrow), ProductDetailsPageObjects.leftArrow.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.leftArrow), ProductDetailsPageObjects.leftArrow.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.rightArrow), ProductDetailsPageObjects.rightArrow.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.rightArrow), ProductDetailsPageObjects.rightArrow.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.rightArrow), ProductDetailsPageObjects.rightArrow.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - Image section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateViewAllProductsButton() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnViewAllProducts), ProductDetailsPageObjects.btnViewAllProducts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.btnViewAllProducts), ProductDetailsPageObjects.btnViewAllProducts.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts")) {
				report.updateTestLog("Verify View All Products link - Product Details Page",
						"User is successfully Navigated to Accessories & Parts Page", Status.PASS);
			} else {
				report.updateTestLog("Verify View All Products link - Product Details Page",
						"User is NOT Navigated to Accessories & Parts Page", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - View All Products validation",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateYouMightAlsoLikeSectionProducts() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblYouMightAlsoLike), ProductDetailsPageObjects.lblYouMightAlsoLike.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.firstProduct), ProductDetailsPageObjects.firstProduct.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnAddToCart), ProductDetailsPageObjects.btnAddToCart.getObjectname())) {
				report.updateTestLog("Verify You might also like section - Product 1",
						"User is successfully Navigated to Product 1 of You might also like Section", Status.PASS);
			} else {
				report.updateTestLog("Verify You might also like section - Product 1",
						"User is NOT Navigated to Product 1 of You might also like Section", Status.FAIL);
			}
			driver.navigate().back();
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.secondproduct), ProductDetailsPageObjects.secondproduct.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnAddToCart), ProductDetailsPageObjects.btnAddToCart.getObjectname())) {
				report.updateTestLog("Verify You might also like section - Product 2",
						"User is successfully Navigated to Product 2 of You might also like Section", Status.PASS);
			} else {
				report.updateTestLog("Verify You might also like section - Product 2",
						"User is NOT Navigated to Product 2 of You might also like Section", Status.FAIL);
			}
			driver.navigate().back();
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.thirdProduct), ProductDetailsPageObjects.thirdProduct.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnAddToCart), ProductDetailsPageObjects.btnAddToCart.getObjectname())) {
				report.updateTestLog("Verify You might also like section - Product 3",
					"User is successfully Navigated to Product 3 of You might also like Section", Status.PASS);
			} else {
				report.updateTestLog("Verify You might also like section - Product 3",
						"User is NOT Navigated to Product 3 of You might also like Section", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - You Might Also Like Section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateComingSoonProduct() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblProductTitle), ProductDetailsPageObjects.lblProductTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.imgProductImage), ProductDetailsPageObjects.imgProductImage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblProductPrice), ProductDetailsPageObjects.lblProductPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnProductStarRating), ProductDetailsPageObjects.btnProductStarRating.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lnkWriteAReview), ProductDetailsPageObjects.lnkWriteAReview.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lnkAskAQuestion), ProductDetailsPageObjects.lnkAskAQuestion.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnPreOrder), ProductDetailsPageObjects.btnPreOrder.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - Coming Soon Product",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateCookingArea() {
		try {
			commonFunction.scrollIntoView(getPageElement(ProductDetailsPageObjects.lblCookingArea));
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.lblCookingArea), ProductDetailsPageObjects.lblCookingArea.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.tabCookingArea1), ProductDetailsPageObjects.tabCookingArea1.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.tabCookingArea1AdditionalText), ProductDetailsPageObjects.tabCookingArea1AdditionalText.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.tabCookingArea2), ProductDetailsPageObjects.tabCookingArea2.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.tabCookingArea2AdditionalText), ProductDetailsPageObjects.tabCookingArea2AdditionalText.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductDetailsPageObjects.tabCookingArea3), ProductDetailsPageObjects.tabCookingArea3.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.tabCookingArea3AdditionalText), ProductDetailsPageObjects.tabCookingArea3AdditionalText.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - Cooking Area",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateTiredPricing() {
		try {
			
			if(commonFunction.getSelectedTextFromDropDown(getPageElement(ProductDetailsPageObjects.drpDownQuantityProductDetailsPage)).contains("1") && commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblMainPriceOfProduct), ProductDetailsPageObjects.lblMainPriceOfProduct.getObjectname())) {
				report.updateTestLog("Verify default quantity value is 1 and default price is displayed without discount",
						"Default quantity value is 1 and default price is displayed without discount", Status.PASS);
				} else {
					report.updateTestLog("Verify default quantity value is 1 and default price is displayed without discount",
							"Default quantity value is NOT 1 or default price is displayed WITH discount", Status.FAIL);
				}
			commonFunction.selectAnyElementByValue(getPageElement(ProductDetailsPageObjects.drpDownQuantityProductDetailsPage), "2", ProductDetailsPageObjects.drpDownQuantityProductDetailsPage.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(ProductDetailsPageObjects.lblTiredSavings), ProductDetailsPageObjects.lblTiredSavings.getObjectname(), "Buy 2 and save 7%");
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblCancelledMainPriceOfProduct), ProductDetailsPageObjects.lblCancelledMainPriceOfProduct.getObjectname());
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblDiscountedPriceOfProduct), ProductDetailsPageObjects.lblDiscountedPriceOfProduct.getObjectname());
			commonFunction.selectAnyElementByValue(getPageElement(ProductDetailsPageObjects.drpDownQuantityProductDetailsPage), "3", ProductDetailsPageObjects.drpDownQuantityProductDetailsPage.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(ProductDetailsPageObjects.lblTiredSavings), ProductDetailsPageObjects.lblTiredSavings.getObjectname(), "Buy 3 and save 7%");
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblCancelledMainPriceOfProduct), ProductDetailsPageObjects.lblCancelledMainPriceOfProduct.getObjectname());
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblDiscountedPriceOfProduct), ProductDetailsPageObjects.lblDiscountedPriceOfProduct.getObjectname());
			
			commonFunction.selectAnyElementByValue(getPageElement(ProductDetailsPageObjects.drpDownQuantityProductDetailsPage), "4", ProductDetailsPageObjects.drpDownQuantityProductDetailsPage.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(ProductDetailsPageObjects.lblTiredSavings), ProductDetailsPageObjects.lblTiredSavings.getObjectname(), "Buy 4 and save 14%");
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblCancelledMainPriceOfProduct), ProductDetailsPageObjects.lblCancelledMainPriceOfProduct.getObjectname());
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblDiscountedPriceOfProduct), ProductDetailsPageObjects.lblDiscountedPriceOfProduct.getObjectname());
			
			commonFunction.selectAnyElementByValue(getPageElement(ProductDetailsPageObjects.drpDownQuantityProductDetailsPage), "5", ProductDetailsPageObjects.drpDownQuantityProductDetailsPage.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(ProductDetailsPageObjects.lblTiredSavings), ProductDetailsPageObjects.lblTiredSavings.getObjectname(), "Buy 5 and save 14%");
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblCancelledMainPriceOfProduct), ProductDetailsPageObjects.lblCancelledMainPriceOfProduct.getObjectname());
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblDiscountedPriceOfProduct), ProductDetailsPageObjects.lblDiscountedPriceOfProduct.getObjectname());
			
			commonFunction.selectAnyElementByValue(getPageElement(ProductDetailsPageObjects.drpDownQuantityProductDetailsPage), "6", ProductDetailsPageObjects.drpDownQuantityProductDetailsPage.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(ProductDetailsPageObjects.lblTiredSavings), ProductDetailsPageObjects.lblTiredSavings.getObjectname(), "Buy 6 and save 14%");
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblCancelledMainPriceOfProduct), ProductDetailsPageObjects.lblCancelledMainPriceOfProduct.getObjectname());
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblDiscountedPriceOfProduct), ProductDetailsPageObjects.lblDiscountedPriceOfProduct.getObjectname());
			commonFunction.selectAnyElementByValue(getPageElement(ProductDetailsPageObjects.drpDownQuantityProductDetailsPage), "7", ProductDetailsPageObjects.drpDownQuantityProductDetailsPage.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(ProductDetailsPageObjects.lblTiredSavings), ProductDetailsPageObjects.lblTiredSavings.getObjectname(), "Buy 7 and save 14%");
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblCancelledMainPriceOfProduct), ProductDetailsPageObjects.lblCancelledMainPriceOfProduct.getObjectname());
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblDiscountedPriceOfProduct), ProductDetailsPageObjects.lblDiscountedPriceOfProduct.getObjectname());
			commonFunction.selectAnyElementByValue(getPageElement(ProductDetailsPageObjects.drpDownQuantityProductDetailsPage), "8", ProductDetailsPageObjects.drpDownQuantityProductDetailsPage.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(ProductDetailsPageObjects.lblTiredSavings), ProductDetailsPageObjects.lblTiredSavings.getObjectname(), "Buy 8 or more and save 21%");
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblCancelledMainPriceOfProduct), ProductDetailsPageObjects.lblCancelledMainPriceOfProduct.getObjectname());
			commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblDiscountedPriceOfProduct), ProductDetailsPageObjects.lblDiscountedPriceOfProduct.getObjectname());
			
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - Cooking Area",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void selectQuantityOnPDP() {
		try {
			
			commonFunction.selectAnyElementByValue(getPageElement(ProductDetailsPageObjects.drpDownQuantityProductDetailsPage), "4", ProductDetailsPageObjects.drpDownQuantityProductDetailsPage.getObjectname());
			if(commonFunction.getSelectedTextFromDropDown(getPageElement(ProductDetailsPageObjects.drpDownQuantityProductDetailsPage)).contains("4") && commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.lblMainPriceOfProduct), ProductDetailsPageObjects.lblMainPriceOfProduct.getObjectname())) {
				report.updateTestLog("Verify quantity is selected on the Product Details Page",
						"Product Quantity is slected on the Product Details page", Status.PASS);
				} else {
					report.updateTestLog("Verify quantity is selected on the Product Details Page",
							"Product Quantity is  NOT selected on the Product Details page", Status.FAIL);
				}
		}catch(Exception e) {
			report.updateTestLog("Product Details Page - Select Quantity",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	public void validatePromotionalBanner() {
		try {
			
		commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.bannerPromoProduct), ProductDetailsPageObjects.bannerPromoProduct.getObjectname());
		commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.bannerPromoProductBelowDesc), ProductDetailsPageObjects.bannerPromoProductBelowDesc.getObjectname());
		commonFunction.isElementPresentVerification(getPageElement(ProductDetailsPageObjects.imgLogo), ProductDetailsPageObjects.imgLogo.getObjectname());
		report.updateTestLog("Promotional products banner and logo validation","Banners and logo are present", Status.PASS);
		}
		catch(Exception e) {
			report.updateTestLog("Promotional products banner and logo validation", "Banner or logo not present" + e.toString(), Status.FAIL);
		}
	}
}
