public abstract class MyMath implements Addition, Multiply {
    private int a;
    private int b;
    private String action;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public MyMath(int a, int b, String action) {
        this.a = a;
        this.b = b;
        this.action = action;
    }
}
