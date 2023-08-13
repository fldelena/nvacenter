package card.debit_card.bonus_card;

import card.debit_card.DebitCard;

public class DebitSavingsCard extends DebitCard {

    private final double savingsPct = 0.00005;

    private double savings = 0.0;

    public DebitSavingsCard(double cashBalance) {
        super(cashBalance);
    }

    @Override
    public void topUpBalance(double added) {
        super.topUpBalance(added);
        savings += savingsPct * added;
    }

    @Override
    public void allInfo() {
        super.allInfo();
        System.out.printf("Накопление от суммы пополнений - %.2f р.%n" +
                        "Накопительный процент - %.3f %%%n",
                savings, savingsPct * 100);
    }
}
