package igra;


public class Player extends GameObject {
    private String name;
    private int health;

    public Player(String name, int y, int w, int h,
                  int x, int health) {
        super(x, y, w, h);
        setName(name);
        setHealth(health);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        }
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 100)
            this.health = health;
    }

    public void prikazi() {
        System.out.println("Player(" + name + ") @ (" + getX() + "," 
                + getY() + ") " + getWidth() + "x" 
                + getHeight() + " HP-" + health);
    }
    
}
