package operator;

public class OperationEx3 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i+ 2) < 10);	//논리 곱에서 앞 항이 거짓이면 뒷 항이 실행되지 않는다
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);											//따라서 i의 값은 2
		
		value = ((num1 = num1 + 10) > 10) || ((i = i+2) < 10);			//논리 합에서 앞 항이 참이면 뒷 항이 실행되지 않는다 
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);											//따라서 i의 값은 2
	}
}
