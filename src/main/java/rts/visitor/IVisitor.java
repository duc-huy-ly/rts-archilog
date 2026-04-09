package rts.visitor;

import rts.abstraction.AUnitSimple;
import rts.abstraction.Archer;
import rts.abstraction.Barbarian;
import rts.abstraction.CloneTrooper;
import rts.abstraction.IUnit;
import rts.abstraction.JediKnight;
import rts.abstraction.ObservableUnit;
import rts.abstraction.UnitGroup;

public interface IVisitor {
    default void visit(IUnit u) {
        System.out.println("Error : cannot visit an IUnit");
    };

    void visit(ObservableUnit u);

    default void visit(UnitGroup u){
        visit((IUnit) u);
    };

    default void visit(AUnitSimple u) {
        visit((IUnit) u);
    };

    void visit(Barbarian u);

    void visit(Archer u);

    void visit(JediKnight u);

    void visit(CloneTrooper u);
}
