class Test1091618 {
	public static void main(String[] args) {
		String[] students = new String[10];
		String studentName = "Peter Smith";
		students[0] = studentName;
		studentName = null;
		System.out.println(studentName);
		System.out.println(students[0]);
	}

}