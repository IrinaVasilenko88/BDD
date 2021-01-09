package ru.netology.web.data;

import lombok.Value;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.Random;


public class DataHelper extends AkitaPage {

    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo getOtherAuthInfo(AuthInfo original) {
        return new AuthInfo("petya", "123qwerty");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }

    @Value
    public static class CardInfo {
        private String cardNumber;
    }

    public static CardInfo getFirstCardInfo() {
        return new CardInfo("5559 0000 0000 0001");
    }

    public static CardInfo getSecondCardInfo() {
        return new CardInfo("5559 0000 0000 0002");
    }

    @Value
    public static class TransferAmount {
        private int cardBalance;
    }

    public int getTransferAmount(int cardBalance) {
        Random random = new Random();
        int transferSum = random.nextInt(cardBalance);
        return transferSum;

    }

}