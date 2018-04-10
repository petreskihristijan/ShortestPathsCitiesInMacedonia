package shortestpathscitiesinmacedonia;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList<T extends Numbered> implements GraphContainer<T> {
	/*
	 * Make Container tag interface and abstract class that implements all of these methods
	 * what changes is the representation of the container.
	 * The container can implement factory method to create the correct instance
	 */
	private Bag<T>[] container;
	
	public AdjacencyList(int elements) {
		container = new Bag[elements];
		for(int i = 0; i < elements; i++) {
			container[i] = new Bag<>();
		}
	}

	@Override
	public void add(T firstVertex, T secondVertex) {
		container[firstVertex.toInt()].add(secondVertex);
	}
	
	@Override
	public boolean hasAdjacentVertex(T firstVertex, T secondVertex) {
		for(T searchVertex : container[firstVertex.toInt()]) {
			if(searchVertex == secondVertex) 
				return true;
		}
		return false;
	}

	@Override
	public ArrayList<T> listAdjacentVertecies(T vertex) {
		ArrayList<T> listToReturn = new ArrayList<>();
		for(T adjacent : container[vertex.toInt()]) {
			listToReturn.add(adjacent);
		}
		return listToReturn;
	}

	@Override
	public int vertexDegree(T vertex) {
		return container[vertex.toInt()].size();
	}
}
