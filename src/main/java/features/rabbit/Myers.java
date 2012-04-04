package features.rabbit;

public class Myers implements features.Myers {

	@Override
	public String getName(int x, int y, int z) {
		if(x <= 0 || y <= 0 || z <= 0) throw new RuntimeException("0以下の値が入力されました");
		if(x + y <= z || y + z <= x || x + z <= y) throw new RuntimeException("2辺の合計値が1辺と同じ値です");
		if(x == y && y == z) return "正三角形";
		if(x == y || y == z || z == x) return "二等辺三角形";
		return "不等辺三角形";
	}

}
