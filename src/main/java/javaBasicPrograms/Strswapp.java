package javaBasicPrograms;

public class Strswapp {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="World";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		System.out.println(b);
		a=a.substring(b.length());
		System.out.println(a);
		
		String s=endUp("hi");
		System.out.println(s);
		
		String nstring=everyNth("Miracle",3);
		
		int arr[]= {3,5,6,10,8,7,11,9,1};
		//firstLast6(arr);
		 //int arr1[]=reverse3(arr);
		int avg= centeredAverage(arr);
		System.out.println(avg);
		int arr1[]= {1, 6, 2, 2, 7, 1, 6, 99, 99, 7};
		int sum= sum67(arr1);
		System.out.println(sum);
		
		stringcheck("Hello");
		
		
	}

	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		  
		if (!weekday || vacation)
		    return true;
		  
		  
		  return false;
}
	
	public static String endUp(String str) {
		  
		  String s="";
		  if(str.length()<=3)
			  return(str.toUpperCase());
		  else {
		  for(int i=str.length()-3;i<=str.length()-1;i++)
		  {
		   s=s+str.charAt(i); 
		   
		  }
		  s=s.toUpperCase();
		  return(str.substring(0, str.length()-3)+s);
		}
	}
	
	public static String everyNth(String str, int n) {
		
			  String s="";
			  
			    for(int j=0;j<str.length();j=j+n)
			    {
			       s=s+str.charAt(j);
			       
			     
			    }
			 
			  return s;
			  
			}
	
	public static boolean firstLast6(int[] nums) {
		  for(int i=0;i<=nums.length-1;i++)
		  {
			  int len=nums.length-1;
		    if(i==0 && nums[i]==6)
		  return true;
		   if(i==len && nums[i]==6)
		    	return true;
		   
		  }
		   
		    return false;
		  
		}
	
	public static int[] reverse3(int[] nums) {
		
		  int arr[]= new int[5];//{0,0,0,0,0} ;
		  
		  int count=0;
		  for(int i=nums.length-1;i>=0;i--)
		  {
			  
		    arr[count]=nums[i];
		   
		    count++;
		    
		  }
		  return arr;
		}

	
	public boolean has23(int[] nums) {
		  
		  for(int i=0;i<=3;i++)
		  {
		    for(int j=0;j<=2;j++)
		    {
		      if(nums[i]==2 ||nums[i]==3)
		      return true;
		     
		    }
		  }
		  return false;
		}
	
	/*Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and
	smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy
	, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.*/

	public static int centeredAverage(int[] nums) {
		  int largest=nums[0];
		  int smallest=nums[0];
		  int sum=0,sum1=0;
		  int len=0;
		  int avg=0,avg1=0;
		  int i,count=0,count1=0;
		  int sc=0,lc=0,sindex=0,lindex=0,flag=0;;
		  
		  for(i=0;i<nums.length;i++)
		  {
		    if(nums[i]>largest)
		    largest=nums[i];
		    lindex=i;
		    if(smallest>nums[i])
		    {smallest=nums[i];
		    	sindex=i;
		    }
		  }
		  
		  for(int m=0;m<nums.length;m++) //{2,3,4,5,6,10,8,7,11,9}
		  {	if(sindex!=m ||  lindex!=m )
		  	{	
		  		if(nums[m]!=0)
		  		{  count++;
		         sum=sum+nums[m];
		  		}
		   
		  }if( count!=0)
		  { avg=sum/count;
		      System.out.println(avg);
		  }
		   
		  for(int k=0;k<nums.length;k++)
		  {
			  for(int j=k+1;j<nums.length;j++)
			  {
				  if(nums[k]==nums[j] && smallest==nums[k])
				  {
					  sc=sc+1;
					  if(sc==1)
						  nums[j]=0;
					
					  
				  }else if(nums[k]==nums[j] && largest==nums[k])
				  {
					lc=lc+1;
					if(lc==1)
					nums[j]=0;
					  
				  }
				  
			  }
			  if(nums[k]!=0)
			  {
				  count1++;
				  sum1=sum1+nums[k];
			  }
				  
		  }
		  if(sum1>0 && count1>0)
		  {avg1=sum1/count1;
		  	return avg1;}
		 
		}


		

		  return 1;
}
	
	/*Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 
	and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
	*/
	public static int sum67(int[] nums) {
		  int temp=0,sum=0,j=0,flag=0;
		  if(nums.length>0)
		  {
		    for(int i=0;i<nums.length;i++)
		    {
		      if(nums[i]!=6)
		      {
		        sum=sum+nums[i];
		        flag=0;
		      }
		      else if(nums[i]==6)
		      {														// 1, 6, 2, 2, 7, 1, 6, 99, 99, 7
		        for(j=i+1;j<nums.length;j++)
		        {
		          
		          if(nums[j]==7)
		          {flag++;
		          i=i+flag;
		          break;
		          }else
		          flag++;
		         }
		    }
		    
		    
		  }
		  return sum;
		}else 
		return 0;
 }
	
	
	
	public static void stringcheck(String str)
	{
		

		
		int len=str.length()-(str.length()-2);
		System.out.println(len);
		String s=str.substring(str.length()-2,str.length());
		System.out.println(s);

	}
}	

