public class SoundTest {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling makeSound() on both subclasses
        myDog.makeSound(); // Output: Dog barks
        myCat.makeSound(); // Output: Cat meows
    }
}
