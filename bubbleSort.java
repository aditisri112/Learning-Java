class bubbleSort {
    public static void main(String[] args) {
        //n-1 iterartions where n is the length of array
        int arr[] = {9,8,3,5,2,1};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    
}
