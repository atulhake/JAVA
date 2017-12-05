package practis;

public class primeno {

	public static void main(String[] args) 
	{
		int num=50;
		int count=0;
		int i,j;
		for(i=2;i<=num;i++)
		{
		count=0;	
		for(j=2;j<=i/2;j++)
				{
						if(i%j==0)
						{
							count++;
							break;
						}
				}
			if(count==0)
			{System.out.println(i);}
		}
		
			
	}

}

//
//for(int i=2;i<=num;i++){
//	 
//count=0;
// 
//for(int j=2;j<=i/2;j++){
// 
//if(i%j==0){
//count++;
//break;
//}
// 
//}
// 
//if(count==0){
// 
//System.out.println(i);
// 
//}
// 
//}
// 
//}
// 
//}