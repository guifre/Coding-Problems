import java.util.Random;

/**
 * This class is aimed at testing the Graph class
 * and their instancied classes
 * @author guifre
 * 
 */
public class Test {

	/**
	 * Main method of the class, runs the whole thing
	 * @param args
	 */
	public static void main(String[] args) {

		Graph g = new Graph();
		//testing method
		g = addSomeStuff(g);
	}

	/**
	 * 
	 * @param g graph to be tested
	 * @return the graph with vertexes and edges
	 */
	public static Graph addSomeStuff(Graph g) {
		Random rand = new Random();
		for (int i = 0; i < 20; i++) {
			g.addVertex("test" + i);
			// we add a random # of edges to the current vertex
			for (int j = 0; j < rand.nextInt(i - 0 + 1) + 0; j++) {
				//rand num between 0 and i
				int edge = rand.nextInt(i - 0 + 1) + 0;
				g.addEdge(i, edge);
				System.out.println("Connected [" + i + "] with [" + edge+"]");
			}

		}

		System.out.println("\n\nDepth first search:");
		g.dfs();
		System.out.println("\n\nBreadth first search:");
		g.bfs();

		return g;
	}

}
