import java.util.Scanner;
class Sparse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==0){
                    count++;
                }
            }
        }
        int total=r*c;
        int nonZero=total-count;
        if(count>(total/2)){
            System.out.println("The matrix is sparse matrix:");
            int S[][]=new int[nonZero][3];
            int k=0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(arr[i][j]!=0){
                        S[k][0]=i;
                        S[k][1]=j;
                        S[k][2]=arr[i][j];
                        k++;
                    }
                }
            
            }
            for(int i=0;i<nonZero;i++){ 
                for(int j=0;j<3;j++){
                    System.out.print(S[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("The matrix is not sparse matrix.");
        }
        
        
        
    }

    
    
}
