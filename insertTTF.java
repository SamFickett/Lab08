
public class insertTTF extends TwoThreeFourTree{

	@Override
	/*
	 * Creater: Samuel Fickett
	 */
	public void insert(Comparable data) {
		/*
		 * If node is null, adds new node
		 */
		Node localRoot = root;
		if (localRoot == null) {
			root = new Node((int) data);
			root.size++;
		}
		else {
			while(true) {
				/*
				 * If node is a 4-Node, split
				 */
				if (localRoot.data.length > 3) {
					split();
				}
				/*
			 	* Working our way down the rest of the 2-3-4 tree
			 	*/
				for (int i = 0; i < localRoot.size; ++i) {
					if (data.compareTo(localRoot.data[i]) < 0) {
						++i;
						continue;
					}
					else if (data.compareTo(localRoot.data[i]) == 0){
						return;
					}
					else {
						if (localRoot.children[i].data.length > 3) {
							localRoot = localRoot.children[i];
						}
						else {
							localRoot.children[i + 1] = new Node((int) data);
						}
					}
				}
			}
		}
	}
	//split a 4 node
	public void split(Node<Integer> currentNode) {
	Integer m = currentNode.data[1]; //get middle
	Node<Integer> l = new Node<Integer>(1); //get left
	l.data[1] = currentNode.data[0]; //set left
	Node<Integer> r = new Node<Integer>(1); //get right
	r.data[1] = currentNode.data[2]; //set left
		if(currentNode != root) {
			// add m to currentNode.parent.data
		}
		else {
			Node<Integer> newRoot = new Node<Integer>(2);
			newRoot.children = l;
		}
	}

	@Override
	public boolean contains(Comparable data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Comparable[] getSorted() {
		// TODO Auto-generated method stub
		return null;
	}

}
