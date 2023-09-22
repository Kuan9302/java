class Cbox {
   int length;
   int width;
   int height;
   void volume() {
    System.out.println("volume = " + length * width * height);
   }
   void surfaceArea() {
    System.out.println("surfaceArea = " + (length + width + height)); 
   }
   void showData() {
    System.out.println("length = " + length);
    System.out.println("width = " + width);
    System.out.println("height = " + height);
   }
   void showAll() {
    showData();
    surfaceArea();
    volume();
   }
}
public class Main5 {
 public static void main (String args[]) {
  Cbox box = new Cbox();
  box.length = 1;
  box.width = 1;
  box.height = 1;
  box.showAll();
 }
}
