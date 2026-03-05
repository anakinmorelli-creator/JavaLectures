public class Main {
    public static void main(String[] args){
        Car octane = new Car();
        octane.modelName = "Octane";

        System.out.println("The " + octane.modelName + " starts with " + octane.boostTank.boostAmount + " boost.");
    }
}
