package collections.stringBuilder;

public class TestMyStringBuilder {

	public static void main(String[] args) {
		//Test original StringBuilder from collections framework
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("World!");
		System.out.println(sb.toString());
		
		//Test MyStringBuilder from local.
		MyStringBuilder msb = new MyStringBuilder("Hello ");
		msb.append("World!");
		System.out.println(msb.toString());
		msb.append(msb);
		System.out.println(msb.toString());
		msb.append(msb);
		System.out.println(msb.toString());
	}

}
