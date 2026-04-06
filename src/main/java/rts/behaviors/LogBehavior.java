package rts.behaviors;

public class LogBehavior extends ABehavior {

    private final float MULTIPLIER = 1.1f;

    public LogBehavior(float _dmg, float _hp, float _armor) {
        super(_dmg, _hp, _armor);
    }

    @Override
    public void getHit(float dmg) {
        float amount = (float)Math.sqrt(getAD() / getArmor() + 1);
        super.setHp(super.getHp() - amount);
    }

}
