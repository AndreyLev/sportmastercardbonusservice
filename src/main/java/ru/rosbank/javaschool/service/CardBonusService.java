package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.BonusCard;

public class CardBonusService {

    public int bonusForCurrentPurchase(double accumulatedAmount, double currentPurchaseValue) {

        int bonus = 0;

        if (currentPurchaseValue > BonusCard.zero) {

            if (accumulatedAmount >= BonusCard.blueCardMinAmount && accumulatedAmount < BonusCard.silverCardMinAmount) {
                bonus = BonusCard.blueCardBonusValue * (int) Math.floor(currentPurchaseValue / BonusCard.amountPerBonusUnit);
            }

            if (accumulatedAmount >= BonusCard.silverCardMinAmount && accumulatedAmount < BonusCard.goldCardMinAmount) {
                bonus = BonusCard.silverCardBonusValue * (int) Math.floor(currentPurchaseValue / BonusCard.amountPerBonusUnit);
            }

            if (accumulatedAmount >= BonusCard.goldCardMinAmount) {
                bonus = BonusCard.goldCardBonusValue * (int) Math.floor(currentPurchaseValue / BonusCard.amountPerBonusUnit);
            }

        }

        return bonus;
    }

}
