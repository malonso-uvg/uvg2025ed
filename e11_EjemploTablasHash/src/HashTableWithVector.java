import java.util.ArrayList;
import java.util.Vector;

/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class HashTableWithVector<V> implements IHashTable<V>{

	private IHashFunction<V> myFunction;
	private Vector<ArrayList<V>> internalVector;
	private int size;
	private int count;
	
	public HashTableWithVector(IHashFunction<V> hashFunction, int size) {
		setHashFunction(hashFunction);
		this.size = size;
		this.count = 0;
		internalVector = new Vector<ArrayList<V>>(size);
		
		for (int i = 0; i < size; i++) {
			internalVector.add(new ArrayList<V>());
		}
	}
	
	@Override
	public void setHashFunction(IHashFunction<V> hashFunction) {
		myFunction = hashFunction;
	}

	@Override
	public void insert(V value) {
		int key = myFunction.getKey(value);
		internalVector.get(key).add(value);
		count++;
	}

	@Override
	public int find(V value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<V> get(int key) {
		return  internalVector.get(key);
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public int size() {
		return size;
	}

}
