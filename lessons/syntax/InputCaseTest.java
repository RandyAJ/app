package lessons.syntax;

import java.io.Console;
import java.util.Scanner;

public class InputCaseTest {
    static String nickNameDB = "IT_Tyson";
    static String passwordDB = "qwe";
    public static void main(String[] args){

        Console cons = System.console();
        String nickName = cons.readLine("Enter your nickname: ");
        char[] password = cons.readPassword("And password: ");
        String passwordStr = new String(password);

        if( !(nickName.equals(nickNameDB)) || !(passwordStr.equals(passwordDB)) ){
            System.out.println("Incorrect data.");
        } else {
            Scanner scanIn = new Scanner (System.in);

            String decision;

            boolean yn = true;

            while(yn) {
                System.out.println("Okay, " + nickName + "! Please enter your real name");
                String name = scanIn.nextLine();

                System.out.println("You entered the name " + name );

                System.out.println("Enter another name : yes or no");
                decision = scanIn.nextLine();

                switch(decision) {
                    case "yes":
                        yn = true;
                        break;
                    case "no":
                        yn = false;
                        break;
                    default:
                        System.out.println("Please enter again ");
                        boolean repeat = true;

                        while (repeat) {
                            System.out.println("Enter another name : yes or no");
                            decision = scanIn.nextLine();

                            switch (decision) {
                                case "yes":
                                    yn = true;
                                    repeat = false;
                                    break;
                                case "no":
                                    yn = repeat = false;
                                    break;
                                default:
                                    repeat = true;
                            }
                        }
                    break;
                }
            }
            scanIn.close();
        }
    }
}
