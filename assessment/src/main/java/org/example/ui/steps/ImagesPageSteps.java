package org.example.ui.steps;

import io.qameta.allure.Step;
import org.example.ui.pages.ImagesPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ImagesPageSteps extends BaseSteps {
    private final ImagesPage page;

    public ImagesPageSteps(WebDriver driver) {
        page = new ImagesPage(driver);
    }

    @Override
    @Step(value = "Ожидание загрузки страницы Яндекс.Картинки")
    public void waitForPageToBeLoaded() {
        page.waitForPageToBeLoaded();
    }

    @Override
    @Step(value = "Проверить, что страница с Яндекс.Картинки была загружена")
    public void checkPageHaveBeenLoaded() {
        String expectedPageTitle = "Яндекс.Картинки: поиск изображений в интернете, поиск по картинке";
        Assertions.assertEquals(expectedPageTitle, page.getPageTitle(),
                "Заголовок страницы Яндекс.Картинки не совпадает с ожидаемым");
    }
}