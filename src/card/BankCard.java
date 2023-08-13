package card;

import exceptions.NegativeValueException;

public abstract class BankCard {
    protected double cardBalance;

    public BankCard(double cardBalance) {
        if (cardBalance < 0)
            throw new NegativeValueException();
        this.cardBalance = cardBalance;
    }

    public void topUpBalance(double added) {
        if (added < 0)
            throw new NegativeValueException();
        cardBalance += added;
    }

    public boolean pay(double spent) {
        if (spent < 0)
            throw new NegativeValueException();
        if (cardBalance < spent)
            return false;
        cardBalance -= spent;
        return true;
    }

    public abstract void balanceInfo();

    public void allInfo() {
        System.out.printf("Собственные средства - %.2f р.%n", cardBalance);
    }

}