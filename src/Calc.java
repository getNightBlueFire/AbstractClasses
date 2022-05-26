import java.util.stream.Stream;


public class Calc extends MyMath {
    public Calc(int a, int b, String action) {
        super(a, b, action);
    }

    @Override
    public int test0() {

        if (getAction().equals("-"))
            return getA() + getB() * (-1);
        else
            return getA() + getB();
    }

    @Override
    public int test01() {
        if (getAction().equals("*"))
            return getA() * getB();
        else
            return getA() * (1/getB());
    }

    public int toDo(){
        if (getAction().equals("+") || getAction().equals("-")) {
            return test0();
        }
        return test01();
    }

}
