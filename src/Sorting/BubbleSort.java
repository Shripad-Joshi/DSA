package Sorting;

import Basic.BasicImpl;

public class BubbleSort {
    static int[] arr={12,34,11,5,78,89};

    void sort(){
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    void sortOptimize(){
        int s=0;
        for(int i=0;i< arr.length-1;i++){
            s=0;
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    s=1;
                }
            }
            if(s==0)
                break;
        }
    }
    public static void main(String[] args) {
        BubbleSort b=new BubbleSort();
        b.sort();
        b.sortOptimize();
        BasicImpl.printArray(arr);
    }
}
