package rts.core;

import rts.behaviors.BehaviorSoldier;

public interface IEquipment {
    BehaviorSoldier createExtension(BehaviorSoldier b);
    IEquipment clone();
    String getName();
}
