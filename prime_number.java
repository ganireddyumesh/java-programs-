import java.util.*;
public class prime_number{
    public static void main(String[]args){
        int i,flag=0;
       Scanner umesh=new Scanner(System.in);
       System.out.println("enter the number");  
       int n= umesh.nextInt();
      if(n==0||n==1){
        flag=1;
      }
      else{
        for(i=2;i<=n/2;i++){
            if(n%2==0){
                flag=1;
                break;
            }
        }
      }
      if(flag==0){
        System.out.println("its a prime number");
      }
      else{
        System.out.println("its not a prime number");
      }
    }
    
}
