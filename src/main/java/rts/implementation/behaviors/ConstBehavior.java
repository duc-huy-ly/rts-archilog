package rts.implementation.behaviors;

public class ConstBehavior extends ABehavior{
    public ConstBehavior( float _dmg, float _hp, float _armor) {
        super(_dmg, _hp, _armor);
    }

    @Override
    public void getHit(float dmg) {
        float amount = dmg * (100 / (100 + getArmor()));
        super.setHp(super.getHp() - amount);
    }

   
}
