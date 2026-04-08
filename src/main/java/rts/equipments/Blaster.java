package rts.equipments;

import rts.behaviors.BehaviorSoldier;
import rts.core.MultiplierExtension;

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
