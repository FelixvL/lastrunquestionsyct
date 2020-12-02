
class Demo{    // SD
	public static void main(String [] args){
		Dier dier = new Geit();
		dier.lopen()
	}
}

class Dier{
	void lopen(){
		System.out.println("dier loopt");
	}
}

class Geit extends Dier{
	void lopen(int a){
		System.out.println("geit loopt");
	}
}
