package rts.implementation.equipments;

import rts.implementation.behaviors.BehaviorSoldier;

public class Blaster extends AEquipment{

    @Override
    public BehaviorSoldier createExtension(BehaviorSoldier b) {
        return new MultiplierExtension(b, this, 1.5f, 0);
    }

    @Override
    public String getName() {
        return "Pew Pew";
    }
    
}
