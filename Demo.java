
class Demo{    // TI
	public static void main(String [] args){
 		Geit dier = new Geit();
		dier.lopen();  
	}
}
interface RRR{
	void rrr();
}
class Geit implements RRR{
	void lopen(){ 
		System.out.println("lopen in geit");
	}
}

// interface
	// impliciet public abstract -methoden
	// fields zijn impliciet public static final
