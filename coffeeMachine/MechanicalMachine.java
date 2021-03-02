package com.coffeeMachine;

class MechanicalMachine implements CoffeeMachine{
    String coffeeBeans;
    boolean holder;

    @Override
    public void makeCoffee(){
        System.out.print("делаем кофе в механической-кофемашине");
    }
    public void settingBookmarks(){
        System.out.print("установка нужной закладки кофе");
    }
}
