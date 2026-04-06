package rts;

import rts.abstraction.Archer;
import rts.abstraction.Barbarian;
import rts.abstraction.IUnit;
import rts.abstraction.UnitGroup;
import rts.behaviors.BehaviorSoldier;
import rts.behaviors.ConstBehavior;
import rts.behaviors.LogBehavior;
import rts.core.BehaviorExtension;
import rts.core.ConstExtension;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        BehaviorSoldier jon = new ConstBehavior(10, 100, 10);
        BehaviorSoldier doe = new LogBehavior( 0, 100, 10);
        BehaviorExtension decoratedjon = new ConstExtension( jon, 10, 0);
        BehaviorExtension decoratedDoe = new ConstExtension(doe, 0, 1);
        System.out.println(decoratedDoe.getArmor());
        fight(decoratedjon, decoratedDoe);

        IUnit army = new UnitGroup("Salamancas");
        IUnit hector = new Barbarian("Hector Salamanca");
        IUnit tuco = new Archer("Tuco Salamanca");
        IUnit lalo = new Barbarian("Eduardo");
        army.addUnit(tuco);
        army.addUnit(hector);
        army.addUnit(lalo);
        System.out.println(army.getAD());
        System.out.println(army.getHp());
        army.getHit(20);
        System.out.println(army.getHp());
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
}

 
