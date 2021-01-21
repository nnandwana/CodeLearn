package ArrayPrograms;
//10,2,5,3
public class CheckIfExist {
    public boolean checkIfExist(int[] arr) {
        boolean isExist=false;
        for(int j=0;j<arr.length;j++) {
            for (int i = j+1; i < arr.length; i++) {
                if (arr[j] == arr[i] * 2 || (arr[j] == arr[i] / 2 && arr[i] % 2==0)) {
                    isExist = true;
                    System.out.println(arr[i] +" "+arr[j]);
                    return isExist;
                }

            }
        }
        return isExist;
    }
    public static void main(String args[]) {
        CheckIfExist c =new CheckIfExist();
        int arr[]=new int[] {-2,0,10,-19,4,6,-8};
        System.out.println(" is Exist ?" +c.checkIfExist(arr));
    }
}
