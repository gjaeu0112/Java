package chapter2;

public class ImplicitConversion {
	
//	묵시적 형 변환에 대한 코드
//	묵시적 형 변환 이란, 바이트 크기가 작은 자료형에서 큰 자료형으로, 덜 정밀한 자료형에서 더 정밀한 자료형으로는 형 변환이 자동적으로 이뤄진다는 것이다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bNum = 10;
		int iNum = bNum;			//byte 형 값이 int 형 변수로 변환 됨.
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;			//int 형 값이 float 형 변수로 변환 됨.
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
	}

}
