import structure.Auto;
import structure.MechanicalTransport;
import structure.RoadTrain;
import structure.RoadTransport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("1.6", 2, 2, 4);
        System.out.println(auto.engine);


        List<RoadTransport> roadTransports = new ArrayList<>();
        roadTransports.add(auto);
        for (RoadTransport roadTransport: roadTransports) {
            roadTransport.moving();
        }

    }
}
