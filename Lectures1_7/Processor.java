public class Processor extends PCComponent{
    private double clockSpeed;

    Processor(String modelName, double clockSpeed){
        super(modelName);
        this.clockSpeed = clockSpeed;
    }

    @Override
    public double getScore(){
        return clockSpeed * 1000;
    }
}
