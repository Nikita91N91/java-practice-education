package com.dmdev.lesson18;

import com.dmdev.lesson15.Archer;
import com.dmdev.lesson15.Hero;
import com.dmdev.lesson15.Warrior;
import com.dmdev.lesson18.weapon.*;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Legolas", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<Sword>("Baromir", 10);
        warrior.setWeapon(new Sword());

        printWeaponDamage(warrior);
    }

    public static void printWeaponDamage(Hero< Sword> hero) {
        Sword weapon = hero.getWeapon();
        System.out.println(hero.getWeapon().getDamage());
    }
}
