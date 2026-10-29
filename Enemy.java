package igra;


public class Enemy extends GameObject {
    private String type;
    private int damage, health;

    public Enemy(int x, int y, int w, int h,
                 String type, int damage, int health) {
        super(x, y, w, h);
        this.type = type.trim();
        setDamage(damage);
        setHealth(health);
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setDamage(int damage) {
        if (damage >= 0 && damage <= 100)
            this.damage = damage;
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 100)
            this.health = health;
    }

    public int attack() {
        return damage;
    }

    
    public void prikazi() {
        System.out.println("Enemy[" + type + "] @ (" + getX() + "," + getY() + ") "
                + getWidth() + "x" + getHeight() + " DMG-" + damage + " HP-" + health);
    }
    

    }





