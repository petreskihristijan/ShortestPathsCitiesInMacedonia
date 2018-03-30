package shortestpathscitiesinmacedonia;

import java.util.List;

public class AdjacencyList<T> implements GraphContainer<T>, GraphDataStructure<T> {
	private Bag<T>[] container;
	
	public AdjacencyList(int elements) {
		container = new Bag[elements];
		for(int i = 0; i < elements; i++) {
			container[i] = new Bag<>();
		}
	}

	@Override
	public void add(T vertex) {
		
	}

	@Override
	public boolean hasAdjacentVertex(T vertex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<T> listAdjacentVertecies(T vertex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int vertexDegree(T vertex) {
		// TODO Auto-generated method stub
		return 0;
	}

}
