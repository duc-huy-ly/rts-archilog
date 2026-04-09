package rts.implementation.behaviors;

public class LogBehavior extends ABehavior {


    public LogBehavior(float _dmg, float _hp, float _armor) {
        super( _dmg, _hp, _armor);
    }

    @Override
    public void getHit(float dmg) {
        float amount = (float)Math.sqrt(getAD() / getArmor() + 1);
        super.setHp(super.getHp() - amount);
    }

}
