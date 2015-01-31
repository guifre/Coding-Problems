import java.io.IOException;
import java.util.StringTokenizer;

public class Q1 {

	public static void main(String[] argv) throws IOException {

		java.io.BufferedReader stdin = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));
		String line = null;
		line = stdin.readLine();
		while (!line.equals("")) {
			StringTokenizer st = new StringTokenizer(line);
			int res = 0;
			while (st.hasMoreTokens()) {
				res += Integer.parseInt(st.nextToken());
			}
			System.out.println(res + "\n");
			line = stdin.readLine();
		}
		System.out.println("Fin");
	}
}
