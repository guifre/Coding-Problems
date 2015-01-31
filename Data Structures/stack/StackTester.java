public class StackTester {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("test1");
                s.push("test2");
                s.push("test3");
		s.pull();
		s.pull();
		s.pull();
		s.pull();
		for (int i = 0; i<1001; i++) {
			s.push("fullme");
		}	
	}
}
