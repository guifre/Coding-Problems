/**
 * Generic Graph Class for fun
 * @author guifre
 */

public class Graph {

	private final int MAX_VERTS = 200;
	private Vertex vertexList[];
	private int adjMat[][];
	private int nVerts;
	private Stack stack;
	private Queue queue;

	/**
	 * Constructor of the method, initializes
	 * the attributes of the class
	 */
	public Graph() {
		stack = new Stack();
		queue = new Queue();
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for (int i = 0; i < MAX_VERTS; i++) {
			for (int j = 0; j < MAX_VERTS; j++) {
				adjMat[i][j] = 0;
			}
		}
	}

	/**
	 * @param l	the label to add in the vertex
	 */
	public void addVertex(String l) {
		vertexList[nVerts] = new Vertex(l);
		nVerts++;
	}

	/**
	 * Adds and edge between two vertexs
	 * @param node1 first vertex to connect
	 * @param node2 second vertex to connect
	 */
	public void addEdge(int node1, int node2) {
		adjMat[node1][node2] = 1;
		adjMat[node2][node1] = 1;

	}

	/**
	 * Displays the label of the vertex v
	 * @param v the vertex to be displayed
	 */
	public void displayVertex(int v) {
		System.out.println(vertexList[v].label);
	}

	/**
	 * returns the next unvisited vertex
	 * @param v the vertex to look for neighbors
	 * @return the next unvisited neighbor in the adjacency matrix
	 */
	public int getAdjUnivisitedVertex(int v) {
		for (int i = 0; i < nVerts; i++) {
			if (adjMat[v][i] == 1 && vertexList[i].visited == false) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * depth-first search (DFS) implementation
	 */
	public void dfs() {
		vertexList[0].visited = true;
		displayVertex(0);
		stack.push(0);
		while(!stack.isEmpty()) {
			int v = this.getAdjUnivisitedVertex(stack.peek());
			if (v == -1) {
				stack.pop();
			} else {
				vertexList[v].visited = true;
				displayVertex(v);
				stack.push(v);
			}
		}
		for (int i = 0; i < nVerts; i++) {
			vertexList[i].visited = false;
		}
	}
	/**
	 * breadth-first search (BFS) implementation
	 */
	public void bfs() {
		vertexList[0].visited = true;
		displayVertex(0);
		queue.add(0);
		while(!queue.isEmpty()) {
			int x = queue.remove();
			int i =  getAdjUnivisitedVertex(x);
			while(i != -1) {
				displayVertex(i);
				vertexList[i].visited = true;
				queue.add(i);
				i =  getAdjUnivisitedVertex(x);
			}	
		}
		for (int i = 0; i < nVerts; i++) {
			vertexList[i].visited = false;
		}
	}

}
