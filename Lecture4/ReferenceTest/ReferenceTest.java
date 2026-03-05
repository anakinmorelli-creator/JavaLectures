public class ReferenceTest {
    // This method takes a copy of the remote control pointing to the array
    public static void tryToUpgrade(String[] partsList) {
        // It uses its remote to go into the actual array and change the first item
        partsList[0] = "i9-14900K";
    }

    public static void main(String[] args) {
        // We create the actual array in memory
        String[] myPC = {"i7-12700KF", "RTX 4070", "32GB DDR5"};

        System.out.print("My pc was built from: ");
        for (int j = 0; j < myPC.length; j++){
            System.out.print(myPC[j] + " ");
        }

        // We pass the memory address (the remote) to the method
        tryToUpgrade(myPC);

        // It prints "i9-14900K"! The original array WAS changed because
        // the method used its copied remote to alter the shared object.
        System.out.print("\nMy PC is now built from: ");
        for (int i = 0; i < myPC.length ; i++){
            System.out.print(myPC[i] + " ");
        }
    }
}