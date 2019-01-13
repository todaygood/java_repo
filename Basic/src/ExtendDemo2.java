/**
 * 使用super和this
 * 
 */

class Fu{
   private int num = 4;

   public int getNum(){
       return num ;
   }
}

class Zi extends Fu{
   private int num = 5;

   void show(){
       System.out.println(this.num + "..." + super.getNum());
   }
}

class ExtendDemo2{
   public static void main(String[] args){
       Zi z = new Zi();
       z.show();
   }
}

