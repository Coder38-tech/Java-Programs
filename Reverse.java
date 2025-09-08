import java.util.*;
public class Reverse{
    public static void main(String[]args){
            
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter elements for an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Reversed array is: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }

    
}


