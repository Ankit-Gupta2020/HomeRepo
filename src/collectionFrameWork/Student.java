package collectionFrameWork;

public class Student implements Comparable<Student>{
	
	
	int rollNo;
	String name;
	int age;
	String mycourse;
	
	Student(int rollNo,String name,int age,String mycourse)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
		this.mycourse=mycourse;
		
	}

	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		return this.rollNo-st.rollNo();
	}

	private int rollNo() {
		// TODO Auto-generated method stub
		return 0;
	}



}
