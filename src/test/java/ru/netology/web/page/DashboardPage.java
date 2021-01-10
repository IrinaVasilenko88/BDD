package ru.netology.web.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.val;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

@Name("Страница со списком карт")
public class DashboardPage extends AkitaPage {
    private final AkitaScenario scenario = AkitaScenario.getInstance();

    @Name("Заголовок")
    @FindBy(css = "[data-test-id=dashboard]")
    private SelenideElement heading;

    @Name("Список карт")
    @FindBy(css = ".list__item")
    private ElementsCollection cards;

    @Name("Пополнить1")
    @FindBy(css = "[data-test-id = '92df3f1c-a033-48e6-8390-206f6b1f56c0'] [class=button__text]")
    private SelenideElement transferButton1;

    @Name("Пополнить2")
    @FindBy(css = "[data-test-id= '0f3f5c2a-249e-4c3d-8287-09f7a039391d'] [class=button__text]")
    private SelenideElement transferButton2;

    private final String balanceStart = "баланс: ";
    private final String balanceFinish = " р.";

    public DashboardPage() {
    }

    private int extractBalance(String text) {
        val start = text.indexOf(balanceStart);
        val finish = text.indexOf(balanceFinish);
        val value = text.substring(start + balanceStart.length(), finish);
        return Integer.parseInt(value);
    }


    public int getCardBalance(String cardNumber) {
        return extractBalance(cards.find(text(cardNumber.substring(15, 19))).getText());
    }

    public TransferPage depositToFirstCard() {
        transferButton1.click();
        return page(TransferPage.class);
    }

    public TransferPage depositToSecondCard() {
        transferButton2.click();
        return page(TransferPage.class);
    }


}