
class Demo{    // YA
	public static void main(String [] args) throws{
 		Dier dier = new Geit();
try
		dier.lopen();  // afhandelen || throwsen
	}
}
class Dier{
	void lopen() throws Exception{   // declare
		System.out.println("lopen in dier");
	}
}
class Geit extends Dier{
	void lopen(){ 
		System.out.println("lopen in geit");
	}
}

// inheritance - 4 regels van override
// Exception regel
	// exception throws mag ook 'gelogen' zijn
	// checked exception - try catch OF throwsen || afhandelen of doorwerpen