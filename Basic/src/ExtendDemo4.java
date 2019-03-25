package hujun.com;

class Phone{
   void call(){}
   void show(){
       System.out.println("number" );
   }
}

class NewPhone extends Phone{
   void show(){
       System.out.println("name" );
       System.out.println("pic" );
       super.show();
   }
}
 
class ExtendDemo4{
   public static void main(String[] args){
       NewPhone p = new NewPhone();
       p.show();
   }
}