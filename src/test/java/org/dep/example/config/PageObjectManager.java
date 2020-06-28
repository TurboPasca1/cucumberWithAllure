package org.dep.example.config;

import org.dep.example.pages.GoogleResultPage;
import org.dep.example.pages.GoogleSearchPage;

public class PageObjectManager {

  private static GoogleSearchPage googleSearchPage;
  private static GoogleResultPage googleResultPage;

  public static GoogleSearchPage getGoogleSearchPage() {
    if (googleResultPage == null) {
      googleSearchPage = new GoogleSearchPage(WebDriverManager.getWebDriver());
    }
    return googleSearchPage;
  }

  public static GoogleResultPage getGoogleResultPage() {
    return googleResultPage;
  }

  public static void setGoogleSearchPage(GoogleSearchPage googleSearchPage) {
    PageObjectManager.googleSearchPage = googleSearchPage;
  }

  public static void setGoogleResultPage(GoogleResultPage googleResultPage) {
    PageObjectManager.googleResultPage = googleResultPage;
  }

  public static void resetPageObjects() {
//    googleSearchPage = new GoogleSearchPage(WebDriverManager.getWebDriver());
    googleSearchPage = null;
//    googleResultPage = new GoogleResultPage(WebDriverManager.getWebDriver());
    googleResultPage = null;
  }
}
