
class Demo{    // GT
	public static void main(String [] args){
		CCC b = new CCC();
		b.ddd(); 
	}
}

class AAA{  
	void ddd(){
		System.out.println("aaa");
	}
}

class CCC extends AAA{  

}

class BBB extends CCC{ 
	void ddd(){
		System.out.println("ccc");
	} 
}

