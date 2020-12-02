
class Demo{    // PB
	public static void main(String [] args){
		Plant p = new Plant();
		Plant p2 = new Plant();
		System.out.println(p.groeien());  
	}
}

class Plant{
	static int a = groeien();
	static int groeien(){
		System.out.println("groeien");
		return 6;
	}
	int b = groeienb();
	int groeienb(){
		System.out.println("krimpen");
		return 9;
	}
}

