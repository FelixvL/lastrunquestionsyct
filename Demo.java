
class Demo{    // RD
	public static void main(String [] args){
		Dier dier = new Dier();
		dier.abc = 24;
		Dier dier2 = new Dier();
		dier2.lopen();
	}
}

class Dier{
	static int abc = 34;
	static void lopen(){
		System.out.println(abc);
	}
}
