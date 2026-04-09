package rts.implementation.equipments;

import rts.implementation.behaviors.BehaviorSoldier;

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
