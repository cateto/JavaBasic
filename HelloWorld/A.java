// Package com.basic
class A
{
	A(){
	}
	void m(){
		System.out.println("학교에 간다.");
	}
	String name = "영희";
	int age = 22;

	public static void main(String[] args) 
	{
		A obj = new A();
		System.out.print(obj.name+"는"+" "+obj.age+"살이다."+" "+obj.name+"는"+ " ");
		obj.m();
		
	}
}
