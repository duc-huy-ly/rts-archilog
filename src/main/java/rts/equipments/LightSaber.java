package rts.equipments;

import rts.behaviors.BehaviorSoldier;
import rts.core.MultiplierExtension;

public class LightSaber extends AEquipment {

    @Override
    public BehaviorSoldier createExtension(BehaviorSoldier b) {
        return new MultiplierExtension(b, this, 2, 0);
    }

    @Override
    public String getName() {
        return "Weapon of a Jedi Warrior";
    }
    
}
