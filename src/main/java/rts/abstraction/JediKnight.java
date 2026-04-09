package rts.abstraction;

import rts.behaviors.LogBehavior;

public class JediKnight extends AUnitSimple {
    public JediKnight(String name){
        super(new LogBehavior(20, 200, 20),name) ;
    }
    
}
