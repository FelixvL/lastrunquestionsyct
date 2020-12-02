
class Demo{    // PA
	public static void main(String [] args){
		Plant p = new Plant();
		System.out.println(p.groeien());  
	}
}

class Plant{
	static int a = groeien();
	static int groeien(){
		System.out.println("groeien");
		return 6;
	}
}

