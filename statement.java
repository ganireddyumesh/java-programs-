import java.util.*;
public class statement{
       public static void main(String[]args){
        Scanner myObj = new Scanner(System.in); 
         System.out.println("enter the day =");

         int day=myObj.nextInt();
        System.out.println("the day is");
         switch(day){
            case(1):System.out.println("sunday");
             break;
            case(2):System.out.println("monday");
             break;
            case(3):System.out.println("tuesday");
             break;
            case(4):System.out.println("wednesday");
             break;
            case(5):System.out.println("thusday");
             break;
            case(6):System.out.println("friday");
             break;
            case(7):System.out.println("saturday");
             break;
         }
       }
    
}
