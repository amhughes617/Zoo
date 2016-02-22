/**
 * Created by alexanderhughes on 2/22/16.
 */
public class AnonymousFunctionsExample {

    public static void main(String[] args) {
        //run code from separate method
        sayHello();

        //Run code from anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        r1.run();

        //Run code from an anonymous function
        Runnable r2 = () -> {
            System.out.println("Hello from anonymous function!");
        };
        r2.run();
    }
    static void sayHello() {
        System.out.println("Hello, world");
    }

}
