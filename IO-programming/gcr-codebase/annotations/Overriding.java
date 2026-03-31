package annotations;
class Animal{
	void makeSound() {
		System.out.println("Animal says something");
	}
}
class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}
public class Overriding {
	public static void main(String args[]) {
		Animal animal=new Dog();
		animal.makeSound();
	}

}
