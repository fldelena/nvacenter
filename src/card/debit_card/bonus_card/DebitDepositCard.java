package card.debit_card.bonus_card;

import card.debit_card.DebitCard;

public class DebitDepositCard extends DebitCard {

    private final double savingsPct = 0.005;

    private double savings = 0.0;

    public DebitDepositCard(double cardBalance) {
        super(cardBalance);
    }

    @Override
    public void topUpBalance(double added) {
        super.topUpBalance(added);
        if(added > 10000){
            savings += savingsPct * added;
        }
    }

    @Override
    public void allInfo() {
        super.allInfo();
        System.out.printf("Накопление от суммы пополнений - %.2f р.%n" +
                        "Накопительный процент - %.1f %% для зачислений свыше 10000 р.%n",
                savings, savingsPct * 100);
    }
}
