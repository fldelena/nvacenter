package card.debit_card;

import card.BankCard;

public class DebitCard extends BankCard {

    public DebitCard(double cardBalance){
        super(cardBalance);
    }

    /*
    Согласно 3 пункту задания, здесь должен быть реализован метод Пополнения,
    Он был перенесен в абстрактный класс, согласно 9 пункту.
     */

    @Override
    public void balanceInfo(){
        System.out.printf("Баланс дебетовой карты составляет %.2f р.%n",
                cardBalance);
    }
}
