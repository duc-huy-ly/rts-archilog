package rts;

import rts.abstraction.Barbarian;
import rts.abstraction.IUnit;
import rts.behaviors.BehaviorSoldier;
import rts.equipments.Blaster;
import rts.equipments.IEquipment;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        addWeaponTest();
    }

    public static void fight(BehaviorSoldier s1, BehaviorSoldier s2){
   
        BehaviorSoldier attack = s1;
        BehaviorSoldier defend = s2;
        while(s1.isAlive() && s2.isAlive()){
       
            defend.getHit(attack.getAD());
            BehaviorSoldier tmpSwap = attack;
            attack = defend;
            defend = tmpSwap;
        }
        if (s1.isAlive()){
            System.out.println("Soldier 1 won");
        }
        else {
            System.out.println("Soldier 2 won");
        }
    }

    public static void addWeaponTest(){
        IUnit tuco = new Barbarian("Tuco");
        IEquipment gun = new Blaster();
        Blaster gun2 = new Blaster();
        System.out.println("Tuco 's attack damage : " + tuco.getAD());
        tuco.addEquipment(gun);
        tuco.addEquipment(gun2);
        System.out.println("Tuco 's attack damage : " + tuco.getAD());
        tuco.removeEquipment(gun); 
        System.out.println(tuco.getAD());
    }
}

 
