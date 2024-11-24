package sec01.exam05;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Animal animal = dog;
		Dog dog2 = (Dog) animal;
		
		
		Cat cat = new Cat();
		Animal animal2 = dog;
//		Cat cat2 = (Cat) animal2; // ClassCastException
		
		
		Dog dog3 = new Dog();
		changeDog(dog3);
		
		Cat cat3 = new Cat();
		changeDog(cat3); // if문이 없다면 ClassCastException
	}
	
	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
		
	}
	
	

}
