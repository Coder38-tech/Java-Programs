import java.util.*;
class Insertelements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter elements for an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.print("Press 1->If you want to Insert element at the beginnig \nPress 2-> If you want to Insert element at a specific Position \nPress 3-> If you want Insert element at the last \nEnter your choice: ");

        int choice=sc.nextInt();

        //Inserting element at the beginning of an array
        if(choice==1){
            int Newarr[]=new int[arr.length+1]; 
            for(int i=arr.length-1;i>=0;i--){
                Newarr[i+1]=arr[i];
            }
            System.out.print("Enter element for beginning:");
            int n1=sc.nextInt();
            Newarr[0]=n1;
            System.out.println("After inserting:");
            System.out.println("Elements in array are:");
            for(int i=0;i<arr.length+1;i++){
                System.out.print(Newarr[i]+ " ");
            }
            System.out.println();
        }
        //Inserting element at a given position
        else if(choice==2){
            int newarr[]=new int[arr.length+1];
            System.out.print("Enter at which position you want to enter an element in array:");
            int p=sc.nextInt();
            System.out.println("Enter element:");
            int n2=sc.nextInt();
            for(int i=arr.length-1;i>=p-1;i--){
                newarr[i+1]=arr[i];
            }
            for(int i=0;i<p-1;i++){
                newarr[i]=arr[i];
            }
            newarr[p-1]=n2;
            System.out.println("After inserting:");
            for(int i=0;i<arr.length+1;i++){
                System.out.print(newarr[i]+ " ");
            }
            System.out.println();
        }
        // Insert element at last 
        else if(choice==3){
            int newarr1[]=new int[arr.length+1];
            for(int i=0;i<arr.length;i++){
                newarr1[i]=arr[i];
            }
            System.out.print("Enter element which you want to insert at the last:");
            int n3=sc.nextInt();
            newarr1[newarr1.length-1]=n3;
            System.out.println("After inserting at last position:");
            for(int i=0;i<newarr1.length;i++){
                System.out.print(newarr1[i]+ " ");
            }
        }
        else{
            System.out.println("Enter Valid Choice");
        }    
    }    
}
