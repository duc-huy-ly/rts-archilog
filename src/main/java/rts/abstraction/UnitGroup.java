package rts.abstraction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import rts.equipments.IEquipment;
import rts.observer.UnitEvent;
import rts.observer.UnitEventType;

public class UnitGroup extends ObservableUnit {
    private final String _name;

    public UnitGroup(String name){
        _name = name;
    }

    private final ArrayList<IUnit> _units = new ArrayList<>();
    private final HashSet<IUnit> _unitSet = new HashSet<>();

    @Override
    public void addUnit(IUnit u) {
        if (!_unitSet.contains(u)){
            _units.add(u);
            _unitSet.add(u);
            notifySubscribers(new UnitEvent(this, UnitEventType.UNIT_ADDED, 0, null));
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

        notifySubscribers(new UnitEvent(this, UnitEventType.HIT, dmg, null));
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
        return _name;
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
            notifySubscribers(new UnitEvent(this, UnitEventType.UNIT_REMOVED, 0, null));
        }
    }

    @Override
    public void addEquipment(IEquipment e) {
        for (IUnit unit : _units) {
           unit.addEquipment(e); 
        }

          notifySubscribers(new UnitEvent(this, UnitEventType.EQUIPMENT_ADDED, 0, e));
    }

    @Override
    public void removeEquipment(IEquipment e) {
        for (IUnit unit : _units) {
            unit.removeEquipment(e);
        }

        notifySubscribers(new UnitEvent(this, UnitEventType.EQUIPMENT_REMOVED, 0, e));
    }

}
