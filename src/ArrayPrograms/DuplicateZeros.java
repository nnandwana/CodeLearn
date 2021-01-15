package ArrayPrograms;
//Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
//1,0,2,3,0,4,5,0
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]==0) {
                for(int j=arr.length-1;j>i;j--){
                    arr[j]=arr[j-1];
                }
                i++;
            }

        }
        for(int arrs:arr) {
            System.out.println(arrs);
        }
    }
    public static void main(String args[]) {
        DuplicateZeros d=new DuplicateZeros();
        int arr[] =new int[]{1,0,2,3,0,4,5,0};
        d.duplicateZeros(arr);
    }
}
