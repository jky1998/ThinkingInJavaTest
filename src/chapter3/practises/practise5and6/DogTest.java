package chapter3.practises.practise5and6;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";

        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "Wurf!";

        System.out.println(dog1.name + " says: " + dog1.says);
        System.out.println(dog2.name + " says: " + dog2.says);

        Dog dog3 = new Dog();
        dog3.name = "spot";
        dog3.says = "Ruff!";
        System.out.println(dog1.name == dog3.name);               // true
        System.out.println(dog1.name.equals(dog3.name));          // true
        System.out.println(dog1 == dog3);                         // false
        System.out.println(dog1.equals(dog3));                    // false
    }
}
