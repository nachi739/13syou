package code13ex_03;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		Wizard w = new Wizard();
		Wand ww = new Wand();

		h.setName("勇者");
		h.setHp(100);

		w.setName("魔法使い");
		w.setHp(50);
		w.setMp(200);
		w.setWand(ww);


		ww.setName("魔法の杖");
		ww.setPower(50);
		w.heal(h);
	}

}
