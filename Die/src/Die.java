import java.util.Random; import java.util.Scanner;

public class Die {
    public static void main(String args[]) {
        Scanner sysin = new Scanner(System.in);
        System.out.println("Would you like to roll a Die?");
        String a1; 
        a1 = sysin.nextLine();
        if (a1.contains("n")) {return;}
        
        Random ran = new Random(); int x = ran.nextInt(6);
        if (x == 0){int y = 1; System.out.println("Your Number is " + y);}
        if (x == 1){int y = 2; System.out.println("Your Number is " + y);}
        if (x == 2){int y = 3; System.out.println("Your Number is " + y);}
        if (x == 3){int y = 4; System.out.println("Your Number is " + y);}
        if (x == 4){int y = 5; System.out.println("Your Number is " + y);}
        if (x == 5){int y = 6; System.out.println("Your Number is " + y);}
    
    }
}
