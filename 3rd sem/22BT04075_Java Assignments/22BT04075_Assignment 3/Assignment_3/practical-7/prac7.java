class vowel extends Exception 
{
	String msg = "cxdf";
	vowel(String msg)
	{
		super(msg);
	}
}
class checkString
{
	void check(String str) throws vowel
	{
                
		boolean f = false;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				f=true;
				break;
			}
		}
		if(f)
                System.out.println("it is not exception");
		else
		throw new vowel("it is an exception");
	}
}
class testmet
{
public static void main(String args[])
{       try{
	checkString c = new checkString();
	c.check("c");
	}
        catch (vowel e)
       {
         System.out.println("invalid" +e);
}
        

        }
       

}


