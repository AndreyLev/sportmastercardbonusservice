package ru.rosbank.javaschool.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardBonusServiceTest {

    @Test
    void shouldBonusBeZero() {
        CardBonusService cardBonusService = new CardBonusService();

        int result = cardBonusService.bonusForCurrentPurchase( 8370.20, 1);

        assertEquals(0, result);
    }

    @Test
    void isThereABonusOnABlueCard() {
        CardBonusService cardBonusService = new CardBonusService();

        int result = cardBonusService.bonusForCurrentPurchase(4550.70, 5320);

        assertEquals(250, result);
    }

    @Test
    void isThereABonusOnASilverCard() {
        CardBonusService cardBonusService = new CardBonusService();

        int result = cardBonusService.bonusForCurrentPurchase(15001, 3999);

        assertEquals(210, result);
    }

    @Test
    void isThereABonusOnAGoldCard() {
        CardBonusService cardBonusService = new CardBonusService();

        int result = cardBonusService.bonusForCurrentPurchase(230568.76, 13700);

        assertEquals(1300, result);
    }

    @Test
    void shouldBonusWhenPurchaseIsNegative() {
        CardBonusService cardBonusService = new CardBonusService();

        int result = cardBonusService.bonusForCurrentPurchase( 8370.20, -2030);

        assertEquals(0, result);
    }
}