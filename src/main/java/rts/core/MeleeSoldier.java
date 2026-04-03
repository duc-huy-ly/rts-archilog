package rts.core;

public class MeleeSoldier extends Entity{

    public MeleeSoldier(String name, float _dmg, float _hp, float _armor) {
        super(name, _dmg, _hp, _armor);
    }

    @Override
    public void getHit(float dmg) {
        float amount = dmg * (100 / (100 + super.get_armor()));
        super.set_hp(super.getHP() - amount);
    }

   
}
