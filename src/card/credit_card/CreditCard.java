package card.credit_card;

import card.BankCard;
import exceptions.NegativeValueException;

public class CreditCard extends BankCard {

    private final double creditLimit;

    private double creditBalance;

    public CreditCard(double creditLimit) {
        super(0.0);
        if (creditLimit < 0)
            throw new NegativeValueException();
        this.creditLimit = creditLimit;
        this.creditBalance = creditLimit;
    }

    @Override
    public void topUpBalance(double added) {
        if (added < 0)
            throw new NegativeValueException();
        double toLimit = creditLimit - creditBalance;
        creditBalance += Math.min(toLimit, added);
        cardBalance += Math.max(added - toLimit, 0);
    }

    @Override
    public boolean pay(double spent) {
        if (spent < 0)
            throw new NegativeValueException();
        if (creditBalance + cardBalance < spent)
            return false;
        creditBalance += Math.min(cardBalance - spent, 0);
        cardBalance -= Math.min(cardBalance, spent);
        return true;
    }

    @Override
    public void balanceInfo() {
        System.out.printf("Баланс кредитной карты составляет %.2f р.%n",
                creditBalance + cardBalance);
    }

    @Override
    public void allInfo() {
        super.allInfo();
        System.out.printf("Кредитные средства - %.2f р.%n" +
                        "Кредитный лимит - %.2f р.%n",
                creditBalance, creditLimit);
    }

}
