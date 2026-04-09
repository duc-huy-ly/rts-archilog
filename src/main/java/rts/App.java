package rts;

import rts.abstraction.Barbarian;
import rts.abstraction.IUnit;
import rts.abstraction.ObservableUnit;
import rts.abstraction.UnitGroup;
import rts.ages.Factory;
import rts.ages.SpaceAge;
import rts.implementation.behaviors.BehaviorSoldier;
import rts.implementation.equipments.Blaster;
import rts.implementation.equipments.IEquipment;
import rts.observer.EquipmentSubscriber;
import rts.observer.UnitSubscriber;
import rts.visitor.UnitCounter;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Factory f = new SpaceAge();
        // subscriberTest(f);
        groupCounterTest(f);

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

    public static void factorytest(Factory f){
        IUnit u1 = f.makeMeleeUnit("foo");
        IUnit u2 = f.makeRangedUnit("bar");
        IEquipment e1 = f.makeMeleeWeapon();
        IEquipment e2 = f.makeRangedWeapon();
        u1.addEquipment(e1); 
        u2.addEquipment(e2);
        u1.getHit(u2.getAD());
        System.out.println(u1.getHp());
    }

    public static void subscriberTest(Factory f){
        IUnit u1 = f.makeRangedUnit("chuck");
        UnitSubscriber s = new UnitSubscriber();
        UnitSubscriber s2 = new UnitSubscriber();
        EquipmentSubscriber e = new EquipmentSubscriber();
        ObservableUnit o1 = ((ObservableUnit)u1);
        o1.addSubscriber(s); 
        o1.addSubscriber(s2);
        o1.addSubscriber(e);
        o1.getHit(1);
        o1.addEquipment(f.makeMeleeWeapon());
        System.out.println("------ Removing s from o1 ------");
        o1.removeSubscriber(s);
        o1.getHit(1);
    }

    public static void groupCounterTest(Factory f){
        IUnit a0 = f.makeMeleeUnit("1");
        IUnit a1 = f.makeMeleeUnit("2");
        IUnit a2 = f.makeRangedUnit("3");
        IUnit a3 = f.makeRangedUnit("4");
        UnitGroup g = new UnitGroup("KND");
        g.addUnit(a0);
        g.addUnit(a1);
        g.addUnit(a2);
        UnitCounter c = new UnitCounter();
        g.accept(c);
        System.out.println("number of units found : " + c.getCount());
        System.out.println("Removing 1 unit");
        g.removeUnit(a2);
        c.reset();
        g.accept(c);
        System.out.println("number of units found : " + c.getCount());
    }
}

 
