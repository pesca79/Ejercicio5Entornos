public class Circle extends Shape
{
    private int type;
    private double radio;
    public Circle (int shapeType, double size1)
    {
        super(shapeType, size1, size1);
        this.type = 2;
        this.radio = size1;
    }
    public int getType() {
        return type;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void setType(int type) {
        this.type = type;
    }
    public double area ()
    {
        return area(2);
    }
    public String toString() {
        return "Shape= "+ getShapeType()+", size=" + getSize1() + "\n The area of a Circle is 2*PI*r:\nArea= 2 * PI * "+getSize1()+" = "+area(type)+"\n";
    }
}