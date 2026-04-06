package rts.abstraction;

import rts.behaviors.ConstBehavior;

public class Archer extends AUnitSimple {

    public Archer(String name) {
        super(new ConstBehavior(10, 100, 5), name);
    }
    
}
