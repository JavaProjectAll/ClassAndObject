package baitap2_PhuongTrinhBac2_Lop;

public class QuadraticEquation {
    private double a ;
    private double b ;
    private double c ;
    private double delta ;
    private double r1, r2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        this.delta = this.b * this.b - 4 * this.a * this.c;
        return this.delta;
    }

    public double getRoot1() {
        this.r1 = (-this.b + Math.pow(this.delta , 0.5)) / (2 * this.a);
        return this.r1;
    }

    public double getRoot2() {
        this.r2 = (-this.b - Math.sqrt(this.delta)) / (2 * this.a);
        return this.r2;
    }
}
