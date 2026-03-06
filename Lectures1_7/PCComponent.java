public class PCComponent implements Benchmarkable{
    protected String modelName;
    private static int totalComponentsTested = 0;

    PCComponent(String modelName){
        this.modelName = modelName;
        totalComponentsTested++;
    }

    public double getScore(){
        return 0.0;
    }
    public static int getCount(){
        return totalComponentsTested;
    }
}
