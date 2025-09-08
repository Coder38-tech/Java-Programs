import java.util.*;
public class Arraymultiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]= new int[n];
        double mul=1;
        System.out.println("Enter elements for an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        //multiplication of numbers at even index
        for(int i=0;i<n;i=i+2){
            mul *= arr[i];
        }
        System.out.println("Multiplication of elements at even index in array: " +mul);
    }
}
