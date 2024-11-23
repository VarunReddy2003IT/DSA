import java.util.Scanner;
import java.util.Arrays;

public class fibbonacci_Search {
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
        sc.close();
        Arrays.sort(arr);
        int fib2=0,fib1=1,fib=fib1+fib2;
        while(fib<n){
            fib2=fib1;
            fib1=fib;
            fib=fib1+fib2;
        }
        int offset =-1;
        while(fib>1){
            int i=Math.min(offset+fib2,n-1);
            if(arr[i]<k){
                fib=fib1;
                fib1=fib2;
                fib2=fib-fib1;
                offset=i;
            }
            else if(arr[i]>k){
                fib=fib2;
                fib1=fib1-fib2;
                fib2=fib-fib1;
            }
            else{
                System.out.printf("Element %d found at %d.",arr[i],i);
                return;
            }
        }
        if(fib1==1&&offset<n&&arr[offset+1]==k){
            System.out.printf("Element %d found at %d.",arr[offset+1],offset+1);
            return;
        }
        
    }
}
