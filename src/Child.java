
public class Child extends parent {
  int id;
  String name;
  String city;
  
  Child(){
  this(101);
  
	  System.out.println("this is no orgument constracter and child class constractor");
  }
  
  Child (int id,String name,String city){
	  
	  System.out.println("this  is parameterrized constracter ");
  }
	  
  Child(int id){
  this(101,"ramesh","nanded");
  System.out.println("the child constrcter id");
  }
 public static void main(String args[]) {
	 Child ch=new Child();
	 
 }}
  
  
  
  

