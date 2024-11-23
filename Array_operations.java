import java.util.Arrays;


public class Array_operations {
    public static void main(String[] args) {

    // array sorting 
      int arr[]={1,3,4,2,6};
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));

    //   array equal check
    int arr1[]={3,2,5,4,6};
    int arr2[]={3,2,5,4,6};
    System.out.println(Arrays.equals(arr1,arr2));
        
    // array inserting and printing
    int arr3[]={1,2,3,4,5};
    for(int i=0;i<arr3.length;i++) {
        System.out.println(arr3[i]);
    }

    }
}
