package rts.abstraction;

import rts.implementation.behaviors.ConstBehavior;
import rts.visitor.IVisitor;

public class Archer extends AUnitSimple {

    public Archer(String name) {
        super(new ConstBehavior(10, 100, 5), name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }


    
}
