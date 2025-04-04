package Q3;

class Circle
{
    double radiusInside;
    double radiusOutside;

    public Circle(double ri,double ro)
    {
        this.radiusInside = ri;
        this.radiusOutside = ro;
    }

    public double computeArea()
    {
        return (Math.PI * Math.pow(radiusOutside,2)) - (Math.PI * Math.pow(radiusInside,2));
    }

    double computeCircumference(double radius)
    {
        return 2 * Math.PI * radius;
    }
}

public class Q3_Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10,20);
        double area = circle.computeArea();
        System.out.println(area);
    }
}
