package shortestpathscitiesinmacedonia;

import java.util.ArrayList;

public interface GraphDataStructure<T> {
	public boolean hasAdjacentVertex(T firstVertex, T secondVertex);
	public ArrayList<T> listAdjacentVertecies(T vertex);
	public int vertexDegree(T vertex);
}
