class Zahlenfilter {
  public static void main(String[] args) {
    for(int i = 0; i <= 200; i++) {
      if(i%5 == 0) {
        System.out.println(i + " ist durch 5 teilbar!");
      }

      if(i % 10 == 9) {
        System.out.println(i + " endet auf 9!");
      }

      int temp = i + (i-1);
      if(temp % 3 == 0) {
        System.out.println(i +" und " + (i-1) + " addiert ergeben " + temp + " und " + temp + " ist durch 3 teilbar");
      }
    }
  }
}