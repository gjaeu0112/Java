package operator;

public class OperationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gameScore = 150;			//게임에서 획득한 저수는 150점
		
		int lastScore1 = ++gameScore;	//gameScore에 1만큼 더한 값을 lastScore1에 대입.
		System.out.println(lastScore1);	//151
		
		int lastScore2 = --gameScore;	//gameScore에 1만큼 뺀 값을 lastScore2에 대입.
		System.out.println(lastScore2);	//150
	}

}
