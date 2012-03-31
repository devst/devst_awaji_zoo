package features.bird;

public class Myers implements features.Myers {

	@Override
	public String getName(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		if (!isValidTriangle(arg0, arg1, arg2)) {
			throw new RuntimeException();
		}
		if ((arg0 == arg1) && (arg1 == arg2)) {
			return "正三角形";
		}
		if (arg0 == arg1) {
			return "二等辺三角形";
		}
		if (arg1 == arg2) {
			return "二等辺三角形";
		}
		if (arg0 == arg2) {
			return "二等辺三角形";
		}
		return "不等辺三角形";
	}

	private boolean isValidTriangle(int arg0, int arg1, int arg2) {
		if (arg0 <= 0) {
			return false;
		}
		if (arg1 <= 0) {
			return false;
		}
		if (arg2 <= 0) {
			return false;
		}
		
		if ((arg0 + arg1) <= arg2) {
			return false;
		}
		
		if ((arg1 + arg2) <= arg0) {
			return false;
		}
		
		if ((arg0 + arg2) <= arg1) {
			return false;
		}

		return true;
	}
}
