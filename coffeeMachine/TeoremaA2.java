package com.coffeeMachine;

class TeoremaA2 {
    MechanicalMachine obj1 = new MechanicalMachine();
    AutoMachine obj2 = new AutoMachine();
    boolean cleaning;

    void cleaningHolder() {
        System.out.print("Очитска холдера");
    }

    void makeCoffee(MechanicalMachine o1) {
        obj1.makeCoffee();
    }

    void makeCoffee(AutoMachine o2) {
        obj2.makeCoffee();
    }

    void settingBookmarks() {
        obj1.settingBookmarks();
    }

    void choiceCoffee() {
        obj2.choiceCoffee();
    }
}
