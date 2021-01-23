package ArrayPrograms;
//0,2,3,4,5,2,,1,0
//0,2,3,3,,5,2,1,0
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        boolean isMountain=false;
        for(int i=1;i<arr.length-1;i++) {
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]) {
                isMountain=true;

            } else if(arr[i-1]>=arr[i] && arr[i]<=arr[i+1]) {
                return false;
            }
        }



        return isMountain;
    }
    public static void main(String args[]) {
        ValidMountainArray v=new ValidMountainArray();
        int arr[]=new int[] {0,2,3,3,5,2,1,0};
        System.out.println("Is valid Moutain Array? " +v.validMountainArray(arr));
    }
}
