public class LeetCode_268 {

    public void main(String[] args) {
        int[] arr = {3,0,1};
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[correct] != arr[i]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }

        for (int index = 0; index<arr.length; index++) {
            if(arr[index] != index){
                //return index;
            }
        }
        //return arr.length
    }



    void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
