
public class Method {

	public static void main(String[] args) {
		String str = "Ravi";
		int lenght=str.length();
		System.out.println(lenght);
        System.out.println("letter of the index position 3:-"+str.charAt(3));
        System.out.println("index position of letter:- "+str.indexOf('v'));
        System.out.println("contains method:- "+str.contains("avi"));
        System.out.println("contain method:-"+str.contains("xy"));
        System.out.println("Lower case:-"+str.toLowerCase());
        System.out.println("Upper case:-"+str.toUpperCase());
        System.out.println("Substring method:-"+str.substring(2,4));
        System.out.println("replace method:-"+str.replace('i', 'a'));

	}

}
