// String Handling with Exception 

import java.util.* ;

class DCE extends Exception //Duplicate Contact Exception
{
	String name ;
	int phno ;
	
	DCE(String msg , String name , int phno)
	{
		super(msg) ;
		this.name = name ;
		this.phno = phno ;
	}
	
	public String toString()
	{
		return "Duplicated Object value"+this.getMessage()+"\n"+name+"\n"+phno+"\n" ;
	}
}

class Contact // Contact Management
{
	String name ;
	int phno ;

	Contact(String name , int phno)
	{
		this.name = name ;
		this.phno = phno ;
	}
}

class CM //ContactManageMent main
{
	public static void main(String[] args)
	{
		ArrayList<Contact> cm = new ArrayList<Contact>() ;
		Scanner s = new Scanner(System.in) ;
		Contact a = new Contact("Raj",8778) ;
		cm.add(a) ;
		Contact b = new Contact("Ji",7887) ;
		cm.add(b) ;
		Contact c[] = new Contact[5] ;
		
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println("Enter the name : ");
			String x = s.next();
			System.out.println("Enter the phno(4-digit) :") ;
			int y = s.nextInt();
			c[i] = new Contact(x,y) ;

			try
			{
				for(Contact e:cm)
				{
					if(c[i].name.equals(e.name) && c[i].phno ==e.phno)
					{
						throw new DCE("EXC",c[i].name , c[i].phno) ;
					}
				}
				cm.add(c[i]);
				System.out.println("Object Added to Arraylist\n");
			}
			catch(Exception e) 
			{
				System.out.println("Caught : "+e);
			}
		}
		System.out.println("ArrayList of Contact Objects : ");
		for(Contact f:cm)
		{
			System.out.println("Name : "+f.name +"\tPhno : "+f.phno);	
		}
		
		System.out.println("Enter the name to Search : ");
		String ss = s.next();

		for(Contact f:cm)
		{
			if(ss.equals(f.name))
				System.out.println("Found!!\n" + "Name : "+f.name +"\tPhno : "+f.phno);	
		}
	}
}			



