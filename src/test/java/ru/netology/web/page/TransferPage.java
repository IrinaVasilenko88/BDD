package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import static com.codeborne.selenide.Selenide.$;
@Name("Страница перевода средств")

public class TransferPage extends AkitaPage {
    private SelenideElement heading = $("[data-test-id=dashboard]");

    @Name("Сумма перевода")
    @FindBy(css = "[data-test-id='amount']")
    private SelenideElement amountField;

    @Name("Поле откуда")
    @FindBy(css = "[data-test-id='from']")
    private SelenideElement fromCardField;

    @Name("Пополнить")
    @FindBy(css = "[data-test-id='action-transfer']")
    private SelenideElement transferButton;

    public void transferMoneyFromSecondCard() {
        amountField.setValue("5000");
        fromCardField.setValue("5559 0000 0000 0002");
        transferButton.click();
    }
}
