package com.company;

public class Skeleton extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println(getHealth() + "\n" + getDamage() + "\n" + weapon.getNameOfWeapon() + "\n" + weapon.getTypeOfWeapon());
    }
}
