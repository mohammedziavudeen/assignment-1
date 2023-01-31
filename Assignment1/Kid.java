/*Create a class called 'Kid'. 
2. Declare Field as below in it. 
  1. String name = "Suman"; 
3. Define main method as 'public static void main(String[] args)
4. Inside main method, create an instance called 'kid' for Kid class. 
5. Have below methods in it. 
  1. public void work()
  2. public void study()
6. Have print statements as you wish in the above two methods' definition. 
7. Call study() method from main method. 
8. Inside study() method, call work() method. 
9. Print nameand super.name inside work() method.
*/
class Kid extends Mother
{
	String name= "Suman";
	public static void main(String[] args)
 {
	Kid kid = new Kid();
	kid.work();
	kid.study();
 }
	public void work()
 {
	System.out.println("kid will became a hardworker");
	System.out.println(name+" "+super.name);
 }
	public void study()
 {
	System.out.println("kid is playing");
	System.out.println(name+" "+super.name);
 }
 
}
