package baitap1;

public class RectMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4,40);
        Rectangle rect2 = new Rectangle(3.5,35.9);
        System.out.println(rect1.display());
        System.out.println("Diện tích là "+rect1.getArea());
        System.out.println("Chu vi là "+rect1.getPerimeter());
        System.out.println(rect2.display());
        System.out.println("Diện tích là "+rect2.getArea());
        System.out.println("Chu vi là "+rect2.getPerimeter());
    }
}
