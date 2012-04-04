package features.rabbit;

public class Tsurukamezan implements features.Tsurukamezan {

	@Override
	public String tsurukame(int i, int j) {
		
		if(i * 2 >= j) throw new RuntimeException("個体数の２倍が足の数よりも多いです");
		if(j % 2 != 0) throw new RuntimeException("足の本数が２の倍数ではありません");
		
		int tsuru = calcTsuruNum(i, j);
		int kame = calcKameNum(i, j);
		return "鶴" + String.valueOf(tsuru) + "羽、亀" + String.valueOf(kame) + "匹";
	}

	public int calcKameNum(int i, int j) {
		return j / 2 - i;
	}

	public int calcTsuruNum(int i, int j) {
		return (4 *  i - j) / 2;
	}

}
