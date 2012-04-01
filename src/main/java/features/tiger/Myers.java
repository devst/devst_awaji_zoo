package features.tiger;

public class Myers implements features.Myers {

	@Override
	public String getName(int sideA, int sideB, int base) {
		if(this.isExceptionValues(sideA, sideB, base)) {
			throw new RuntimeException();
		}
		
		if(this.isEquilateralTriangle(sideA, sideB, base)) {
			return "正三角形";
		}
		
		if(this.isIsosceles(sideA, sideB, base)) {
			return "二等辺三角形";
		}
		
	return "不等辺三角形";
	}
	
	private boolean isEquilateralTriangle(int sideA, int sideB, int base) {
		return (sideA == sideB && sideB == base && base == sideA);
	}
	
	private boolean isIsosceles(int sideA, int sideB, int base) {
		boolean isoceles = false;
		if((sideA == sideB) && (sideA != base)){
			isoceles = true;
		}
		if((sideA == base) && (sideA != sideB)){
			isoceles = true;
		}
		if((sideB == base) && (sideA != sideB)){
			isoceles = true;
		}
		return isoceles;
	}
	
	private boolean isExceptionValues(int sideA, int sideB, int base) {
		boolean tooShort = false;
		if(sideA+sideB <= base) {
			tooShort = true;
		}
		if(sideA+base <= sideB){
			tooShort = true;
		}
		if(sideB+base <= sideA){
			tooShort = true;
		}
		return tooShort;
	}
	
}
