package ru.rosbank.javaschool.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardBonusServiceTest {

    @Test
    void shouldBonusBeZero() {
        CardBonusService cardBonusService = new CardBonusService();

        int result = cardBonusService.bonusForCurrentPurchase( 8370.20, 1);

        assertEquals(result, 0);
    }

    @Test
    void isThereABonusOnABlueCard() {
        CardBonusService cardBonusService = new CardBonusService();

        int result = cardBonusService.bonusForCurrentPurchase(4550.70, 5320);

        assertEquals(result, 250);
    }

    @Test
    void isThereABonusOnASilverCard() {
        CardBonusService cardBonusService = new CardBonusService();

        int result = cardBonusService.bonusForCurrentPurchase(15001, 3999);

        assertEquals(result, 210);
    }

    @Test
    void isThereABonusOnAGoldCard() {
        CardBonusService cardBonusService = new CardBonusService();

        int result = cardBonusService.bonusForCurrentPurchase(230568.76, 13700);

        assertEquals(result, 1300);
    }

}