public class Q8_FindElement {
    static boolean isFound(int arr[], int target,int index)
    {

        //if any point of the time if the value of array is same as the value of the target then at that 
        //time we have to return the true we get the value 
        if(arr[index]==target){
            return true;
        }
        //if the index valus is equal to the last index and it still not able to return the value true so in
        //this case we return false...
        else if(index==arr.length-1){
            return false;
        }
        return isFound(arr, target, index+1);
        
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        int target = 7;

        System.out.println(Q8_FindElement.isFound(arr, target, 0));
    }
}
