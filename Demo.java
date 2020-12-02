
class Demo{    // GW
	public static void main(String [] args){
		Kaas kaas = new Kaas();
		System.out.println(kaas.inoemen().prijs); 
	}
}
class Kaas{
	Ingredient inoemen(){
		return new Melk();
	}
}
class Ingredient{
	int prijs = 34;
	void checkit(){
		System.out.println("go");
	}
}

class Melk extends Ingredient{
	int prijs = 35;
	void checkit(){
		System.out.println("flo");
	}
}
