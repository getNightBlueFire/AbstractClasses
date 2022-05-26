import structure.Auto;
import structure.MechanicalTransport;
import structure.RoadTrain;
import structure.RoadTransport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b;
        String action;
        do{
            System.out.println("input a=");
            a = sc.nextInt();
            System.out.println("input action=");
            action = sc.next();
            System.out.println("input b=");
            b = sc.nextInt();

            int r = new Calc(a,b,action).toDo();
            System.out.println(r);
        } while (a != 0 || b != 0);



    }
}
