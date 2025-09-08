import java.util.Scanner;
public class Largest_element {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Number:");
            arr[i]=sc.nextInt();

        }
        
        int max = arr[0]; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The largest number is: " + max);
    }
    
}

