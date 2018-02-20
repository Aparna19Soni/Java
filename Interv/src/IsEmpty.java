class A{  
int i ;
public static void main(String args[]){  
System.out.println("Hello java");  

A a = new A();
a.m1(a.i);
}

private void m1(int z) {
	A b = new A();
	int i  ;
	System.out.println(b.i);
	
}  

static
{
	System.out.println("It is static block");
}
}  