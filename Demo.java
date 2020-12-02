
class Demo{    // YZ
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
	void lopen() throws Exception{ 
		System.out.println("lopen in geit");
	}
}
// 4 regels van overriding
// returntype covariant
// zelfde signature
// access modifier niet vernauwen -(hetzelfde of wijder)
// throws clausule covariant OF NIETS (checked exceptions) 