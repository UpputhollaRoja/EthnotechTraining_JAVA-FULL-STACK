public class columnwisesum{
    public static void main(String[] args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                sum+=arr[j][i];
            }
            System.out.println("Sum of column "+(i+1)+" is: "+sum);
            sum=0;
        }
    }
}