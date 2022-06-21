package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double oper1 = x2 - x1;
        double oper2 = y2 - y1;
        double oper3 = Math.pow(oper1, 2);
        double oper4 = Math.pow(oper2, 2);
        double oper5 = oper3 + oper4;
        double rsl = Math.sqrt(oper5);
        return rsl;
    }

    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
