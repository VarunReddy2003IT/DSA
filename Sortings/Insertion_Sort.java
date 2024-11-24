package Sortings;

import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                continue;
            }
            int ele=arr[i];
            int j=0;
            for(j=i-1;j>=0;j--){
                if(arr[j]>ele){
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1]=ele;
        }
        System.out.print("Sorted array: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
