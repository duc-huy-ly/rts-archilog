package rts.implementation.equipments;

public abstract class AEquipment implements IEquipment {

    @Override
    public IEquipment clone() {
        try {
           return (AEquipment) super.clone(); 
        } catch (Exception e) {
        }
        return this;
    }

    
}
