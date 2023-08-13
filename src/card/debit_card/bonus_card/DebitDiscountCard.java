package card.debit_card.bonus_card;

import card.debit_card.DebitCard;

public class DebitDiscountCard extends DebitCard {

    private final double discountPct = 0.03;

    public DebitDiscountCard(double cardBalance) {
        super(cardBalance);
    }

    @Override
    public boolean pay(double spent){
        if(spent > 9999){
            spent *= (1-discountPct);
        }
        return super.pay(spent);
    }

    @Override
    public void allInfo(){
        super.allInfo();
        System.out.printf("Скидка в %.0f %% при покупке на сумму от 10 тыс. р.%n",
                discountPct * 100);
    }
}
