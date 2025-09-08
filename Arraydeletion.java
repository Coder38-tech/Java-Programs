import java.util.*;
public class Arraydeletion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter elements for an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.print("Press 1->If you want to Delete element from the first position \nPress 2-> If you want to Delete element from a specific Position \nPress 3-> If you want Delete element from the last \nEnter your choice:  ");

        int choice=sc.nextInt();
        //Deletion of element from first position
        if(choice==1){
            int Newarr[]=new int[arr.length-1]; 
            for(int i=0;i<arr.length-1;i++){
                Newarr[i]=arr[i+1];
            }
            System.out.println("After deleting element from first position");
            for(int i=0;i<arr.length-1;i++){
                System.out.print(Newarr[i] +" ");
            }
            System.out.println();
        }
        //Deletion of element from a specific position
        else if(choice==2){
            int newarr[]=new int[arr.length-1];
            System.out.print("Enter the position from which you want to delete the element");
            int p=sc.nextInt();
            for(int i=p-1;i<arr.length-1;i++){
                newarr[i]=arr[i+1];
            }
            for(int i=0;i<p-1;i++){
                newarr[i]=arr[i];
            }
            for(int i=0;i<arr.length-1;i++){
                System.out.print(newarr[i] +" ");
            }
            System.out.println();
        }
        //Deletion of element from last 
        else if(choice==3){
            int Newarr2[]=new int[arr.length-1];
            System.out.println("After deleting element from last ");
            for(int i=0;i<arr.length-1;i++){
                Newarr2[i]=arr[i];
            }
            for(int i=0;i<arr.length-1;i++){
                System.out.print(Newarr2[i] +" ");
            }
        }
        else{
            System.out.println("Enter Valid choice");
        }
    }
    
}
