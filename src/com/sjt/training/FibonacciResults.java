package com.sjt.training;

/**
 * 
 * Immutable Class to hold the result of Fibonacci calculations
 * 
 * @author Steven J Thomas
 *
 */
public class FibonacciResults {

  private final long calculatedFibonacci;
  private final String seriesUsed;
  
  FibonacciResults(long calculatedFibonacci, String seriesUsed) {
    
    this.calculatedFibonacci = calculatedFibonacci;
    this.seriesUsed = seriesUsed;
  }
  
  public long getCalculatedFibonacci() {
    return calculatedFibonacci;
  }
  public String getSeriesUsed() {
    return seriesUsed;
  }
  
}
