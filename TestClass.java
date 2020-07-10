package testjes;

class TestClass{
	public static void main(String[]args) {
	
		new B();
	}
}
	
	class A {
		static {
			System.out.println("A static initializer block");
		}
		static void methodOfA() {
			System.out.println("A static method");
		}
		{
			System.out.println("A non-static initializer block");
		}
		public A() {
			System.out.println("A constructor");
		}
	}

	class B extends A {
		static {
			System.out.println("B static initializer block");
		}
		static void methodOfB() {
			System.out.println("B static method");
		}
		{
			System.out.println("B non-static initializer block");
		}
		public B() {
			System.out.println("B constructor");
		}
	}




		   
	   
	