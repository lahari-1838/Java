package ABC;

class calculator {
	int calculate(int a,int b) {
		return a+b;
	}
	double calculate(double a,double b) {
		return a*b;
	}
	int calculate(int a,int b,int c) {
		return a*b*c;
	}

	public static void main(String[] args) {
		calculator c=new calculator();
		System.out.println(c.calculate(12,30));
		System.out.println(c.calculate(12.5, 13.5));
		System.out.println(c.calculate(2, 3,4));

	}

}
