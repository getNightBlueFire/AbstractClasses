package structure;

public abstract class RoadTransport {

    public String engine;
    private int countAxis;
    protected int countWheels;

    public RoadTransport(String engine, int countAxis, int countWheels) {
        this.engine = engine;
        this.countAxis = countAxis;
        this.countWheels = countWheels;
    }

    public abstract void moving();


}
