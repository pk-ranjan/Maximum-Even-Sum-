public class Main {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5};
    int maxEvenSum = findMaxSum(arr);
    System.out.println(maxEvenSum);
  }
  
  public static int findMaxSum(int[] arr){
    int sum = 0;
    // find the sum of all the elements of the array
    for ( int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    // check sum is even, if yes then return sum
    if (sum % 2 == 0){
      return sum;
    } else{
      // if sum is not even, we have to find and remove the smallest odd element from the array
      int minOdd = Integer.MAX_VALUE;
      for ( int i = 0; i < arr.length; i++){
      if(arr[i] % 2 != 0 && arr[i] < minOdd){
      minOdd = arr[i];
      }
      }
      sum = sum - minOdd;
      return sum;
    }
    return 0;
  }
}
