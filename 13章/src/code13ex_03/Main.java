package code13ex_03;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("勇者");
		h.setHp(100);

		Wizard w = new Wizard();
		w.setName("魔法使い");
		w.setHp(50);
		w.setMp(200);



		Wand ww = new Wand();
		ww.setName("魔法の杖");
		ww.setPower(50);
		w.heal(h);
	}

}
