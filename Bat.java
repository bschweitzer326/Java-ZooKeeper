public class Bat extends Mammal{
    public Bat() {
        this.energyLevel = 300;
    }    
    
    public void fly() {
        energyLevel -= 50;
        System.out.println("Whoosh -50 energy");
    }
    public void eatHumans() {
        energyLevel += 25;
        System.out.println("Bones crunching +25 energy");
    }
    public void attackTown() {
        energyLevel -= 100;
        System.out.println("Screams and roaing fires -100 energy");
    }
}
