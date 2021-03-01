public class Rectangle extends Shape
{
    private int type;
    private double side1;
    private double side2;
    public Rectangle (int shapeType, double side1, double side2)
    {
        super(shapeType, side1, side2);
        this.type = 4;
    }
    public int getType() {
        return type;
    }
    public double getSide() {
        return side1;
    }
    public void setSide(double side1) {
        this.side1 = getSize1();
    }
    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Shape= "+ getShapeType()+", size=" + getSize1() + "\n The area of a Rectangle is side1*side2:\nArea= "+getSize1()+" * "+getSize2()+" = "+area(type)+"\n";
    }

    public double area ()
    {
        return area(1);
    }
}