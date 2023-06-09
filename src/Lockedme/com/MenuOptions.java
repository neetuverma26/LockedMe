package Lockedme.com;


import java.util.Scanner;

public class MenuOptions  implements Menu{
    private static int newOption;
    public  void  menuList()
    {
        String menu = "\n\n****** Select any option number from below and press Enter ******\n\n"
                + "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
                + "3) Exit program\n";
        System.out.println(menu);
    }


    public static void displayFileMenuOptions() {
        String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
                + "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
                + "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

        System.out.println(fileMenu);
    }
    public void endApplication()
    {
        System.out.println("Application is ended. Re-run to start again.");
    }
    @Override
    public int menuValue(int a)
    {
        return a;
    }
    @Override
    public void firstMenu(int optionId)
    {
        Scanner option1=new Scanner(System.in);
        int enteredValue= option1.nextInt();
       if(optionId==9)
       {
           this.menuList();
       }
       if(optionId==0)
       {
           this.endApplication();
       }
        if(optionId==1)
        {
            HandleOptions.handleWelcomeScreenInput();
        }

    }
}
