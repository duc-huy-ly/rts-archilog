package rts.abstraction;

import rts.behaviors.ConstBehavior;

public class Barbarian extends AUnitSimple {

   public Barbarian(String name){
        super(new ConstBehavior(10, 120, 10), name);
   } 
}
