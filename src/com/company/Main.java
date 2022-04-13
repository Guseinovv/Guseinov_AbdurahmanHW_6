package com.company;

public class Main {

    public static void main(String[] args) {
    Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(300);
        boss.weapon.setNameOfWeapon("Katana");
        boss.weapon.setTypeOfWeapon("Cold weapon");
        boss.printInfo();


        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(200);
        skeleton.setDamage(60);
        skeleton.weapon.setTypeOfWeapon("Bow");
        skeleton.weapon.setNameOfWeapon("Ranged");
        skeleton.printInfo();

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(150);
        skeleton2.setDamage(55);
        skeleton2.weapon.setTypeOfWeapon("bomb");
        skeleton2.weapon.setNameOfWeapon("firearm");
        skeleton2.printInfo();
    }
}
