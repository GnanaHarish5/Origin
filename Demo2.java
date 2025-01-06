import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String Name = sc.nextLine();

        System.out.print("Enter your Num: ");
        int Num = sc.nextInt();

        System.out.println("Name is: " + Name);
        System.out.println("Num is: " + Num);

        sc.close();
    }
}
