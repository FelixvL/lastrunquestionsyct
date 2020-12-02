
class Demo{    // GW
	public static void main(String [] args){
		AAA b = new BBB();
		b.ddd().ddd(); 
	}
}

class AAA{  
	AAA ddd(){
		System.out.println("aaa");
	}
}

class CCC extends AAA{  

}

class BBB extends CCC{ 
	CCC ddd(){
		System.out.println("ccc");
		return new BBB();
	} 
}

