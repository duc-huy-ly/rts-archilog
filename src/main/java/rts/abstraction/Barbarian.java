package rts.abstraction;

import rts.implementation.behaviors.ConstBehavior;
import rts.visitor.IVisitor;

public class Barbarian extends AUnitSimple {

   public Barbarian(String name){
        super(new ConstBehavior(10, 120, 10), name);
   }

   @Override
   public void accept(IVisitor visitor) {
        visitor.visit(this);
   } 
}
