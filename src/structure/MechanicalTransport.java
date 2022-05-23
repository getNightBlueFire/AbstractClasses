package structure;

public abstract class MechanicalTransport extends RoadTransport {
    public MechanicalTransport(String engine, int countAxis, int countWheels) {
        super(engine, countAxis, countWheels);
    }
}
