class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
       /* Write your code here */
      
      System.out.println("Please enter a two digit number:");
      
      int one = scan.nextInt();
      int copy = one;
      System.out.println("Here are the digits:");
      
      System.out.println(one / 10);
      System.out.println(copy % 10);
      
  }
}