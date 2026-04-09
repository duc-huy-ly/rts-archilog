package rts.abstraction;

import rts.implementation.behaviors.LogBehavior;
import rts.visitor.IVisitor;

public class CloneTrooper extends  AUnitSimple {

    public CloneTrooper( String name) {
        super(new LogBehavior(15, 150, 15), name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
