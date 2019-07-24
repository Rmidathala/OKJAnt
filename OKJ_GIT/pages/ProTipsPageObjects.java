package pages;

import static pages.ObjectLocator.*;
public enum ProTipsPageObjects implements PageObjects {
	titleProTips("//div[@class='hero__text-container']/h1",XPATH,"Pro Tips Page - Pro-Tip Title"),
	lblJumpToCategory("//div[@class='accordion__categories__label']",XPATH,"Pro-Tips Page - Label Jump To Category"),
	lnkJumpToTheSmoke("//a[text()='The Smoke']",XPATH,"Pro-Tips Page - Link The Smoke in Jump to Category"),
	lnkJumpTotheSetup("//a[text()='The Setup']",XPATH,"Pro-Tips Page - Link The SetUp in Jump to Category"),
	lnkJumpToTheProcess("//a[text()='The Process']",XPATH,"Pro-Tips Page - Link The Process in Jumm to Category"),
	//Staging
	lnkJumpToMostPopular_STG("//a[text()='Most Popular']",XPATH,"Pro Tips Page - Stagin - Link - Most Popular in Jump to Category"),
	lnkJumpToEntertaining_STG("//a[text()='Entertaining']",XPATH,"Pro Tips Page - Staging - Link - Entertaining"),
	
	lblMostPopular_STG("//div[@id='accordion__Most Popular']/div[1]",XPATH,"Pro Tips Page - Staging Lable - Most Popular"),
	lblTakeNotesTwo_STG("//div[@id='accordion__Most Popular']/div[2]/div[1]",XPATH,"Pro Tips Page - Staging - Label - Take Notes Two"),
	txtParaTakeNotesTwo_STG("//div[@id='accordion__Most Popular']/div[2]/div[2]",XPATH,"Pro Tips Page - Staging - Text Para - Take Notes Two"),
	
	lblWrapForAddedMoisture_STG("(//div[@id='accordion-title-wrap-for-added-moisture'])[1]",XPATH,"Pro Tips Page - Stagin - Label - Wrap For Added Moisture"),
	txtParaWrapForAddedMoisture_STG("//div[@id='accordion__Most Popular']/div[3]/div[2]",XPATH,"Pro Tips Page - Staging Text Para - Wrap For Added Moisture"),
	
	lblSeasonYourSmoker_STG("(//div[@id='accordion-title-season-your-smoker'])[1]",XPATH,"Pro Tips Page - Staging Label Season Your Smoker"),
	txtParaSeasonYourSmoker_STG("//div[@id='accordion__Most Popular']/div[4]/div[2]",XPATH,"Pro Tips Page - Staging Text Para - Season Your Smoker"),
	
	lblEntertaining_STG("//div[@id='accordion__Entertaining']/div[1]",XPATH,"Pro -Tips Page - Label - Entertaining"),
	lblTaeNotesTwo_Entertaining_STG("//div[@id='accordion__Entertaining']/div[2]/div[1]",XPATH,"Pro Tips Page - Under label - Entertaining - Take Notes Two"),
	txtParaTakeNoteTwo_Entertaining_STG("//div[@id='accordion__Entertaining']/div[2]/div[2]",XPATH,"Pro Tips Page - Under label Entertaining - Take Notes Two - paragraph"),
	lblDontGiveUp_Entertaining_STG("//div[@id='accordion__Entertaining']/div[3]",XPATH,"Pro - Tips Page - Label - Dont Give Up"),
	txtParaDontGiveUpEntertaining_STG("//div[@id='accordion__Entertaining']/div[3]/div[2]",XPATH,"Pro - Tips page - Label - paragraph - Dont give Up"),
	
	lblWrapForAddedMoisture_Entertaining_STG("//div[@id='accordion__Entertaining']/div[4]",XPATH,"Pro Tips Page - Label - Under Entertaining - Wrap For Added Moisture"),
	txtParaWrapForAddedMoisture_Entertaining_STG("//div[@id='accordion__Entertaining']/div[4]/div[2]",XPATH,"Pro Tips Page - Label Paragraph for Entertaining - Wrap for added moisture"),
	
	lblSeasonYourSmoker_Entertaining_STG("//div[@id='accordion__Entertaining']/div[5]",XPATH,"Pro Tips Page - Staging Label Season Your Smoker"),
	txtParaSeasonYourSmoker_Entertaining_STG("//div[@id='accordion__Entertaining']/div[5]/div[2]",XPATH,"Pro Tips Page - Staging Text Para - Season Your Smoker"),
	
	
	lblTheSmoke("//div[@id='accordion__The Smoke']/div[1]",XPATH,"Pro-Tips Page - Label - The Smoke"),
	lblWrapAdddedMoisture("//div[@id='accordion__The Smoke']/div[2]/div[1]",XPATH,"Pro-Tips Page - The Smoke Section - Label - Wrap for Added Moisture"),
	txtparaWrapAddedMoisture("//div[@id='accordion__The Smoke']/div[2]/div[2]",XPATH,"Pro-Tips Page - The Smoke Section - Pargraph for Wrap for Added Moisture"),
	lblExperimentWithDifferentWoods("//div[@id='accordion__The Smoke']/div[3]",XPATH,"Pro-Tips - The Smoke Section - Expand Experiment With Different Woods"),
	txtParaExperimentWithDifferentWoods("//div[@id='accordion__The Smoke']/div[3]/div[2]",XPATH,"Pro-Tips - The Smoke Section - Paragraph for Experiement With Different Woods"),
	lblTheBarkShouldBeBark("//div[@id='accordion__The Smoke']/div[4]",XPATH,"Pro-Tips - The Smoke Section - Expand The Bark Should be Bark"),
	txtParaTheBarkShouldBeBark("//div[@id='accordion__The Smoke']/div[4]/div[2]",XPATH,"ProTips - The Smoke Section - Paragraph for The Bark Should be Bark"),
	lblLetItRest("//div[@id='accordion__The Smoke']/div[5]",XPATH,"Pro-Tips - The Smoke Section - Let It Rest"),
	txtParaLetItRest("//div[@id='accordion__The Smoke']/div[5]/div[2]",XPATH,"Pro-Tips - The Smoke Section - Pargraph for Let it Rest"),
	

	lblTheSetUp("//div[@id='accordion__The Setup']/div[1]",XPATH,"Pro-Tips Page - Label - The Setup"),
	lblSeasonYourSmoker("//div[@id='accordion__The Setup']/div[2]",XPATH,"Pro-Tips Page - The SetUP Section - Label - Season Your Smoker"),
	txtParaSeasonYourSmoker("//div[@id='accordion__The Setup']/div[2]/div[2]",XPATH,"Pro-Tips Page - The Setup Section - Paragraph for Season Your Smoker"),
	lblBuildAfireFirefox("//div[@id='accordion__The Setup']/div[3]",XPATH,"Pro-Tips Page - The Setup Section - Label - Build a Fire in your Firefox for Cooking"),
	txtParaBuildAFireFirefox("//div[@id='accordion__The Setup']/div[3]/div[2]",XPATH,"Pro-Tips Page - The Setup Section - Paragraph for Build a fire in your Firefox for cooking"),
	
	lblTheProcess("//div[@id='accordion__The Process']/div[1]",XPATH,"Pro-Tips Page - Label - The Process"),
	lblNoteTakingPerfectCraft("//div[@id='accordion__The Process']/div[2]",XPATH,"Pro-Tips Page - The Process Section - Expan - Note-Taking to Perfect Your Craft"),
	txtParaNoteTakingPerfectCraft("//div[@id='accordion__The Process']/div[2]/div[2]",XPATH,"Pro-Tips - The Process Section - Paragraph - Note-Taking to Perfect Your Craft"),
	lblDontGiveUp("//div[@id='accordion__The Process']/div[3]",XPATH,"Pro-Tips - The Process Section - Expand - Dont Give UP"),
	txtParDontGiveUp("//div[@id='accordion__The Process']/div[3]/div[2]",XPATH,"Pro-Tips - The Process Section - Paragraph for Don't Give Up"),
	lblSlowAndLow("//div[@id='accordion__The Process']/div[4]",XPATH,"Pro-Tips - The Process Section - Expand- Slow And Low"),
	txtParaSlowAndLow("//div[@id='accordion__The Process']/div[4]/div[2]",XPATH,"Pro - Tips - The Process Section - Paragraph for Slow and Low"),
	lblDryRubsSaveTime("//div[@id='accordion__The Process']/div[5]",XPATH,"Pro-Tips - The Process Section - Dry Rubs Save Time"),
	txtParaDryRubsSaveTime("//div[@id='accordion__The Process']/div[5]/div[2]",XPATH,"Pro Tips - The Process Section - Paragraph for Dry Rubs Save Time"),

	subTitleMoreFromTheCraft("//div[@class='cards__heading--craft cards__heading text-center']",XPATH,"Pro-Tips Page - Sub Title - More From the Craft"),
	lnkSubCategoryLink1("//div[@class='cards__container container']/a[1]",XPATH,"Pro-Tips Page - More From the Craft - Subcategory 1- image 1"),
	lnkSubCategoryLink2("//div[@class='cards__container container']/a[2]",XPATH,"Pro-Tips Page - More From the Craft - SubCategory 2 - Image 2"),
	lnkSubCategoryLink3("//div[@class='cards__container container']/a[3]",XPATH,"Pro-Tips Page - More From the Craft - SubCategory 3 - Image 3"),
	
	headingMoreFromCartLink1Page("//section[@class='recipe-detail-card']/h1",XPATH,"Pro-Tips- More From Cart Sub Category 1- AppleWood Smoked Chiken Sandwiches"),
	headingMoreFromCartLink2Page("//section[@class='recipe-detail-card']/h1",XPATH,"Pro-Tips - More From Cart Sub Category 2 - chipotle Lime Beef Jerky"),
	headingMoreFromCartLink3Page("//section[@class='recipe-detail-card']/h1",XPATH,"Pro-Tips - More From Cart Sub Category 3 - Maple SriRacha Chiken Wings"),
	
	btnViewAllFromTheCraft("//a[@class='button text-center']",XPATH,"Pro-Tips Page - Button - View All From The Craft"),
	
	subTitleGetRecipes("//div[@class='newsletter__title']",XPATH,"Pro-Tips Page - Sub Title - Get Recipes & Tips Delivered to Your Inbox"),
	txtBoxEmailAddress("newsletter",ID,"Pro-Tips Page - Get Recipes & Tips Delivered To Your Inbox - Text Box - Email Address"),
	btnSignMeUp("//button[@class='newsletter__button']",XPATH,"Pro-Tips Page - Get Recipes & tips - Sign Me Up Button"),
	lblSignUPSuccessful("//div[@class='newsletter__title']/h1",XPATH,"Pro-Tips Page- You are signed up pop up"),
	
	;

	String strProperty = "";
	ObjectLocator locatorType = null;
	String strObjName = "";

	public String getProperty() {
		return strProperty;
	}

	public ObjectLocator getLocatorType() {
		return locatorType;
	}

	private ProTipsPageObjects(String strPropertyValue, ObjectLocator locatorType, String strObjName) {
		this.strProperty = strPropertyValue;
		this.locatorType = locatorType;
		this.strObjName = strObjName;
	}

	@Override
	public String getObjectname() {
		// TODO Auto-generated method stub
		return strObjName;
	}
}
