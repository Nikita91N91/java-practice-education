package com.dmdev.lesson15;

import com.dmdev.lesson18.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {
    public Warrior(String name, int damage) {
        super(name, damage);
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " ударил мечом " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
