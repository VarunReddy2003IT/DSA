package Sortings;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.print("Sorted array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}
