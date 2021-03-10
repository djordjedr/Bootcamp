package banka;
import java.util.ArrayList;
import java.util.List;
/*
 * Потребно је направити тест за исправност класе Bank. За све тестове потребно је направити јединствену 
 * банку која се на почетку теста ресетује. Сматрати да ова банка не може да има налог код којег је стање 
 * негативно. Ако се на основу тестова пронађе нека грешка у коду потребно је да се поправи оригинални код.
a)     Потребно је испитати да ли адекватно ради отварање налога, тако што ће се убацити 5 налога и затим 
испитати да ли се ти налози могу дохватити.
b)    Проверити да ли добро ради метода за уплату новца.
c)     Проверити да ли добро ради метода за трансфер новца.
d)    Проверити да ли добро ради метода за рачунање укупног новца у банци (getSumMoney).
 */
public class Bank {
    private List<Account> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }

    public Account openAccount(String name){
        Account account = new Account(name);
        accounts.add(account);
        return account;
    }

    public void closeAccount(Account account)
    {
        accounts.remove(account);
    }

    public boolean transferMoney(String accountNumberFrom, String accountNumberTo, Double amount)
    {
        Account from = getAccount(accountNumberFrom);
        if(from!=null)
            from.setAmount(from.getAmount()-amount);
        Account to = getAccount(accountNumberFrom);
        if(to!=null)
            to.setAmount(to.getAmount()+amount);
        return true;
    }

    public void payInMoney(String accountNumber, Double amount){
        Account account = getAccount(accountNumber);
        if(account!=null)
            account.setAmount(account.getAmount()+amount);
    }

    public Account getAccount(String accountNumber){
        for(Account acc:accounts)
            if(acc.getNumber()==accountNumber)
                return acc;

        return null;
    }


    public Double getSumMoney(){
        Double res=0d;
        for (int i = 1; i < accounts.size(); i++) {
            res+=accounts.get(i).getAmount();
        }
        return res;
    }

    public void reset(){
        accounts.clear();
    }

}