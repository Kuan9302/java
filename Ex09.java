class CCalculator {
   int a;
   int b;
   int c;
   void set_value(int x, int y, int z) {
        x=25;
        y=3;
        z=7;
   }
   void show() {
        System.out.print(a+" "+b+" "+c);
   }
    int add() {
        return a+b+c;
   }
    int sub() {
     return a-b-c;
    }
    int mul() {
     return a*b*c;
    }
    int avg() {
     return (a+b+c)/3;
    }
}
 public class Main9 {
 public static void main(String args[]) {
      CCalculator obj=new CCalculator();   
  obj.a = 25; obj.b = 3; obj.c = 7;
        obj.show();
  obj.add();
  }
}
