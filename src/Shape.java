// Refactoriza la siguiente clase para que en un futuro se puedan soportar más formas (Shapes)

public class Shape {
 public static final int SQUARE = 1;
 public static final int CIRCLE = 2;
 public static final int RIGHT_TRIANGLE = 3;
 public static final int RECTANGLE = 4;

 private int shapeType;
 private double size1;
 private double size2;
 public Shape(int shapeType, double size1, double size2) {
  this.shapeType = shapeType;
  this.size1 = size1;
  this.size2 = size2;
 }

 @Override
 public String toString() {
  return "Shape= "+ getShapeType()+", size1=" + size1 +", size2=" + size2 + "\nArea= "+area(shapeType);
 }

 public String getShapeType() {
  return showShape(shapeType);
 }

 public double getSize2() {
  return size2;
 }

 public void setSize2(double size2) {
  this.size2 = size2;
 }

 public double getSize1() {
  return size1;
 }
public String showShape(int shapeType){
 if (shapeType==1) return "Square";
 if (shapeType==2) return "Circle";
 if (shapeType==3) return "Right Triangle";
 if (shapeType==4) return "Rectangle";
 return null;
}
 // ... other methods ...
 public double area(int shapeType) {
  switch (shapeType) {
   case SQUARE: return size1*size1;
   case CIRCLE: return Math.PI*size1*size1/4.0;
   case RIGHT_TRIANGLE: return size1*size1/2.0;
   case RECTANGLE: return size1*size2;
  }
  return 0;
 }
}