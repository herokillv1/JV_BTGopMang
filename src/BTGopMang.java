public class BTGopMang {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {1,2,3,4,5,6};
        int[] arr3 = new int[arr1.length+arr2.length];

        for (int i=0;i<arr3.length;i++){
            if (i<arr1.length){
                arr3[i]=arr1[i];
            }else if (i>=arr1.length){
                arr3[i]=arr2[i-arr1.length];
            }
        }
        for (int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+"\t");
        }
    }
}
