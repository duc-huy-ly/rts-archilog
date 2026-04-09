package rts.implementation.behaviors;

public abstract class ABehavior implements BehaviorSoldier {
    private float _ad;
    private float _hp;
    private float _armor;

    
    public ABehavior(float dmg, float hp, float armor) {
        _ad = dmg;
        _hp = hp;
        _armor = armor;
    }


    @Override
    public float getAD() {
        return _ad;
    }

    public void setHp(float _hp) {
        this._hp = _hp;
    }

    @Override
    public float getHp() {
        return _hp;
    }

    @Override
    public boolean isAlive() {
        return _hp > 0;
    }

    @Override
    public float getArmor() {
        return _armor;
    }


}
