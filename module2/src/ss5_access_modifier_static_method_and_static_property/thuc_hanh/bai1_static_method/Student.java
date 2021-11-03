package ss5_access_modifier_static_method_and_static_property.thuc_hanh.bai1_static_method;

public class Student {
	private int rollno;
	private String name;
	private static String college = "BBDIT";
	
	Student(int r, String n){
		rollno = r;
		name = n;
	}
	
	static void change() {
		college = "CodeGym";
	}
	
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

}
