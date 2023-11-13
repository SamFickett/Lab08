
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

	private void split() {
		// TODO Auto-generated method stub
		
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
