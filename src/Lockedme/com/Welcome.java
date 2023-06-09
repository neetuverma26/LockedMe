package Lockedme.com;

import java.util.Scanner;

public class Welcome {
    public static void welcomeScreen()
    {
        String myDetails = String.format("*****************************************************\n"
                + "** Welcome to %s.com. \n" + "** This application was developed by %s.\n"
                + "*****************************************************\n", "File Handling", "Neetu Verma");
        String functionsDetail = "This application will do :-\n"
                + "� List all file names inside the \"main\" folder\n"
                + "� Search, add, or delete files in \"main\" folder.\n";

        System.out.println(myDetails);
        System.out.println(functionsDetail);
    }



}
