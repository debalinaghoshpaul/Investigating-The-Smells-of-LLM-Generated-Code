public class MiddlePointChecker {
    public static boolean isMiddlePoint(int a, int b, int c) {
        return (a < b && b < c) || (c < b && b < a);
    }
    public static void main(String args[]){
        System.out.println(isMiddlePoint(1, 2, 3)); // true
        System.out.println(isMiddlePoint(1, 3, 2)); // true
        System.out.println(isMiddlePoint(2, 1, 3)); // true
        System.out.println(isMiddlePoint(2, 3, 1)); // true
        System.out.println(isMiddlePoint(3, 1, 2)); // true
        System.out.println(isMiddlePoint(3, 2, 1)); // true
        System.out.println(isMiddlePoint(1, 1, 1)); // false
        System.out.println(isMiddlePoint(1, 1, 2)); // false
        System.out.println(isMiddlePoint(1, 2, 1)); // false
        System.out.println(isMiddlePoint(2, 1, 1)); // false
        System.out.println(isMiddlePoint(1, 2, 2)); // false
        System.out.println(isMiddlePoint(2, 1, 2)); // false
        System.out.println(isMiddlePoint(2, 2, 1)); // false
        System.out.println(isMiddlePoint(2, 2, 2)); // false
    }
}
