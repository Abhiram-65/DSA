
class Sundays {
   public static void main(String[] var0) {
      String str = "thu";
      int n = 25;
      count(str, n);
   }

   static void count(String str, int n){
    String[] days = {"sun","mon","tue","wed","thu","fri","sat"};
    int start = 0;
      for(int i=0;i<7;i++){
        if(str.equals(days[i])){
          start = i;
          break;
        }
      }
      int c = 0;
      for(int i= 0;i<n;i++){
        int current = (i + start) % 7;
        if(days[current].equals("sun")){
          c++;
        }
      }
      System.out.println(c);
   }
}
