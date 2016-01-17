package com.company;

/**
 * Created by Ukrainian IT_School on 17.01.2016.
 */
public class Girl {
    int age;
    double height;
    boolean knowledge;
    Girl(){
        age = 18;
        height= 1.65;
        knowledge = true;
    }
    Girl(int age, int height, boolean knowledge){
        this.age = age;
        this.height=height;
        this.knowledge=knowledge;
    }
    String restaurant (String restaurant){
        if (restaurant.equals("McD")){

           return "Won`t go!";
        }
        else {
            return "Let`s go!";
        }

    }
    String cinema (String cinema){
        if (cinema.equals("Horror"))
        {
            return  "Won`t go";
        }
        else {
            return  "Let`s go!";
        }
    }
}
