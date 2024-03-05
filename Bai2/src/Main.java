import model.MovablePoint;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x:");
        float x = scanner.nextFloat();
        System.out.println("Nhap y :");
        float y = scanner.nextFloat();
        System.out.println("Nhap toc do x :");
        float xSpeed = scanner.nextFloat();
        System.out.println("Nhap toc do y:");
        float ySpeed = scanner.nextFloat();
        MovablePoint point = new MovablePoint(x,y ,xSpeed,ySpeed);
        System.out.println(" Diem start :" + point);
        point = point.move();
        System.out.println("Diem sau khi di chuyen :" + point);
        scanner.close();
    }
}