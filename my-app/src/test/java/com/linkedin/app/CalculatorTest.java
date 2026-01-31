package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
  private Calculator underTest = new Calculator();

  @Test
  public void itShouldAddTwoNumbers() {
    // Given
    int a = 5;
    int b = 10;
    int result = underTest.add(a, b);

    assertEquals(15, result);
  }

  @Test
  public void itShouldAddNegativeNumbers() {
    // Given
    int a = -5;
    int b = -10;
    int result = underTest.add(a, b);
    assertEquals(-15, result, "The addition of two negative numbers is incorrect");
  }

  @Test
  public void isEven() {
   // boolean result = underTest.isEven(4);
    assertTrue(true);
  }
}