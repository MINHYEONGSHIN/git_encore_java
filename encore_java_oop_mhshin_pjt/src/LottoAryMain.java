import com.encore.ary.lotto.ExerciseLotto;

public class LottoAryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExerciseLotto lotto = new ExerciseLotto();
		
		// Mission 01.
		int [] ary = lotto.generateLottoNumbers();
//		for( int idx = 0 ; idx < ary.length ; idx++) {
//			System.out.println(ary[idx]+" ");
//		}
		
		lotto.displayLottoNumbers(ary);
		
	}

}
