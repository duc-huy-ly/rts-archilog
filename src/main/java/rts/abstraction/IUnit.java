package rts.abstraction;

import java.util.Iterator;

import rts.equipments.IEquipment;

public interface IUnit {
    float getHp();
    boolean isAlive();
    float getAD();
    void getHit(float dmg);
    float getArmor();
    String getName();
    void addUnit(IUnit u);
    void removeUnit(IUnit u);
    Iterator<IUnit> getUnits();
    void addEquipment(IEquipment e);
    void removeEquipment(IEquipment e);
}
