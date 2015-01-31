/**
 * This class defines the vertexes
 * used by the Graph Class
 * @author guifre
 *
 */
public class Vertex {
	public String label;
	public boolean visited;
	
	/**
	 * Constructor of the class
	 * @param l data to add in the vertex
	 */
	public Vertex(String l) {
		label = l;
		visited = false;
		
	}
}
