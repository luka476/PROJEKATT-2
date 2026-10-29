package igra;


public class MeleeEnemy extends Enemy {

    public MeleeEnemy(String type, int y, int w, int h,
                      int x, int damage, int health) {
        super(x, y, w, h, type, damage, health);
    }

    public int attack() {
        return getDamage();
    }
}




