import java.util.*;
public class percentage_of_subjects {
    public static void main(String[]args){
        float per=0;
        Scanner myObj= new Scanner(System.in);
        System.out.println("enter the subject 1 marks =");
        int s1=myObj.nextInt();
        System.out.println("enter the subject 2 marks =");
        int s2=myObj.nextInt();
        System.out.println("enter the subject 3 marks =");
        int s3=myObj.nextInt();
        System.out.println("enter the subject 4 marks =");
        int s4=myObj.nextInt();
        System.out.println("enter the subject 5 marks =");
        int s5=myObj.nextInt();
        per=(s1+s2+s3+s4+s5)*100/500;
        System.out.println("the percentage of all subject ="+per);
    }
}
