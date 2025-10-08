package automobileInterface;

import java.util.Scanner;

public class AutoMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AutoMobile a = null;
        Bike b = null;
        int c, c1, c2;
        String str, str1, str2;

        do {
            System.out.println("1-Car\n2-Bike");
            System.out.println("Enter your choice :");
            c = sc.nextInt();

            if (c == 1) {   // Car Section
                do {
                    System.out.println("1-Maruti\n2-Toyota\n3-BMW");
                    System.out.println("Enter your Choice :");
                    c1 = sc.nextInt();

                    if (c1 == 1) {
                        a = new Maruti();
                        display("Maruti", a);
                    } else if (c1 == 2) {
                        a = new Toyota();
                        display("Toyota", a);
                    } else if (c1 == 3) {
                        a = new BMW();
                        display("BMW", a);
                    }

                    System.out.println("Do you want to Continue with Cars (yes/no)? ");
                    str1 = sc.next();
                } while (str1.equalsIgnoreCase("yes"));

                System.out.println("Thank you Car Section ...!");
            } 
            else if (c == 2) {   // Bike Section
                do {
                    System.out.println("1-Hero");
                    System.out.println("Enter your Choice :");
                    c2 = sc.nextInt();

                    if (c2 == 1) {
                        b = new HeroHonda();
                        display("HeroHonda", b);
                    }

                    System.out.println("Do you want to Continue with Bikes (yes/no)? ");
                    str2 = sc.next();
                } while (str2.equalsIgnoreCase("yes"));

                System.out.println("Thank you Bike Section ...!");
            }

            System.out.println("Do you want to Continue Main Menu (yes/no)? ");
            str = sc.next();

        } while (str.equalsIgnoreCase("yes"));

        sc.close();
    }

    public static void display(String str, AutoMobile a) {
        System.out.println("---------------------------");
        System.out.println(a);
//        System.out.println(str + " Model " + a.getModel());
//        System.out.println(str + " Color " + a.getColor());
//        System.out.println(str + " Price " + a.getPrice());
//        if (a instanceof Bike) {
//            Bike b = (Bike) a;
//            System.out.println(str + " Cc " + b.getCce());
//        }
    }

}
