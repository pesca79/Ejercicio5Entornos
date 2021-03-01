public class Square extends Shape
{
    private int type;
    private double side;
    public Square (int shapeType, double side1)
    {
        super(shapeType, side1, side1);
        this.type = 1;
    }
    public int getType() {
        return type;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = getSize1();
    }
    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Shape= "+ getShapeType()+", size=" + getSize1() + "\n The area of a Square is side*side:\nArea= "+getSize1()+" * "+getSize1()+" = "+area(type)+"\n";
    }

    public double area ()
    {
        return area(1);
    }
}