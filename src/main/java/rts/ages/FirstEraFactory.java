package rts.ages;

import rts.abstraction.Archer;
import rts.abstraction.Barbarian;
import rts.abstraction.IUnit;
import rts.equipments.Bow;
import rts.equipments.IEquipment;
import rts.equipments.Knife;

public class FirstEraFactory implements Factory{

    @Override
    public IUnit makeMeleeUnit(String name) {
        return new Barbarian(name);
    }

    @Override
    public IUnit makeRangedUnit(String name) {
        return new Archer(name);
    }

    @Override
    public IEquipment makeMeleeWeapon() {
        return new Knife();
    }

    @Override
    public IEquipment makeRangedWeapon() {
        return new Bow(); 
    }
    
}
