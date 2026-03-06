public class GraphicsCard extends PCComponent{
    private int cudaCores;

    GraphicsCard(String modelName, int cudaCores){
        super(modelName);
        this.cudaCores = cudaCores;
    }

    @Override
    public double getScore(){
        return cudaCores * 5;
    }
}
