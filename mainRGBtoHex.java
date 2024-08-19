
public class mainRGBtoHex {

	public static void main(String[] args) {
		int r=255;
		int g=1;
		int b=136;
		String hex = rgb(r,g,b);
		
		System.out.println(hex);

	}
	

	private static String rgb(int r, int g, int b) {
		
		r = rangeCheck(r);
		g = rangeCheck(g);
		b = rangeCheck(b);
		
		
		String rH = Integer.toHexString(r);
		String gH = Integer.toHexString(g);
		String bH = Integer.toHexString(b);
		
		rH = lengthChecker(rH);
		gH = lengthChecker(gH);
		bH = lengthChecker(bH);
		
		String result = rH+gH+bH;
		return result.toUpperCase();
	}


	private static String lengthChecker(String hex) {
		if (hex.length() == 1) {
			hex = "0"+hex;
		}
		return hex;
	}


	private static int rangeCheck(int num) {
		if (num < 0){
			num = 0;
		}
		if(num > 255) {
			num = 255;
		}
		return num;
		
	}
}
