package pages;

import static pages.ObjectLocator.*;

public enum PelletPageObjects implements PageObjects {

	
	headerLogo("a.header-logo",CSS,"Header Logo"),
	textHeroTitle("//span[@class='homepage-hero__top-text homepage-hero__bottom-text']",XPATH,"Hero Title on hero Image"),
	textHeroButtomText("//span[@class='homepage-hero__bottom-text']",XPATH,"Hero Text on hero Image"),
	texproduct1("(//*[@class='feature-product--rider'])[1]",XPATH,"First product title"),
	texproduct2("(//*[@class='feature-product--rider'])[2]",XPATH,"Second product title"),
	texproduct3("(//*[@class='feature-product--rider'])[3]",XPATH,"Third product title"),
	btnLearnProduct1("(//*[@class='feature-product__learn button'])[1]",XPATH,"Learn button for first product"),
	btnLearnProduct2("(//*[@class='feature-product__learn button'])[2]",XPATH,"Learn button for second product"),
	btnLearnProduct3("(//*[@class='feature-product__learn button'])[3]",XPATH,"Learn button for third product"),
	linkLearnMoreAboutPellet("//*[@class='lifestyle-grid__cta']",XPATH,"Laern more about Pellet grills link"),
	linkSeeRecipe1("(//a[@class=\"pagebuilder-recipes-infocard__inner__right__cta\"])[1]",XPATH,"See recipe link 1"),
	linkSeeRecipe2("(//a[@class=\"pagebuilder-recipes-infocard__inner__right__cta\"])[2]",XPATH,"See recipe link 2"),
	btnSlider1("(//div[@class='feature-product__arrow right'])[1]",XPATH,"Image slider 1"),
	btnslider2("//div[@class='feature-product__arrow left']",XPATH,"Image slider 2"),
	btnSlider3("(//div[@class='feature-product__arrow right'])[2]",XPATH,"Image slider 3"),
	linkFindPartsAndManuals("//*[@class='specifications__parts-link']",XPATH,"Find Parts and Manuals link"),
	linkReplacementGuide("(//*[@class='parts__link'])[2]",XPATH,"Replacement Guide Link"),
	contentPDFReplacementGuide("//div[@id='content']",XPATH,"Replacement Guide PDF"),
	linkProductGuide("(//*[@class='guide__link'])[1]",XPATH,"Product Guide Link"),
	
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

	private PelletPageObjects(String strPropertyValue, ObjectLocator locatorType, String strObjName) {
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
