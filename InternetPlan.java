public class InternetPlan {

    String planName;
    int speed;
    int price;

    // Default constructor
    InternetPlan()
    {
        this("Basic", 50, 499);
    }

    // Constructor with one parameter
    InternetPlan(String planName)
    {
        this(planName, 100, 699);
    }

    // Constructor with two parameters
    InternetPlan(String planName, int speed)
    {
        this(planName, speed, 799);
    }

    // Main constructor
    InternetPlan(String planName, int speed, int price)
    {
        this.planName = planName;
        this.speed = speed;
        this.price = price;
    }

    void display()
    {
        System.out.println("Plan Name: " + planName);
        System.out.println("Speed: " + speed + " Mbps");
        System.out.println("Price: Rs." + price);
        System.out.println();
    }
}

    class InternetPlanDemo
    {
        public static void main(String args[])
        {
            InternetPlan p1 = new InternetPlan();
            InternetPlan p2 = new InternetPlan("Super");
            InternetPlan p3 = new InternetPlan("Premium", 200);

            p1.display();
            p2.display();
            p3.display();
        }
    }

