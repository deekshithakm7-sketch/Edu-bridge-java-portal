public class Rectangle {
    int length;
    int breath;
    void CalculateArea(){
    int area=length*breath;
    System.out.println("Area of rectangle = "+ area);
    }
    public static void main(String[]args){
        Rectangle r= new Rectangle();
        r.length=10;
        r.breath=5;

        r.CalculateArea();
    }
}
