public class Gorilla extends Mammal {
    public void throwSomething() {
        energyLevel -= 5;
        System.out.println("The gorilla has thrown something -5 energy");
    }
    public void eatBananas() {
        energyLevel += 10;
        System.out.println("The gorilla ate a banana and is happy :) + 10 energy");
    }
    public void climb() {
        energyLevel -= 10;
        System.out.println("The gorilla climbed a tree - 10 energy");
    }
}
