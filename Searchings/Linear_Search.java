import java.util.Scanner;

public class Linear_Search{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the search element: ");
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.printf("Element %d found at index %d",arr[i],i);
                return;
            }
        }
        System.out.println("Element Not Found ");
        sc.close();
    }
}