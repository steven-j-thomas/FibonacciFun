package com.sjt.training;

import java.io.Console;

public class FibonacciFun {

  public static void main(String[] args) {
    
    FibonacciFun fibonacci = new FibonacciFun();
    
    System.out.print("Please enter a max number to calculate up to: ");
    Console console = System.console();
    
    String valueUpToAsString = console.readLine();
    long valueUpTo = Long.parseLong(valueUpToAsString);
    
    FibonacciResults results = fibonacci.calculateFibonacci(valueUpTo);
    
    System.out.println("\n\nNumbers in calculation: " + results.getSeriesUsed());
    System.out.println("\nMax Calculation: " + results.getCalculatedFibonacci());
    
  }
  
  private FibonacciResults calculateFibonacci(long valueUpTo) {
    
    long f1 = 0;
    long f2 = 1;
    long calculatedResult = 1;
    long nextResult = 1;
    StringBuilder numbersUsed = new StringBuilder("" + f1);
    
    while (nextResult < valueUpTo) {
      
      calculatedResult = nextResult;
      
      nextResult += f2;
      numbersUsed.append(", " + f2);
      
      f1 = f2;
      f2 = calculatedResult;
    }

    numbersUsed.append(", " + calculatedResult);
    
    return new FibonacciResults(calculatedResult, numbersUsed.toString());
  }
}
