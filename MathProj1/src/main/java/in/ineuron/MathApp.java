package in.ineuron;

public class MathApp 
{
	public int add(int x,int y){
		return x+y;
	}
    public static void main( String[] args )
    {
       MathApp mathProj=new MathApp();
	   int result=mathProj.add(10,30);
	   System.out.println("The sum is:"+result);
    }
}
