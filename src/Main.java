public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Бобик");

        System.out.println("Имя собаки: " + myDog.getName());

        System.out.print("Собака говорит: ");
        myDog.makeSound();
    }
}