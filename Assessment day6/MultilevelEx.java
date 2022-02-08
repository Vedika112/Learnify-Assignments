class Parent{  
void parent(){System.out.println("this is parent class");}  
}  
class Parent1 extends Parent{  
void parent1(){System.out.println("this is parent1 class");}  
}  
class Child extends Parent1{  
void child(){System.out.println("this is child class");}  
}  
public class MultilevelEx{  
public static void main(String args[]){  
Child c=new Child();  
c.parent();
c.parent1();
c.child();
}}  