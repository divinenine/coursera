class SLLNode<E> {
    SLLNode<E> next;
    E data;
	
	public SLLNode() {
		this.next = null;
		this.data = null;
	}

    public SLLNode(E theData) {
        data = theData;
    }
	
	public SLLNode (E theData, SLLNode<E> prevNode) {
		this(theData);
		this.next = prevNode.next;
		prevNode.next = this;
	}
	
	

}

