
package lecture4;

import java.util.Scanner;

public class assigment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Chon loai phuong trinh ban muon giai:");
        System.out.println("1. Phuong trinh bac 1 (ax + b = 0)");
        System.out.println("2. Phuong trinh bac 2 (ax^2 + bx + c = 0)");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            giaiPhuongTrinhBac1(scanner);
        } else if (choice == 2) {
            giaiPhuongTrinhBac2(scanner);
        } else {
            System.out.println("Lua chon khong hop le!");
        }
        
        scanner.close();
    }
    

    public static void giaiPhuongTrinhBac1(Scanner scanner) {
        System.out.println("Giai phuong trinh bac 1 (ax + b = 0)");
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        }
    }
    
    // Giai phuong trinh bac 2 ax^2 + bx + c = 0
    public static void giaiPhuongTrinhBac2(Scanner scanner) {
        System.out.println("Giai phuong trinh bac 2 (ax^2 + bx + c = 0)");
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        
        if (a == 0) {
            giaiPhuongTrinhBac1(scanner);
        } else {
            double delta = b * b - 4 * a * c;
            
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}