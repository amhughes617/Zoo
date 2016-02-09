/**
 * Created by alexanderhughes on 2/9/16.
 */
public class Dog extends Mammal {

    public Dog() {
        this.name = "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}
