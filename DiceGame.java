import java.util.*;

public class DiceGame{
    public static void main(String[] args){
        int d1,d2;
        Random rand=new Random();
        System.out.print("> ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello, "+sc.next()+"!");
        System.out.println("Rolling dice...");
        d1=rand.nextInt(6)+1;
        d2=rand.nextInt(6)+1;
        System.out.println("Die 1: "+d1);
        System.out.println("Die 2: "+d2);
        System.out.println("Total value: "+(d1+d2));
        if((d1+d2)>7){
            System.out.println("You won");
        }else{
            System.out.println("You lost.");
        }
    }
}
