package rts.equipments;

import rts.behaviors.BehaviorSoldier;

public interface IEquipment extends Cloneable{
    BehaviorSoldier createExtension(BehaviorSoldier b);
    IEquipment clone();
    String getName();
}
