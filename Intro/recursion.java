class Factorial {
  public int calculate_Fact_recursion(int n){
    if(n==0)
      System.out.println("Factorial of 0 is 1");
    else if(n==1)
      return n;

    return n*calculate_Fact_recursion(n-1);
  }
}


public class Main {
  public static void main(String[] args) {
    Factorial f = new Factorial();
    int n = 5;
    System.out.println("Factorial of "+n+" is "+f.calculate_Fact_recursion(n));
  }
}