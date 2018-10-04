package baitap2_PhuongTrinhBac2_Lop;

public class EquationDisplay {
    public static void main(String[] args) {
        QuadraticEquation b2 = new QuadraticEquation(2, 4, 2);
        System.out.println("Phương trình bậc 2: " + (int) b2.getA() + "x^2 + " +
                (int) b2.getB() + "x + " + (int) b2.getC() + " = 0");
        System.out.println("Delta = "+b2.getDiscriminant());
        if (b2.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm x1 = " +  b2.getRoot1() +
                    " - x2 = " +  b2.getRoot2());
        }
        else if(b2.getDiscriminant() == 0){
            System.out.println("Phương trình có 1 nghiệm "+b2.getRoot1());
        }
        else {
            System.out.println("Phương trình không có nghiệm");
        }
    }
}
