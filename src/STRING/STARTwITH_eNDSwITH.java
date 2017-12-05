/**
 * 
 */
package STRING;

/**
 * @author Atul
 *
 */
public class STARTwITH_eNDSwITH {

	public static void main(String[] args)
	{
		String  fullname="atul hake balwant";
		String []tool =fullname.split(" ");
		
		
		
		
		for(int i =0;i<tool.length;i++)
		{
			System.out.println("index "+i +" is "+tool[i]);
			
			if(tool[i].equalsIgnoreCase("Atul"))
			{
				System.out.println("Test passed");
				//break;
			}
		}
		
		
		
		
		
	}
                           

}
