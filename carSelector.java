import java.util.Scanner;

public class carSelector {
    public static void main(String[] args) {
        System.out.println("Do You Want to buy a Car??(yes OR no)");
        Scanner scan = new Scanner(System.in);
        String Ans1 = scan.next();

        if (Ans1.equals("yes")) {
            System.out.println("Which is Your Favourite Car Color- Red, Chrome, Gold?");
            String Ans2 = scan.next();

            if (Ans2.equals("Red")) {
                System.out.println("We have Red Color in Stock, would you like to take a test Drive (yes or no)");

                String Ans3 = scan.next();

                if (Ans3.equals("yes")) {
                    System.out.println("OK, Let's Check it Out");
                } else {
                    System.out.println("OK, You can Check Something Else :)");
                }

            } else if (Ans2.equals("Chrome")) {
                System.out.println("We have Chrome Color in Stock, would you like to take a test Drive (yes or no)");

                String Ans4 = scan.next();

                if (Ans4.equals("yes")) {
                    System.out.println("OK, Let's Check it Out");
                } else {
                    System.out.println("OK, You can Check Something Else :)");
                }
            } else {
                System.out.println("Sorry, We are out of Stock!!");
            }

        } else if (Ans1.equals("no")) {
            System.out.println("Ok!! Have a Great Day");
        } else {
            System.out.println("Sorry you are at Wrong Place");
        }
    }
}
