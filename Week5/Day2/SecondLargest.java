public class SecondLargest{
    public static int findSecLar(int[] arr){
        if(arr.length<2){
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        int secondlar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlar=largest;
                largest=arr[i];
            } else if(arr[i]>secondlar && arr[i]!=largest){
                secondlar=arr[i];
            }

            if(secondlar==Integer.MIN_VALUE){
                return -1;
            }
        }

        return secondlar;

    }
}