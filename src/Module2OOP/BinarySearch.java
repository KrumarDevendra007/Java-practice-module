package Module2OOP;

public class BinarySearch {
    public static void main(String[] args)
    {
        int arr[] = {5,15,25,35,45};
        int n = arr.length;
        int key = 35;
        int ans = binarySearsc(arr, n, key);
        System.out.print(ans);
    }
    static int binarySearsc(int arr[], int len, int key)
    {
        int l = 0;
        int r = len-1;
        int mid = 0;
        while(l<=r)
        {
            mid = (l+r)/2;
            if(arr[mid]==key) return mid;
            if(arr[mid]<key)
            {
                l = mid + 1;
            }
            else if(arr[mid]>key)
            {
                r = mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
