import java.util.Scanner;
public class Frequency {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int a=sc.nextInt();
        int numbers[]=new int[a];
        for(int i=0;i<a;i++){
            System.out.print("Enter number:");
            numbers[i]=sc.nextInt();
        }
        System.out.print("Enter the number to find frequency:");
        int x=sc.nextInt();
        int freq=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                freq++;
            }
        }
        System.out.println("The frequency of " + x + " is: " + freq);
        
    }


    
}
