import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input

        System.out.println("Enter The Number");
        int num = sc.nextInt();

        while (num != 0) {

            if (num == 5 || num % 5 == 0) {
                return;
            }

            System.out.println("Hey I Print Times" + num);
            num--;

        }

        sc.close();

    }

}
