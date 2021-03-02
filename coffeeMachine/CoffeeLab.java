package com.coffeeMachine;

public class CoffeeLab {

    public static void main(String[] args) {
        System.out.print("Виртуальные методы, проверка:\n");
        CoffeeMachine coffeeMaker0 = new AutoMachine();
        coffeeMaker0.makeCoffee();
        System.out.print("\n");
        CoffeeMachine coffeeMaker1 = new MechanicalMachine();
        coffeeMaker1.makeCoffee();

        System.out.print("\nМножественное наследование, проверка:\n");
        TeoremaA2 mixCoffeeMaker = new TeoremaA2();
        mixCoffeeMaker.settingBookmarks();
        System.out.print("\n");
        AutoMachine objAuto = new AutoMachine();
        mixCoffeeMaker.makeCoffee(objAuto);
        System.out.print("\n");
        MechanicalMachine objMech = new MechanicalMachine();
        mixCoffeeMaker.makeCoffee(objMech);
        System.out.print("\n");
        mixCoffeeMaker.choiceCoffee();
    }
}

