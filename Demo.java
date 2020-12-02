
class Demo{    // TS
	public static void main(String [] args){
 		Geit dier = new Geit();
		dier.lopen();  
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
	public void rrr(){
		System.out.println("nu doe ik het");
	}
}


