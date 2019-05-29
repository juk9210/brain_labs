package ua.zp.brain.labs.oop.basics.exceptions;

public class MoneyTransactionUtil {
    private MoneyTransactionUtil() {
    }
    static void sendTo(int cardNumber1, int cardNumber2, int sum) throws AccountException,MoneyValueExeption {
          if(cardNumber1==cardNumber2){
              throw new AccountException();
          }
          if(sum<=0||sum>100000){
              throw new MoneyValueExeption();
          }
        System.out.println("Сумма - "+sum+" со счета - "+ cardNumber1+" успешно переведена на счет - "+cardNumber2);
        }
    }
