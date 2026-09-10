@Test
public void testEnumDoesNotContainUnexpectedConstants() {
    assertFalse(Weekend.contains(Weekend.MONDAY));
    assertFalse(Weekend.contains(Weekend.TUESDAY));
    assertFalse(Weekend.contains(Weekend.WEDNESDAY));
    assertFalse(Weekend.contains(Weekend.THURSDAY));
    assertFalse(Weekend.contains(Weekend.FRIDAY));
}
