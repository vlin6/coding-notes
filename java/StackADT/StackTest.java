public class StackTest {
	public static void main(String[] args) {
		System.out.println("StackTest running...");
		Stack<String> stack = new Stack<String>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.printAll();
		System.out.println(stack.pop());
	}
}