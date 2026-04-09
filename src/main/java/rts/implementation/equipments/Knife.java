package rts.implementation.equipments;

import rts.implementation.behaviors.BehaviorSoldier;

public class Knife extends AEquipment{

    @Override
    public BehaviorSoldier createExtension(BehaviorSoldier b) {
        return new ConstExtension(b, this, 5, 0);
    }

    @Override
    public String getName() {
        return "Knife";
    }

    @Override
    public IEquipment clone() {
        return (Knife) super.clone();
    }


    
}
