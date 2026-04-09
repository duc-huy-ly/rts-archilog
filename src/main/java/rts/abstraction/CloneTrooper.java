package rts.abstraction;

import rts.implementation.behaviors.LogBehavior;

public class CloneTrooper extends  AUnitSimple {

    public CloneTrooper( String name) {
        super(new LogBehavior(15, 150, 15), name);
    }
    
}
