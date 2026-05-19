

class Main {
    public static void main(String[] args) {
        int n = 16;
        int c = 0;
        for(int i=1;i < n/i;i++){
            if(n%i == 0){
                c++;
            }
        }
        System.out.println(n + " Factors " + c);
    }
}
