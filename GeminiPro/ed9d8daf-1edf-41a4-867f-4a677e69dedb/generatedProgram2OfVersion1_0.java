// Corner cases:

// Add a negative quantity
try {
    inventory.addProduct("Apple", -1);
    fail("Expected IllegalArgumentException");
} catch (IllegalArgumentException e) {
    // Expected exception
}

// Remove a product that doesn't exist
try {
    inventory.removeProduct("Orange", 1);
    fail("Expected IllegalArgumentException");
} catch (IllegalArgumentException e) {
    // Expected exception
}

// Remove a quantity greater than current inventory
try {
    inventory.removeProduct("Apple", 10);
    fail("Expected IllegalArgumentException");
} catch (IllegalArgumentException e) {
    // Expected exception
}

// Regular test cases:

inventory.addProduct("Apple", 5);
inventory.addProduct("Orange", 3);
inventory.addProduct("Banana", 2);

// Check inventory levels
assertTrue(inventory.isLowInventory("Apple", 2));
assertFalse(inventory.isLowInventory("Orange", 2));

// Remove some products
inventory.removeProduct("Apple", 2);
inventory.removeProduct("Orange", 1);

// Check updated inventory levels
assertFalse(inventory.isLowInventory("Apple", 2));
assertTrue(inventory.isLowInventory("Orange", 2));

// Check product quantities
assertEquals(3, inventory.getQuantity("Apple"));
assertEquals(2, inventory.getQuantity("Orange"));
assertEquals(2, inventory.getQuantity("Banana"));
