package rts.implementation.equipments;

import rts.implementation.behaviors.BehaviorSoldier;

public class Shield extends AEquipment{

    @Override
    public BehaviorSoldier createExtension(BehaviorSoldier b) {
        return new ConstExtension(b, this, 0, 5);
    }

    @Override
    public String getName() {
        return "Chitin Shield";
    }
    
}
