public class Point {

    int x, y;

    // Constructor
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // Method to display point
    void display()
    {
        System.out.println("Point = (" + x + ", " + y + ")");
    }
}

    class PointDemo
    {
        public static void main(String args[])
        {
            Point p1 = new Point(10, 20);
            Point p2 = new Point(30, 40);

            p1.display();
            p2.display();
        }
    }

