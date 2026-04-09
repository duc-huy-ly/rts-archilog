package rts.ages;

import rts.abstraction.IUnit;
import rts.implementation.equipments.IEquipment;

public interface Factory {
    IUnit makeMeleeUnit(String name);
    IUnit makeRangedUnit(String name);
    IEquipment makeMeleeWeapon();
    IEquipment makeRangedWeapon();

}
