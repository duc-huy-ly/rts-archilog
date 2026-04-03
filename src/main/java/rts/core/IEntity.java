package rts.core;

public interface IEntity {
   float getHP();
   boolean isAlive();
   float getAD();
   void getHit(float dmg);
   float getArmor(); 
}
