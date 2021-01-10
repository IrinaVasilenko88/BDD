package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Selenide.page;

@Name("Страница подтверждения входа")
public class VerificationPage extends AkitaPage {
    @Name("Код из смс")
    @FindBy(css = "[data-test-id=code] input")
    private SelenideElement codeField;

    @Name("Продолжить")
    @FindBy(css = "[data-test-id=action-verify]")
    private SelenideElement verifyButton;

    public VerificationPage() {

    }

    public DashboardPage validVerify(DataHelper.VerificationCode verificationCode) {
        codeField.setValue(verificationCode.getCode());
        verifyButton.click();
        return page(DashboardPage.class);
    }
}
