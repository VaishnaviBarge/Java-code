package commandline;

public class TestCommandLine {

	public static void main(String[] args) {
		int s1=Integer.parseInt(args[0]); 
        int s2 = Integer.parseInt(args[1]);

//		int s1=2;
//		int s2=3;
		int sum=s1+s2;
		System.out.println("Addition is :"+ sum);

	}

}
