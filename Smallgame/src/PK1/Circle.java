package PK1;

public class Circle {

    private double radius;
    private String color;
    public int x;
    public int y;
    public int squarhight = 10, squarwidth = 10;

    public Circle() {
        System.out.println("new game started\nyour circle on x = 0 and y = 0\nyou can not go out the squar of hight 10 and width 10\nenter R for right L for left U for up D for down\nif you want to exit enter Q");
    }

    public void right() {
        if (x == 10) {
            System.out.println("You can not go out the squer move left");
        } else {
            x++;
        }
        System.out.println("circle on x = " + x + " y = " + y+"\nL-left R-right U-up D-down");

    }

    public void left() {
        if (x == 0) {
            System.out.println("You can not go out the squer move right");
        } else {
            x--;
        }
        System.out.println("circle on x = " + x + " y = " + y+"\nL-left R-right U-up D-down");

    }

    public void up() {
        if (y == 10) {
            System.out.println("You can not go out the squer move up");
        } else {
            y++;
        }
        System.out.println("circle on x = " + x + " y = " + y+"\nL-left R-right U-up D-down");
    }

    public void down() {
        if (y == 0) {
            System.out.println("You can not go out the squer move down");
        } else {
            y--;
        }
        System.out.println("circle on x = " + x + " y = " + y+"\nL-left R-right U-up D-down");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
