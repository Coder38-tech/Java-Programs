import java.util.*;
public class SearchElement {
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);

        //Taking Size for array
        System.out.print("Enter size of an array:");
        int n=sc.nextInt();
        int[] arr=new int[n];

        //input elements for array
        System.out.println("Enter elements in array:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        //input searching element
        System.out.print("Enter element which you want to search in this specific Array: ");
        int searchElement=sc.nextInt();

        //Searching element
        for(int i=0;i<n;i++){
            if(arr[i]==searchElement){
                System.out.println("Entered element " +searchElement+ " exists at " +(i+1)+ " position");
            }
        }

    }
    
}
