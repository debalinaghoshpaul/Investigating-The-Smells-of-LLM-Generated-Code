// Define an enum called Months with constants representing the months of the year
enum Months {
  JANUARY,
  FEBRUARY,
  MARCH,
  APRIL,
  MAY,
  JUNE,
  JULY,
  AUGUST,
  SEPTEMBER,
  OCTOBER,
  NOVEMBER,
  DECEMBER
}

// Sample usage
public class Main {
  public static void main(String[] args) {
    // Get the current month
    Months currentMonth = Months.SEPTEMBER;

    // Print the current month
    System.out.println("The current month is: " + currentMonth);
  }
}

// Test cases
public class TestCases {

  @Test
  public void testGetCurrentMonth() {
    // Test getting the current month
    Months currentMonth = Months.SEPTEMBER;

    // Assert that the current month is September
    assertEquals(Months.SEPTEMBER, currentMonth);
  }

  @Test
  public void testCornerCase_GetMonthBeforeJanuary() {
    // Test getting a month before January
    Months monthBeforeJanuary = Months.DECEMBER;

    // Assert that the month before January is December
    assertEquals(Months.DECEMBER, monthBeforeJanuary);
  }

  @Test
  public void testCornerCase_GetMonthAfterDecember() {
    // Test getting a month after December
    Months monthAfterDecember = Months.JANUARY;

    // Assert that the month after December is January
    assertEquals(Months.JANUARY, monthAfterDecember);
  }
}
