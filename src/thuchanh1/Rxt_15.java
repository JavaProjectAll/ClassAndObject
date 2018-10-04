package thuchanh1;

import java.util.Scanner;

public class Rxt_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width, height;
        System.out.println("Nhập chiều rộng ");
        width = sc.nextInt();
        System.out.println("Nhập chiều dài ");
        height = sc.nextInt();

        Rectangle rect = new Rectangle(width, height);

        System.out.println(rect.display());
        System.out.println("Diện tích = "+(int)rect.getArea());
        System.out.println("Chu vi = "+(int)rect.getPerimeter());
    }
}
