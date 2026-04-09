package rts.abstraction;

import rts.implementation.behaviors.LogBehavior;
import rts.visitor.IVisitor;

public class JediKnight extends AUnitSimple {
    public JediKnight(String name){
        super(new LogBehavior(20, 200, 20),name) ;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
