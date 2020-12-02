
class Demo{    // GV
	public static void main(String [] args){
		AAA b = new BBB();
		System.out.println(b.ddd().ddd().getal); 
	}
}
class AAA{  
	int getal = 14;
	AAA ddd(){
		System.out.println("aaa");
		return new AAA();
	}
}
class CCC extends AAA{  
	int getal = 15;

}
class BBB extends CCC{ 
	int getal = 16;
	CCC ddd(){
		System.out.println("ccc");
		return new BBB();
	} 
}

