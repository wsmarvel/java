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
		System.out.println("年龄是 "+ myAge);
		return myAge;
	}

public static void main(String args[]) {
	Bai bai = new Bai("bai");
	 /* 创建对象 */
	bai.setAge(2);
	/* 通过方法来设定age */
	bai.getAge();
	/* 调用另一个方法获取age */
	System.out.println("成员变量为"+ bai.myAge);
	/*也可以像上面这样访问成员变量 */
}

}