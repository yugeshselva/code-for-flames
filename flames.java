import java.io.*;
import java.util.*;
import java.lang.*;
public class flames
	{
	public static void main(String args[])
		{
		int i=0,l=0,m=0,j=0,r=0,q=0,count=0,flag=0,k;
		char c,d,e,f;
		String s3="flames";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.nextLine();
		System.out.println("enter second string");
		String s2=sc.nextLine();
		int a=s1.length();
		int b=s2.length();
		int h=s3.length();
		char arr1[]=new char[10];
		char arr2[]=new char[10];
		char arr3[]=new char[10];
		ArrayList<Character> arr4=new ArrayList<Character>();
		ArrayList<Character> arrl1=new ArrayList<Character>();
		for(i=0;i<a;i++)
			{
			c=s1.charAt(i);
			arr1[i]=c;	
			}
		for(i=0;i<b;i++)
			{
			d=s2.charAt(i);
			arr2[i]=d;
			}
		for(i=0;i<h;i++)
			{
			c=s3.charAt(i);
			arr3[i]=c;
			}
		for(i=0;i<a;i++)
			{
			for(j=0;j<b;j++)
				{
				if(arr1[i]==arr2[j])
					{
					arr1[i]='0';
					arr2[j]='0';
					break;
					}
				}
			}
		for(i=0;i<a;i++)
			{
			if(arr1[i]=='0')
				{
				l=l+1;
				}
			else
				{
				m=m+1;
				}
			}
		for(i=0;i<b;i++)
			{
			if(arr2[i]!='0')
				{
				m=m+1;
				}
			}
		System.out.println("the number of repeated characters is:"+l);
		System.out.println("the number of non-repeated characters is:"+m);
		l=6;
		ArrayList<Character> arrl=new ArrayList<Character>();
		for(i=0;i<l;i++)
			{
			arrl.add(arr3[i]);
			}
		while(true)
				{
				for(i=0;i<l;i++)
					{
					count=count+1;
					if(count==m)
						{
						flag=1;
						for(j=i+1;j<l;j++)
							{
							arrl1.add(arrl.get(j));
							}
						for(k=0;k<i;k++)
							{
							arrl1.add(arrl.get(k));
							}
						arrl.clear();
						l=l-1;
						for(k=0;k<l;k++)
							{
							arrl.add(arrl1.get(k));
							}
						arrl1.clear();
						break;			
						}
					}
				if(flag==1)
					{
					count=0;
					flag=0;
					if(arrl.size()==1)
						{
						System.out.println("The relationship between"+" "+s1+" "+"and"+" "+s2+" "+"is"+" "+arrl.get(0));
						break;
						}
					}
				
				}
			
					
		}

	}







