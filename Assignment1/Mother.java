/*Mother: 
1. Create a class called 'Mother'. 
2. Declare Field as below in it.
  1. String name = "Stella"; 
3. Have below method in it. 
  1. public void work()
4. Have print statement to print 'name' and super.name in work() definition.  
5. Add 'super.work();' inside work() method. */

public class Mother extends Grandma
{
	String name = "Stella";
 
	public void work()
 {
	System.out.println(name+" "+super.name);
 }
}
