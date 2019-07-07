class Main {
	
	public static void main(String[] args) {
		
		SLLNode<Integer> n0 = new SLLNode<Integer>();
		SLLNode<Integer> n1 = new SLLNode<Integer>(1, n0);
		SLLNode<Integer> n2 = new SLLNode<Integer>(2, n0);
		
		System.out.println("N2 data " + n2.data + " and N1 data " 
		+ n2.next.data);
	}
}