package rts.core;

public abstract class Entity implements IEntity {
    private String _name;
    private float _ad;
    private float _hp;
    private float _armor;

    public Entity(String name, float dmg, float hp, float armor) {
        _name = name;
        _ad = dmg;
        _hp = hp;
        _armor = armor;
    }

    public float get_armor() {
        return _armor;
    }

    @Override
    public float getAD() {
        return _ad;
    }

    public void set_hp(float _hp) {
        this._hp = _hp;
    }

    @Override
    public float getHP() {
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

    public void displayInfo() {
        System.out.println("#############");
        System.out.println("Name : " + getName());
        System.out.println("HP : " + getHP());
        System.out.println("AD : " + getAD());
        System.out.println("Armor :" + getArmor());
        System.out.println("#############");
    }

    public String getName() {
        return _name;
    }

}
