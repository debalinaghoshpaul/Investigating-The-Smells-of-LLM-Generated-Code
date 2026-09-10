@Test
public void testEnumContainsFirstAndLastConstants() {
    assertTrue(Weekend.contains(Weekend.SATURDAY));
    assertTrue(Weekend.contains(Weekend.SUNDAY));
}
