package num1;

public class Bai {
	int myAge;
	public Bai(String name) {
		System.out.println("my name is " + name);
		
	}

	public void setAge(int age) {
		myAge = age;
	}

	public int getAge(){
		System.out.println("������ "+ myAge);
		return myAge;
	}

public static void main(String args[]) {
	Bai bai = new Bai("bai");
	
	bai.setAge(2);
	
	bai.getAge();
	
	System.out.println("��Ա����Ϊ"+ bai.myAge);
}

}