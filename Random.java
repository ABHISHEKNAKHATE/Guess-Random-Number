import java.util.Scanner;

public class Random
{
    public static void main(String[] args) {
    //MiNi Project
    Scanner A=new Scanner(System.in);
    int myNumber=(int)(Math.random()*100);
    int UserNumber=0;

    do {
            System.out.println("Guess My Number(1-100) : ");
             UserNumber=A.nextInt();
 
             if(UserNumber==myNumber){
               System.out.println("WOOHOO...Correct Number!!!");
               break;  
             }
              else if(UserNumber>myNumber){
                System.out.println("Your Number is too Large");
             }
             else{
               System.out.println("Your Number is too Small");
             }
        }while(UserNumber>=0);

        System.out.println("My Number Was : ");
        System.out.println(myNumber);
    
  }
}
