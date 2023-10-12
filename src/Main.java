public class Main {
    public static void main(String[] args) {
        for (int one = 0; one <= 30; one += 1){
            System.out.println(one);
        }
        System.out.println("\n");
        for (int two = 30; two >= 0; two -=1){
            System.out.println(two);
        }
        System.out.println("\n");
        for (int three = 0; three <=18; three += 3){
            System.out.println(three);
        }
        System.out.println("\n");
        for (int four = 10; four >=0; four -= 2){
            System.out.println(four);
        }
        System.out.println("\n");
        int fiveRows = 5;
        for (int fiveOne = 1; fiveOne <= fiveRows; fiveOne += 1){
            for (int fiveTwo = 1; fiveTwo <= fiveOne; fiveTwo += 1){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        int sixRows = 5;
        for (int sixOne = sixRows; sixOne >= 1; sixOne -= 1){
            for (int sixTwo = 1; sixTwo <= sixOne; sixTwo += 1){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        int sevenRows = 5;
        for (int sevenOne = 1; sevenOne <= sevenRows; sevenOne += 1){
            for (int sevenTwo = 1; sevenTwo <= sevenRows; sevenTwo += 1){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int eightOne = 1; eightOne <= 2; eightOne += 1){
            for (int eightTwo = 1; eightTwo <= 8; eightTwo += 1){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int eightThree = 1; eightThree <= 6; eightThree += 1){
            for (int eightFour = 1; eightFour <= 2; eightFour += 1){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int eightFive = 1; eightFive <= 2; eightFive += 1) {
            for (int eightSix = 1; eightSix <= 8; eightSix += 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}