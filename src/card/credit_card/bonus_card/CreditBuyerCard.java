package card.credit_card.bonus_card;

import card.credit_card.CreditCard;

public class CreditBuyerCard extends CreditCard {

    private final double bonusPct = 0.01;

    private int bonuses;

    public CreditBuyerCard(double creditLimit) {
        super(creditLimit);
    }

    @Override
    public boolean pay(double spent){
        if(!super.pay(spent))
            return false;
        bonuses = (int)(spent * bonusPct);
        return true;
    }

    @Override
    public void allInfo(){
        super.allInfo();
        System.out.printf("Накоплено %d баллов%n" +
                "Процент накопительного бонуса при покупках - %.0f %%%n",
                bonuses, bonusPct*100);
    }

}
