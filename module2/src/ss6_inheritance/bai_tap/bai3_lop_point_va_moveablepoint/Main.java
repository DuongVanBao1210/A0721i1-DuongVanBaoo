package ss6_inheritance.bai_tap.bai3_lop_point_va_moveablepoint;

public class Main {

	public static void main(String[] args) {
		Point point = new Point(1,2);
		System.out.println(point);
		
        MoveablePoint moveablePoint=new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());

	}

}
