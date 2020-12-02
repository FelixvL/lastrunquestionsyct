
class Demo{    // YA
	public static void main(String [] args){
 		Dier dier = new Geit();
		dier.lopen();
	}
}
class Dier{
	void lopen() throws Exception{
		System.out.println("lopen in dier");
	}
}
class Geit extends Dier{
	void lopen(){ 
		System.out.println("lopen in geit");
	}
}