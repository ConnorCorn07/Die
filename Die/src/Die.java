import java.util.Random; import java.util.Scanner;

public class Die {
    public static void main(String[] args) throws InterruptedException {
        Scanner sysin = new Scanner(System.in);
        System.out.println("How many Dice would you like to roll? (The max # of dice you can roll is 3)");
        String a1; a1 = sysin.nextLine();

        if (a1.contains("1")){Random ran = new Random(); int x = ran.nextInt(6);
            if (x == 0){int y = 1; System.out.println("Your Number is " + y);}
            if (x == 1){int y = 2; System.out.println("Your Number is " + y);}
            if (x == 2){int y = 3; System.out.println("Your Number is " + y);}
            if (x == 3){int y = 4; System.out.println("Your Number is " + y);}
            if (x == 4){int y = 5; System.out.println("Your Number is " + y);}
            if (x == 5){int y = 6; System.out.println("Your Number is " + y);}
        }

        if (a1.contains("2")){
            Random ran = new Random(); int x = ran.nextInt(12);
            if (x == 0){int y = 2; System.out.println("Your Number is " + y);}
            if (x == 1){int y = 2; System.out.println("Your Number is " + y);}
            if (x == 2){int y = 3; System.out.println("Your Number is " + y);}
            if (x == 3){int y = 4; System.out.println("Your Number is " + y);}
            if (x == 4){int y = 5; System.out.println("Your Number is " + y);}
            if (x == 5){int y = 6; System.out.println("Your Number is " + y);}
            if (x == 6){int y = 7; System.out.println("Your Number is " + y);}
            if (x == 7){int y = 8; System.out.println("Your Number is " + y);}
            if (x == 8){int y = 9; System.out.println("Your Number is " + y);}
            if (x == 9){int y = 10; System.out.println("Your Number is " + y);}
            if (x == 10){int y = 11; System.out.println("Your Number is " + y);}
            if (x == 11){int y = 12; System.out.println("Your Number is " + y);}
        }


        if (a1.contains("3")){
            Random ran = new Random(); int x = ran.nextInt(18);
            if (x == 0){int y = 3; System.out.println("Your Number is " + y);}
            if (x == 1){int y = 3; System.out.println("Your Number is " + y);}
            if (x == 2){int y = 3; System.out.println("Your Number is " + y);}
            if (x == 3){int y = 4; System.out.println("Your Number is " + y);}
            if (x == 4){int y = 5; System.out.println("Your Number is " + y);}
            if (x == 5){int y = 6; System.out.println("Your Number is " + y);}
            if (x == 6){int y = 7; System.out.println("Your Number is " + y);}
            if (x == 7){int y = 8; System.out.println("Your Number is " + y);}
            if (x == 8){int y = 9; System.out.println("Your Number is " + y);}
            if (x == 9){int y = 10; System.out.println("Your Number is " + y);}
            if (x == 10){int y = 11; System.out.println("Your Number is " + y);}
            if (x == 11){int y = 12; System.out.println("Your Number is " + y);}
            if (x == 12){int y = 13; System.out.println("Your Number is " + y);}
            if (x == 13){int y = 14; System.out.println("Your Number is " + y);}
            if (x == 14){int y = 15; System.out.println("Your Number is " + y);}
            if (x == 15){int y = 16; System.out.println("Your Number is " + y);}
            if (x == 16){int y = 17; System.out.println("Your Number is " + y);}
            if (x == 17){int y = 18; System.out.println("Your Number is " + y);}
            } else {System.out.println("That is not a valid number");} Thread.sleep(250);

            System.out.println("Would you like to roll again? (Use yes or no)");
            String a2; a2 = sysin.nextLine();
            if (a2.contains("y")){Die.main(null);} else {return;}



    }
}
