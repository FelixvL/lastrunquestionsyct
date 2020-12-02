
class Demo{    // TT
	public static void main(String [] args){
 		Geit dier = new Geit();
		dier.rrr();  
	}
}
interface RRR{
	default void rrr(){
		System.out.println("rrr");
	}
}
class Geit implements RRR{
	void lopen(){ 
		System.out.println("lopen in geit");
	}
}


