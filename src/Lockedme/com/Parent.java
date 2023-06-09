package Lockedme.com;

import java.util.Scanner;

public class Parent  {
   public static int selectedOption;
    public static void main(String[] args)
    {
        Welcome.welcomeScreen();
        MenuOptions mo=new MenuOptions();

      // Scanner option1=new Scanner(System.in);
       // System.out.println("9 � press 9 to get menu list");
       // System.out.println("0 � press 0 to End the application");
       // int enteredValue= option1.nextInt();
        //selectedOption=mo.menuValue(enteredValue);
        HandleOptions.handleWelcomeScreenInput();
    }



}
