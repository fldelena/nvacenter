package card.credit_card.bonus_card;

import card.credit_card.CreditCard;

public class CreditFavoriteCard extends CreditCard {

    private final double discountPct = 0.01;

    public CreditFavoriteCard(double creditLimit) {
        super(creditLimit);
    }

    @Override
    public boolean pay(double spent){
        if(cardBalance > 0){
            spent *= (1-discountPct);
        }
        return super.pay(spent);
    }

    @Override
    public void allInfo(){
        super.allInfo();
        System.out.printf("Скидка в %.1f %% при наличии собственных средств%n",
                discountPct*100);
    }
}
