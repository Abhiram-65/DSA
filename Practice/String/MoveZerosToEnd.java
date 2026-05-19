import java.util.Scanner;
class MoveZerosToEnd{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        moveZeroes(arr,n);
  }
  // static void moveZeroes(int[] arr, int n){
  //   int write = 0;
  //   for(int num : arr){
  //     if(num != 0){
  //       arr[write]  = num;
  //       write++;
  //     }
  //   }
  //   while(write < n){
  //     arr[write] = 0;
  //     write++;
  //   }

  // OR
  
  static void moveZeroes(int[] arr, int n){
    int write = 0;
    for(int i=0;i<n;i++){
      int num = arr[i];
      if(num != 0){
        int temp = arr[i];
        arr[i] = arr[write];
        arr[write] = temp; 
        
        write++;
      }
    }
    System.out.println(java.util.Arrays.toString(arr));
  }
}
