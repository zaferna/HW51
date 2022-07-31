import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;

        System.out.print("Enter Number: ");
        num = inp.nextInt();
        Aritmetic cal = new Aritmetic();
        cal.calculate(num);

        //System.out.println(cal.calculate(num));
    }
}

