/** 构造函数和构造代码块
 * https://blog.csdn.net/qq_33642117/article/details/51909346
*/
  



public class Perosn{
	private int id;
	
	private String name;
	
	private int age;

	{
		cry();  //每个人出生都会cry
	}

	public Perosn(){
		cry();
	}
	public Perosn(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void cry(){
		System.out.println("WaWaWa....");
    }
    

    public static void main(String[] args){

        Perosn  john = new Perosn(1,"John",40);

        System.out.println("hello,Person...."+ john.getName());

    }

	
}
