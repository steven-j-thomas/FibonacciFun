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
    
    System.out.println("\n\nNumbers used in calculation: " + results.getSeriesUsed());
    System.out.println("\nFibonacci Calculated to: " + results.getCalculatedFibonacci());
    
  }
  
  private FibonacciResults calculateFibonacci(long valueUpTo) {
    
    long f2 = 1;
    long calculatedResult = 1;
    long nextResult = 1;
    StringBuilder numbersUsed = new StringBuilder("0");
    
    //loop until the calculation passes the entered valueUpTo
    while (nextResult < valueUpTo) {
      
      calculatedResult = nextResult;
      
      nextResult += f2;
      numbersUsed.append(", " + f2);
      
      f2 = calculatedResult;
    }

    numbersUsed.append(", " + calculatedResult);
    
    return new FibonacciResults(calculatedResult, numbersUsed.toString());
  }
}
