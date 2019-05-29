package ua.zp.brain.labs.oop.basics.exceptions;

public class UserBank {
    public static void main(String[] args) {
        try{
            MoneyTransactionUtil.sendTo(124,122,-54);
        }catch (RuntimeException c){
            System.out.println("При обработке транзакции банка произошла ошибка");
            c.printStackTrace();
        } catch (MoneyValueExeption moneyValueExeption) {
            System.out.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать " +
                    "лимит в 100 000");
            moneyValueExeption.printStackTrace();
        } catch (AccountException e) {
            System.out.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают");
            e.printStackTrace();
        }
    }
}
