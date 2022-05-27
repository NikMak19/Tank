import static java.lang.Math.*;
public class Tank {
    private int x, y;
    private int dir = 0;
    private int fuel;
    private int n;
    static final String model = "T34";
    static int tankNumber;
    private Math Math;

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        ++tankNumber;
        n = tankNumber;
    }

    public void goForward(int i) {
        if (Math.abs(i) > fuel) {
            i = (i/Math.abs(i)) * fuel;
        } else if (fuel == 0) {
            i = 0;
        }
        fuel -= Math.abs(i);
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
    }

    public void printPosition() {
        System.out.println("The Tank T34 " + x + "," + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1)
            dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4)
            dir = 4;

    }

    public void goBackward(int i) {
        goForward(-i);
    }
}
