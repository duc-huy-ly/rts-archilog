package rts.abstraction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import rts.equipments.IEquipment;

public class UnitGroup extends ObservableUnit {

    public UnitGroup(String name){
        super(name);
    }

    private final ArrayList<IUnit> _units = new ArrayList<>();
    private final HashSet<IUnit> _unitSet = new HashSet<>();

    @Override
    public void addUnit(IUnit u) {
        if (!_unitSet.contains(u)){
            _units.add(u);
            _unitSet.add(u);
        }
    }

    @Override
    public float getAD() {
        float sum = 0;
        for (IUnit u: _units) {
           sum += u.getAD(); 
        }
        return sum;
    }

    @Override
    public float getArmor() {
        float sum = 0;
        for (IUnit u: _units) {
           sum += u.getArmor(); 
        }
        return sum;
    }

    @Override
    public void getHit(float dmg) {
        int aliveCount = 0;
        for (IUnit u : _units) {
            if (u.isAlive()) {
                aliveCount++;
            }
        }

        if (aliveCount == 0) {
            return;
        }

        float splitDamage = dmg / aliveCount;
        Iterator<IUnit> it = _units.iterator();
        while (it.hasNext()) {
            IUnit unit = it.next();
            if (!unit.isAlive()) {
                it.remove();
                _unitSet.remove(unit);
                continue;
            }

            unit.getHit(splitDamage);
            if (!unit.isAlive()) {
                it.remove();
                _unitSet.remove(unit);
            }
        }

    }

    @Override
    public float getHp() {
        float sum = 0;
        for (IUnit u: _units) {
           sum += u.getHp(); 
        }
        return sum;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Iterator<IUnit> getUnits() {
        return _units.iterator();
    }

    @Override
    public boolean isAlive() {
        return getHp() > 0;
    }

    @Override
    public void removeUnit(IUnit u) {
        if (_unitSet.contains(u)){
            _units.remove(u);
            _unitSet.remove(u);
        }
    }

    @Override
    public void addEquipment(IEquipment e) {
        for (IUnit unit : _units) {
           unit.addEquipment(e); 
        }

    }

    @Override
    public void removeEquipment(IEquipment e) {
        for (IUnit unit : _units) {
            unit.removeEquipment(e);
        }

    }

}
