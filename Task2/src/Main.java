import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int ReverseNumber(int n){
        int reverse=0;
        int remainder;
        while (n!=0){
            remainder= n%10;
            reverse= (reverse*10)+remainder;
            n=n/10;
        }
        return reverse;
    }

    public static int RandomNumber(int value){
       int number = (int)(0+value*Math.random());
       return number;
    }
    public static int RandomBetweenMinAndMax(int MinValue, int MaxValue){
        int randombetween= (int)(Math.random()*(MaxValue-MinValue)+MinValue);
        return randombetween;
    }
    public static char RandomCharacter(){
        Random r = new Random();
        return (char)(r.nextInt(26)+'A');
    }

    public static <T> void printarray(T[]array){
        for(int i =0;i< array.length;i++)
            System.out.println(array[i]);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("please enter the number:");

        int number= s.nextInt();

        System.out.println("the number in reverse order is :"+ReverseNumber(number));

        System.out.print("please enter an integer number to get random values:");

        int rand = s.nextInt();

       if (rand>=0){
           System.out.println("random intger is :"+RandomNumber(rand));
       }else {
           System.out.println("enter a valid number");
       }

        System.out.print("enter min value:");

        int min_value=s.nextInt();

        System.out.print("enter max value:");

        int max_value=s.nextInt();

        System.out.println("random integer between max and min is:"+RandomBetweenMinAndMax(min_value,max_value));

        System.out.println("random char is : "+RandomCharacter());

        Integer[]array={1,2,3,5,6,7};
        printarray(array);



    }
}
