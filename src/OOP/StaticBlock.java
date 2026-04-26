package OOP;

public class StaticBlock {
	static int a =10;
	static int b;
	
	static {
		System.out.println("hello how are you");
		b=a+10;
	}

	public static void main(String[] args) {
		StaticBlock obj = new StaticBlock();
		System.out.println(obj.a+" "+ obj.b);
		
	
		
		StaticBlock obj2 = new StaticBlock();
	
		System.out.println(obj2.a+" "+ obj2.b);
		StaticBlock.b += 3;
		

	}

}
