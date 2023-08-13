package card.credit_card.bonus_card;

import card.credit_card.CreditCard;

public class CreditSpenderCard extends CreditCard {

    private final double cashbackPct = 0.05;

    public CreditSpenderCard(double creditLimit) {
        super(creditLimit);
    }

    @Override
    public boolean pay(double spent){
        if(!super.pay(spent))
            return false;
        if(spent > 5000){
            topUpBalance(spent * cashbackPct);
        }
        return true;
    }

    @Override
    public void allInfo(){
        super.allInfo();
        System.out.printf("Кэшбэк в размере %.0f %% при тратах более 5 тыс. р.%n",
                cashbackPct*100);
    }

}
