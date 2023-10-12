// (a)
class CCount {
 static int cnt=0;
 public CCount () {
  cnt ++;
 }
 public static void count() {
  System.out.println(cnt+"object(s) created");
 }
}
 public class eel {
  public static void main(String args[]) {
   CCount a=new CCount();
   CCount.count();
   CCount b=new CCount();   
   CCount c=new CCount();
   CCount.count();
   CCount.count();
  }
 }

//印出
1object(s) created
3object(s) created
3object(s) created

// (b)
class CCount {
 static int cnt=0;
 public CCount () { 
  cnt ++;
 }
 public  void count() { 
  System.out.println(cnt+"object(s) created");
 }
 void setValue() {
  cnt=0;
 }
}
 public class eel{
  public static void main(String args[]) {
   CCount a=new CCount();
   a.count();
   CCount b=new CCount();   
   CCount c=new CCount();
   b.count();
   a.setValue();
   c.count();
  }
 }

///印出
1object(s) created
3object(s) created
0object(s) created

// (c)
可是n 是int整數型態所以填上任意整數的意思嗎?還是輸出要變成只有n??在類別中加入此函數，可任意在setValue()輸入整數
       void setValue(int n)
 {
  cnt=n;
 }

// (d)
類別變數，static 修飾子加上成為類別變數，類別變數是每一個物件共享，因此會隨物件建立而累加

// (e)
實例函數，只要執行count() cnt變累加，如果是類別函數變成物件共用便無法執行。
