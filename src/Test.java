import card.BankCard;
import card.credit_card.CreditCard;
import card.credit_card.bonus_card.CreditBuyerCard;
import card.credit_card.bonus_card.CreditFavoriteCard;
import card.credit_card.bonus_card.CreditSpenderCard;
import card.debit_card.DebitCard;
import card.debit_card.bonus_card.DebitDepositCard;
import card.debit_card.bonus_card.DebitDiscountCard;
import card.debit_card.bonus_card.DebitSavingsCard;

public class Test  {

    public static void main(String[] args) {

        BankCard debitCard = new DebitCard(1000);
        System.out.println(debitCard.pay(900));
        debitCard.topUpBalance(1100);
        System.out.println(debitCard.pay(2000));
        debitCard.balanceInfo();
        debitCard.allInfo();

        System.out.println("-------------------------------------");

        BankCard debitSavingsCard = new DebitSavingsCard(2000);
        System.out.println(debitSavingsCard.pay(900.00));
        debitSavingsCard.topUpBalance(100000.30);
        System.out.println(debitSavingsCard.pay(2000.00));
        debitSavingsCard.balanceInfo();
        debitSavingsCard.allInfo();

        System.out.println("-------------------------------------");

        BankCard debitDiscountCard = new DebitDiscountCard(2000);
        System.out.println(debitDiscountCard.pay(900));
        debitDiscountCard.topUpBalance(100000);
        System.out.println(debitDiscountCard.pay(50000));
        debitDiscountCard.balanceInfo();
        debitDiscountCard.allInfo();

        System.out.println("-------------------------------------");

        BankCard debitDepositCard = new DebitDepositCard(2000);
        System.out.println(debitDepositCard.pay(1200));
        debitDepositCard.topUpBalance(100000.00);
        System.out.println(debitDepositCard.pay(24000));
        debitDepositCard.balanceInfo();
        debitDepositCard.allInfo();

        System.out.println("-------------------------------------");

        BankCard creditCard = new CreditCard(10000.50);
        System.out.println(creditCard.pay(5000));
        creditCard.topUpBalance(7000);
        System.out.println(creditCard.pay(1000.00));
        creditCard.balanceInfo();
        creditCard.allInfo();

        System.out.println("-------------------------------------");

        BankCard creditBuyerCard = new CreditBuyerCard(10000.50);
        System.out.println(creditBuyerCard.pay(5000));
        creditBuyerCard.topUpBalance(7000);
        System.out.println(creditBuyerCard.pay(1000.00));
        System.out.println(creditBuyerCard.pay(2200.00));
        System.out.println(creditBuyerCard.pay(300000.50));
        creditBuyerCard.balanceInfo();
        creditBuyerCard.allInfo();

        System.out.println("-------------------------------------");

        BankCard creditSpenderCard = new CreditSpenderCard(10000.50);
        System.out.println(creditSpenderCard.pay(1000));
        creditSpenderCard.topUpBalance(20000);
        creditSpenderCard.allInfo();
        System.out.println(creditSpenderCard.pay(15000.00));
        creditSpenderCard.balanceInfo();
        creditSpenderCard.allInfo();

        System.out.println("-------------------------------------");

        BankCard creditFavoriteCard= new CreditFavoriteCard(10000);
        creditFavoriteCard.topUpBalance(20000);
        System.out.println(creditFavoriteCard.pay(15000));
        creditFavoriteCard.balanceInfo();
        creditFavoriteCard.allInfo();

    }
}
