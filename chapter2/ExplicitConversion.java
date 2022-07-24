package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		
		System.out.println(iNum3);	//두 실수가 각각 형 변환 되어 더해짐 ( 1 + 0 = 1 )
		System.out.println(iNum4);	//두 실수의 합이 먼저 계산되고 형 변환됨 ( 1 + 1 = 2 )
	}

}
