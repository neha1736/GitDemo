package interfaceConcept;

public class Dog implements Pet, Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.cute();
		d.obidient();
		Animal ad = new Dog();
		ad.activity();
	}
	
	public void barking() {
		System.out.println("Dog Barks");
	}

	@Override
	public void obidient() {
		// TODO Auto-generated method stub
		System.out.println("Dog is an obidient pet");
	}

	@Override
	public void cute() {
		// TODO Auto-generated method stub
		System.out.println("Dog is a cute pet");
		
	}

	@Override
	public void activity() {
		// TODO Auto-generated method stub
		System.out.println("Dog eats, sleeps, drinks");
	}
	
	

}
