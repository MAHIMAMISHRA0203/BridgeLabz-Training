public class Animals

{
	public static void main(String[] args) {
	    Animal a=new Animal();
	     Animal a1=new Dog();
	      Animal a2=new Cat();
	       Animal a3=new Birds();
	       a.makeSound();
	       a1.makeSound();
	       a2.makeSound();
	       a3.makeSound();
	       
	    
	     
	}
}
class Animal{
    String name;
    int age;
    void makeSound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
            System.out.println("Dog barks -bow bow");

    }
    
    
}
class Birds extends Animal{
    @Override
    void makeSound(){
                System.out.println("Birds chirp-chirp chirp");

    }
    
    
}
class Cat extends Animal{
     @Override
    void makeSound(){
                System.out.println("Cat sound -meow meow");

    }
    
}