package rts.equipments;

import rts.behaviors.BehaviorSoldier;
import rts.core.ConstExtension;

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
