package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.BonusCard;

public class CardBonusService {


    final static int PENNIES_IN_RUBLE = 100;

    public int bonusForCurrentPurchase(double accumulatedAmount, double currentPurchaseValue) {

        int accumulatedAmountInPennies = (int)(accumulatedAmount * PENNIES_IN_RUBLE);
        int currentPurchaseValueInPennies = (int)(currentPurchaseValue * PENNIES_IN_RUBLE);
        int bonus = 0;

        if (accumulatedAmountInPennies <= 0) {
            return 0;
        }

        if (currentPurchaseValueInPennies <= 0) {
            return 0;
        }

        if (accumulatedAmountInPennies < (BonusCard.SILVER_CARD_MIN_AMOUNT * PENNIES_IN_RUBLE)) {
            bonus = BonusCard.BLUE_CARD_BONUS_VALUE * (int) Math.floor((double)currentPurchaseValueInPennies / (BonusCard.AMOUNT_PER_BONUS_UNIT * PENNIES_IN_RUBLE));
            return bonus;
        }

        if (accumulatedAmountInPennies < (BonusCard.GOLD_CARD_MIN_AMOUNT * PENNIES_IN_RUBLE)) {
            bonus = BonusCard.SILVER_CARD_BONUS_VALUE * (int) Math.floor((double)currentPurchaseValueInPennies / (BonusCard.AMOUNT_PER_BONUS_UNIT * PENNIES_IN_RUBLE));
            return bonus;
        }

        bonus = BonusCard.GOLD_CARD_BONUS_VALUE * (int) Math.floor((double)currentPurchaseValueInPennies / (BonusCard.AMOUNT_PER_BONUS_UNIT * PENNIES_IN_RUBLE));
        return bonus;
    }


}
