package PK1;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner y = new Scanner(System.in);
        Circle c = new Circle();
        String s = y.next();
        while (!s.equals("Q")) {
            String[][] a = new String[11][11];
            for (int i = 0; i <= 10; i++) {
                for (int j = 0; j <= 10; j++) {
                    a[i][j] = "-";
                }
            }
            if (s.equals("R")) {
                c.right();
            } else if (s.equals("L")) {
                c.left();
            } else if (s.equals("D")) {
                c.up();
            } else if (s.equals("U")) {
                c.down();
            } else {
                System.out.println("this commaned is not allowed");
            }
            a[c.getY()][c.getX()] = "O";
            for (int i = 0; i <= 10; i++) {
                for (int j = 0; j <= 10; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
            s = y.next();

        }

    }

}
