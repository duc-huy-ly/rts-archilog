package rts.ages;

import rts.abstraction.CloneTrooper;
import rts.abstraction.IUnit;
import rts.abstraction.JediKnight;
import rts.implementation.equipments.Blaster;
import rts.implementation.equipments.IEquipment;
import rts.implementation.equipments.LightSaber;

public class SpaceAge implements Factory {

    @Override
    public IUnit makeMeleeUnit(String name) {
        return new JediKnight(name);
    }

    @Override
    public IUnit makeRangedUnit(String name) {
        return new CloneTrooper(name);
    }

    @Override
    public IEquipment makeMeleeWeapon() {
        return new LightSaber();
    }

    @Override
    public IEquipment makeRangedWeapon() {
        return new Blaster();
    }
    
}
