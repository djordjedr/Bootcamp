package banka;
/*
Потребно је направити тест за исправност класе Account. Ако се на основу тестова пронађе нека грешка у коду 
потребно је да се поправи оригинални код.
a)     Проверити да ли конструктор public Account(String name, String number) добро поставља аргументе, као 
и да ли get-ери враћају одговарајуће вредности. Када се направи налог, стање треба да буде једнако 0.
b)    Проверити да ли set-ери добро постављају одговарајуће вредности, као и да ли get-ери враћају одг
оварајуће вредности.
c)     Проверити да ли је исправан формат исписа једног Account-a. Очекивани формат исписа:
 broj<tab>ime<tab>stanje . Стање треба да буде заокружено на две децимале.
d)    Направити 100.000 налога помоћу конструктора public Account(String name) и проверити да ли
 се сви бројеви разликују.

*/

import java.util.Random;
import java.util.UUID;

public class Zadatak {
	
    private String number;
    private String name;
    private Double amount;
    public Zadatak(String name, String number){
        this.number=number;
        this.name=name;
        //this.amount=d;
    }
    public Zadatak(String name){
        this(name,UUID.randomUUID().toString());
    }
    public String getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return String.format("%s %s %.2f",number,name,amount);
    }
}
