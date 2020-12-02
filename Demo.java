
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


// wat doet static?    
// ENORM classe NIET bij object MAAR Object WEL bij classe
// ENORM er is maar ruimte voor EEN waarde
// scope