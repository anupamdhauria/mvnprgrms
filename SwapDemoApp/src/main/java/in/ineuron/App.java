package in.ineuron;

public class App 
{
    int a ,b;
    public void accept(int x,int y){
        a=x;
        b=y;
    }
    public void swap(){
        int temp=a;
        a=b;
        b=temp;
    }
    public void disp(){
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    public static void main( String[] args )
    {
        if(args.length!=2)
            System.out.println("Please enter valid 2 numbers");
        else{
            
            int x=Integer.parseInt(args[0]);
            int y=Integer.parseInt(args[1]);
            App app=new App();
            app.accept(x, y);
            System.out.println("Before Swapping\n================================");
            app.disp();
            app.swap();
            System.out.println("After Swapping\n================================");
            app.disp();

        }
    }
}
