package Searching;

public class BinarySearch {
    static int[] arr={5,11,12,34,78,89};
    public int BinarySearch(int low,int high,int target){
        if(low<=high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return BinarySearch(mid + 1, high, target);
            } else {
                return BinarySearch(low, mid - 1, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch b=new BinarySearch();
        System.out.println(b.BinarySearch(0, arr.length-1, 50));
    }
}
