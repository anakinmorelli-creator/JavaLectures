public class RigTester {
    public static void main(String[] args){
        String gpu1 = new String("RTX 4070");
        String gpu2 = new String("RTX 4070");

        if (gpu1 == gpu2){
            System.out.println("Memory Match");
        }
        else{
            System.out.println("Separate objects in memory!");
        }

        Benchmarkable[] myRig = new Benchmarkable[2];

        myRig[0] = new Processor("i7-12700KF", 5.0);
        myRig[1] = new GraphicsCard(gpu1, 5888);

        double totalScore = 0.0;

        for (Benchmarkable j : myRig){
            totalScore += j.getScore();
        }

        System.out.println("Total score: " + totalScore);
        System.out.println("Total parts tested: " + PCComponent.getCount());
    }
}
