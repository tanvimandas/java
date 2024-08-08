package practice_programs;

public class callmethod {
	public static int paramters(int x,int y){
		int z= x+y;
		return z;
	}

	public static void main(String[] args) {
		int x= 123;
		int y= 143;
        int z= paramters(x,y);
        System.out.println("sum =" +z);
	}

}
