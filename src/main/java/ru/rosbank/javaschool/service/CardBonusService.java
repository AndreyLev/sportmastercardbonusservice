package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.BonusCard;

public class CardBonusService {


    final static int penniesInRuble = 100;

    public int bonusForCurrentPurchase(double accumulatedAmount, double currentPurchaseValue) {

        int accumulatedAmountInPennies = (int)(accumulatedAmount * penniesInRuble);
        int currentPurchaseValueInPennies = (int)(currentPurchaseValue * penniesInRuble);
        int bonus = 0;

        if (accumulatedAmountInPennies <= 0) {
            return 0;
        }

        if (currentPurchaseValueInPennies <= 0) {
            return 0;
        }

        if (accumulatedAmountInPennies < (BonusCard.silverCardMinAmount * penniesInRuble)) {
            bonus = BonusCard.blueCardBonusValue * (int) Math.floor((double)currentPurchaseValueInPennies / (BonusCard.amountPerBonusUnit * penniesInRuble));
            return bonus;
        }

        if (accumulatedAmountInPennies < (BonusCard.goldCardMinAmount * penniesInRuble)) {
            bonus = BonusCard.silverCardBonusValue * (int) Math.floor((double)currentPurchaseValueInPennies / (BonusCard.amountPerBonusUnit * penniesInRuble));
            return bonus;
        }

        bonus = BonusCard.goldCardBonusValue * (int) Math.floor((double)currentPurchaseValueInPennies / (BonusCard.amountPerBonusUnit * penniesInRuble));
        return bonus;
    }


}
