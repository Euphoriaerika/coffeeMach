package com.coffeeMachine;

class AutoMachine implements CoffeeMachine{
    String coffeeBeans;
    String nameCoffee;

    @Override
    public void makeCoffee(){
        System.out.print("делаем кофе в авто-кофемашине");
    }
    public void choiceCoffee(){
        System.out.print("выбираем нужное кофе в меню");
    }
}
