package rts;

import rts.core.IEntity;
import rts.core.MeleeSoldier;
import rts.core.RangedSoldier;
import rts.decorator.EntityDecorator;
import rts.decorator.Shield;
import rts.decorator.Sword;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        IEntity jon = new MeleeSoldier("Joh", 10, 100, 10);
        IEntity doe = new RangedSoldier("Doe", 20, 100, 10);
        EntityDecorator decoratedjon = new Sword(jon, 10);
        EntityDecorator decoratedDoe = new Shield(doe, 30);
        System.out.println(decoratedDoe.getArmor());
        fight(decoratedDoe, decoratedjon);
    }

    public static void fight(IEntity s1, IEntity s2){
   
        IEntity attack = s1;
        IEntity defend = s2;
        while(s1.isAlive() && s2.isAlive()){
       
            defend.getHit(attack.getAD());
            IEntity tmpSwap = attack;
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
