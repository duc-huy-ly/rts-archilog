package rts.implementation.equipments;

import rts.implementation.behaviors.BehaviorSoldier;

public interface IEquipment extends Cloneable{
    BehaviorSoldier createExtension(BehaviorSoldier b);
    IEquipment clone();
    String getName();
}
