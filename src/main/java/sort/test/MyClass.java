package sort.test;

public class MyClass implements Comparable<MyClass> {

	private Integer firstInteger;
	private Integer secondInteger;
	
	public MyClass(Integer firstInteger, Integer secondInteger) {
		super();
		this.firstInteger = firstInteger;
		this.secondInteger = secondInteger;
	}
	
	public Integer getFirstInteger() {
		return firstInteger;
	}

	public Integer getSecondInteger() {
		return secondInteger;
	}
	
	@Override
	public int compareTo(MyClass o) {
		return this.firstInteger.compareTo(o.firstInteger);
	}
	
	@Override
	public String toString() {
		return "firstInteger=" + firstInteger + ", secondInteger=" + secondInteger;
	}

}
