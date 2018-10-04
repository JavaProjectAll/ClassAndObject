package baitap1;

public class Rectangle {
    double width, height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public double getPerimeter(){
        return (this.width + this.height)*2;
    }

    public String display(){
        return "Chiều dài "+width+" chiều rộng "+height;
    }
}