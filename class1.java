package learnlab;
class calc
{
	int i,j,sum;
	public void add()
	{
		sum=i+j;
	}
}
public class class1 {
	public static void main(String args[])
	{
		calc obj =new calc();
		obj.i=2;
		obj.j=3;
		obj.add();
		System.out.print(obj.sum);
		
	}
}
