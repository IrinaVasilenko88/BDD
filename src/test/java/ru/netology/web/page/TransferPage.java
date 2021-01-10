package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import static com.codeborne.selenide.Selenide.page;


public class TransferPage extends AkitaPage {

    @Name("Заголовок")
    @FindBy(css = "[data-test-id=dashboard]")
    private SelenideElement heading;

    @Name("Сумма перевода")
    @FindBy(css = "[data-test-id='amount'] input")
    private SelenideElement amountField;

    @Name("Поле откуда")
    @FindBy(css = "[data-test-id='from'] input")
    private SelenideElement fromCardField;

    @Name("Пополнить")
    @FindBy(css = "[data-test-id='action-transfer']")
    private SelenideElement transferButton;

    public DashboardPage transferMoney(String amount, String cardNumber) {
        amountField.setValue(amount);
        fromCardField.setValue(cardNumber);
        transferButton.click();
        return page(DashboardPage.class);
    }
}
