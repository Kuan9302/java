// (a)
class CWin {
 private static int cnt;
 public static void count() {
  cnt=cnt+1; 
  System.out.println(cnt+" objects");
 }
}
public class eel {
public static void main(String args[]) {
 CWin a=new CWin();
 CWin.count();
 CWin b=new CWin();
 CWin.count();
  }
}

//印出
1 objects
2 objects

// (b) (c) (d) (e)
class CWin {
 private static int cnt;
 static String color;
 static int width;
 static int height;
 public static void count() {
  cnt=cnt+1; 
  System.out.println(cnt+" objects");
 }
 public static void Cwin(String str,int w,int h) {
  color = str;
  width=w;
  height=h;
 }
 public static void CWin() {
  color="red";
  width=2;
  height=2;
 }
 public static void setZore() {
  cnt=0;
  System.out.println(cnt+" objects");
 }
 public static void setValue(int n) {
  cnt=n;
 }
}
public class eel {
public static void main(String args[]) { 
 CWin a=new CWin();
 CWin.count();
 CWin b=new CWin();
 CWin.count();
 CWin.setZore();
 }
}

//印出
1 objects
2 objects
0 objects

// (f)
類別函數，如果不是無法累加

// (g)
實例函數，只要執行count() cnt變累加，如果是類別函數變成物件共用便無法執行
