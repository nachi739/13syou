package code13ex_03;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}
	public int getHp() { return this.hp; }
	public int getMp() { return this.mp; }
	public String getName() { return this.name; }
	public Wand getWand() { return this.wand; }

	public void setHp(int hp) { this.hp = hp; }
	public void setMp(int mp) { this.mp = mp; }
	public void setName(String name) { this.name = name; }
	public void setWand(Wand wand) { this.wand = wand; }
}
