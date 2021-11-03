package ss5_access_modifier_static_method_and_static_property.thuc_hanh.bai1_static_method;

public class TestStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(111, "Hoang");
		Student s2 = new Student(222, "Hung");
		Student s3 = new Student(333, "Khanh");
		s1.display();
		s2.display();
		
		Student.change();
		s3.display();

	}

}
