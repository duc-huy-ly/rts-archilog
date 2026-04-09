package rts.visitor;

import java.util.Iterator;

import rts.abstraction.AUnitSimple;
import rts.abstraction.Archer;
import rts.abstraction.Barbarian;
import rts.abstraction.CloneTrooper;
import rts.abstraction.IUnit;
import rts.abstraction.JediKnight;
import rts.abstraction.ObservableUnit;
import rts.abstraction.UnitGroup;

public class UnitCounter implements IVisitor{
    private int _counter = 0;

    @Override
    public void visit(ObservableUnit u) {
        
    }

    @Override
    public void visit(Barbarian u) {
        _counter++;
    }

    @Override
    public void visit(Archer u) {
        _counter++;
    }

    @Override
    public void visit(JediKnight u) {
        _counter++;
    }

    @Override
    public void visit(CloneTrooper u) {
        _counter++;
    }

    @Override
    public void visit(UnitGroup group) {
        Iterator<IUnit> it = group.getUnits(); 
        while(it.hasNext()){
            it.next().accept(this);
        }
    }

    @Override
    public void visit(AUnitSimple u) {
        _counter ++;
    }

    public int getCount(){
        return _counter;
    }

    public void reset(){
        _counter = 0;
    }

    

    
}
