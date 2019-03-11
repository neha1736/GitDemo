package interfaceConcept;

public class Cat implements Pet,Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.cute();
		c.obidient();
		Pet pc = new Cat();
		pc.cute();
	}

	public void mewing() {
		System.out.println("Cat mews");
	}
	@Override
	public void obidient() {
		// TODO Auto-generated method stub
		System.out.println("Cat id an obidient pet");
	}

	@Override
	public void cute() {
		// TODO Auto-generated method stub
		System.out.println("Cat id a cute pet");
	}

	@Override
	public void activity() {
		// TODO Auto-generated method stub
		System.out.println("Cat eat, sleep, drink");
		
	}

}
