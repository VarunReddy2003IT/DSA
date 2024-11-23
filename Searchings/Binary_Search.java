
import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the search element: ");
        int k = sc.nextInt();
        int l=0,r=n-1;
        while(l<=r){
           int mid=(l+r)/2;
           if(arr[mid]==k){
                System.out.printf("Element %d found at index %d",arr[mid],mid);
                return;
            }
            else if(arr[mid]<k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        System.out.println("Element Not Found ");
        sc.close();
    }
}


