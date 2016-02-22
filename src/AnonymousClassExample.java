/**
 * Created by alexanderhughes on 2/22/16.
 */
public class AnonymousClassExample {

    public static void main(String[] args) {
        Reptile alligator = new Reptile() {//making this anonymous subclass of reptile
            @Override
            public void makeSound() {
                super.makeSound();
                System.out.println("Croak");
            }
        };
        alligator.name = "Alligator";
        alligator.makeSound();
    }
}
