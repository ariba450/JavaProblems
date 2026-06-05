class Dog {
    String name;
    int age;
    String breed;

    Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " is barking");
    }

    void run() {
        System.out.println(name + " is running");
    }

    void spin() {
        System.out.println(name + " is doing a spin");
    }
}

public class PetDesign {
    public static void main(String[] args) {
        Dog d = new Dog("Doggy", 1, "German");

        d.bark();
        d.run();
        d.spin();
    }
}
