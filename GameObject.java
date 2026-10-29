package igra;

public class GameObject {
	private int x;
	private int y; 
	private int width;
	private int height;
	
	public GameObject(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public GameObject(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public void setheight(int height) {
		if (height > 0) {
			this.height = height;
		}
	       
	}
	
	public boolean intersects(GameObject other) { 
		return x < other.x + other.width 
				&& x + width > other.x
				&& y < other.y + other.height 
				&& y + height > other.y;
	}
}
