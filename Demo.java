
class Demo{    // SG
	public static void main(String [] args){
		Dier dier = new Geit();
		dier.lopen(8);
	}
}

class Dier{
	void lopen(){
		System.out.println("dier loopt");
	}
}

class Geit extends Dier{
	void lopen(int a){ // zitten
		System.out.println("geit loopt");
	}
}
// links bepaalt waar je bij kunt 
// Overload TOTAAL ANDERE METHODE