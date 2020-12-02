
class Demo{    // GR
	public static void main(String [] args){
		AAA b = new BBB();
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

