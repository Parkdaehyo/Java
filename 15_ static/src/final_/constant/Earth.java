package final_.constant;

public class Earth {
	
	public static final double EARTH_RADIUS=6400;
	public static final double EARTH_SURFACE_AREA;
	
	//정적 초기화
	static {
		EARTH_SURFACE_AREA
		=4*EARTH_RADIUS*EARTH_RADIUS*Math.PI;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("지구의 반지름: "
				+ Earth.EARTH_RADIUS+"km");
		System.out.println("지구의 표면적: "
				+ Earth.EARTH_SURFACE_AREA+"km^2");
		//근본적인 문제가 해결되야한다....
	}

}
