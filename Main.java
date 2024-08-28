import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        if(num>0){
            System.out.print("It is Positive Number");
        }
        else if(num<0){
            System.out.print("It is Negative Number");
        }
        else
            System.out.print("It is zero");
            System.out.println("");
            
            System.out.print("Enter the Day: ");
        int day = input.nextInt();
        switch(day){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
           
        }
        System.out.println("");
        
        System.out.print("Enter the Number: ");
        int number = input.nextInt();
        for(int i=0; i<=number; i++){
            System.out.print(i+" ");
    }
    System.out.println(" ");
    
    System.out.print("Enter the Number: ");
    int value = input.nextInt();
    while(value!=0){
        System.out.print(value--+" ");
    }
    
    
  }
}
        





