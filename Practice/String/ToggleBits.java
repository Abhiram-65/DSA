class ToggleBits {
  public static void main(String[] args) {
    int n = 40;
    toggle(n);
  }

  static void toggle(int n) {
    // we need XOR operation with the help of mask
    // mask
    int bits = Integer.toBinaryString(n).length();
    int mask = (1 << bits) - 1;
    System.out.println(n ^ mask);
  }
}
