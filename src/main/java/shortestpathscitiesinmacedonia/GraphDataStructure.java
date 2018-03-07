package shortestpathscitiesinmacedonia;

import java.util.List;

public interface GraphDataStructure<T> {
	public void addVertex(T vertex);
	public boolean hasAdjacentVertex(T vertex);
	public List<T> listAdjacentVertecies(T vertex);
	public int vertexDegree(T vertex);
}
