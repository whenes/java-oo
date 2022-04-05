
public class PersonEncap implements IPerson {
	private String name;
	private Integer age;
	
	public PersonEncap() {
		
	}
	
	public PersonEncap(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String walk(String msg) {
		return msg;
	}
	
	public String walk(String msg, Integer number) {
		return msg + " - " + number;
	}

	@Override
	public String walk() {
		return "Walk without param";
	}

	@Override
	public void method1() {
		System.out.println("Method1 has executed");
	}
}