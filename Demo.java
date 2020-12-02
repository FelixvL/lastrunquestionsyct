
class Demo{    // YY
	public static void main(String [] args){
 		Dier dier = new Geit();
		dier.lopen();
	}
}

class Dier{
	void lopen(){
		System.out.println("lopen in dier");
	}
}

class Geit extends Dier{
	void lopen(int a) throws Exception{ 
		System.out.println("lopen in geit");
	}
}
