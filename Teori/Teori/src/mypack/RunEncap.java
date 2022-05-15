package mypack;
// File name : RunEncap.java
public class RunEncap {

 public static void main(String[] args) {
  EncapTest encap = new EncapTest();
  encap.setName("Hilarius");
  encap.setAge(22);
  encap.setIdNum("123456789ms");
  System.out.println("Name : " + encap.getName() + " Age : " + encap.getAge());
 }
}
