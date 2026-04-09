package rts.implementation.equipments;

import rts.implementation.behaviors.BehaviorSoldier;

public class Bow extends AEquipment{

    @Override
    public BehaviorSoldier createExtension(BehaviorSoldier b) {
        return new ConstExtension(b, this, 6, 0);
    }

    @Override
    public String getName() {
        return "longbow";
    }
    
}
