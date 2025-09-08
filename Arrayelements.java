import java.util.*;
class Arrayelements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]= new int[n];
        int sum=0;
        double avg=0;
        
        System.out.println("Enter elements for an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum += arr[i];
        }

        //Accessing elements of an array
        System.out.println("Elements of array are:");
        for(int i=0;i<n;i++){
            System.out.println("Element at index " +i+ " is:" +arr[i]);
        }

        //sum of all numbers of an array
        System.out.println("Sum of all elements of an array: " +sum);

        //Average of elements of an array
        avg=sum/n;
        System.out.println("Average of elements in an array: " +avg);

        
    }

    
}
