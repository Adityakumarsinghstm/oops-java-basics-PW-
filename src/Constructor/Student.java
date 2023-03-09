package Constructor;
class C{
    C(int i)
    {
        System.out.println("parent constructor");
    }
    C()
    {

    }
}
class P extends C{
   P()
   {
  
       System.out.println("Child constructor");
   }
}
 class Student {
   public static void main(String[] args) {
    P p = new P();
    }

}

