package rts.implementation.behaviors;

public interface BehaviorSoldier {
   float getHp();
   boolean isAlive();
   float getAD();
   void getHit(float dmg);
   float getArmor(); 
}
