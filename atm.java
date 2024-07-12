import java.util.*;
class atm 
{
    public static void main (String args[])
    {
        int balance = 10000;
        int withdraw;
        int deposition;
        Scanner sc = new Scanner (System.in);
       while(true)
       {
       
        System.out.println("...ATM...");
        System.out.println("Enter 1 if you want to withdrawn money");
        System.out.println("Enter 2 if you want to deposit money");
        System.out.println("Enter 3 if you want to check your bank balanace");
        System.out.println("Enter 4 if you want to exit");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1: 
                System.out.print("Enter the amount you want to withdrawn:");
                withdraw = sc.nextInt();
                
                if (withdraw <= balance)
                {
                   balance = (balance - withdraw);
                
                System.out.println("please collect your money");
                } 
                
         
        else 
        {
            System.out.println("Insufficent Balance");
            
        }
          System.out.println("");
        break;
        
        case 2:
            System.out.print("Enter the money you want to Deposit:");
            deposition = sc.nextInt();
            balance = (balance + deposition);
            System.out.println("your money successfully deposited");
            System.out.println("");
            break;
            
            case 3:
                System.out.println("total Balance=" +balance);
                System.out.println("");
                break;
    
            case 4:
    
    System.exit(0);
    
    default:
    System.out.println("Invalid choice. Please enter a valid option.");
    System.out.println("");
    break;
}
}
}
}