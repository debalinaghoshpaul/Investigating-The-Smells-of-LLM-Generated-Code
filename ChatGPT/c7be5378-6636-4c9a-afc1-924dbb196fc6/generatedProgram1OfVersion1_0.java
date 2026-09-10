
public class PointInTriangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the coordinates of the triangle vertices:");
        System.out.print("Vertex 1 (x1, y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        System.out.print("Vertex 2 (x2, y2): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        System.out.print("Vertex 3 (x3, y3): ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        
        System.out.println("Enter the coordinates of the point to check:");
        System.out.print("Point (x, y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        boolean result = isPointInTriangle(x1, y1, x2, y2, x3, y3, x, y);
        
        if(result) {
            System.out.println("The point is inside the triangle.");
        } else {
            System.out.println("The point is outside the triangle.");
        }
        
        sc.close();
    }
    
    public static boolean isPointInTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y) {
        int areaOfTriangle = Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2);
        
        int area1 = Math.abs((x1*(y2-y) + x2*(y-y1) + x*(y1-y2))/2);
        int area2 = Math.abs((x1*(y-y3) + x*(y3-y1) + x3*(y1-y))/2);
        int area3 = Math.abs((x*(y2-y3) + x2*(y3-y) + x3*(y-y2))/2);
        
        return (area1 + area2 + area3 == areaOfTriangle);
    }
}