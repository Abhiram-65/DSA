  public class CountPrior {
    public static void main(String[] args) {
      int arr[] = {3,4,5,8,9};
      count1(arr);
      count2(arr);
    }
    static void count1(int arr[]){
      int c = 0;
      int n = arr.length;
      for(int i=n-1;i>=0;i--){
      boolean f = true;
        for(int j=0;j<i;j++){
          if(arr[i] < arr[j]){
            f = false;
            break;
          }
        }
        if(f == true){
          c++;
        }
      }
      System.out.println(c);
    }
    static void count2(int arr[]){
      int c = 0;
      int n = arr.length;
      int max = Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        if(arr[i] > max){
          c++;
          max = arr[i];
        }
      }
      System.out.println(c);
    }
  }
