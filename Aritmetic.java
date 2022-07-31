public class Aritmetic  implements inter {


    @Override

    public  int calculate(int num) {
        int totl = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                totl += i;

            }


        }
        System.out.println("I implemented: AdvancedArithmetic\t" +totl);
        return totl;

    }
}


