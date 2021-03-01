public class RightTriangle extends Shape
{
    private int type;
    private double side;
    public RightTriangle (int shapeType, double size1)
    {
        super(shapeType, size1, size1);
        this.type = 3;
    }
    public int getType() {
        return type;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setType(int type) {
        this.type = type;
    }
    public double area ()
    {
        return area(3);
    }
    public String toString() {
        return "Shape= "+ getShapeType()+", size=" + getSize1() + "\n The area of a Right Triangle is side*side/2:\nArea= "+getSize1()+" * "+getSize1()+" = "+area(type)+"\n";
    }
}