package codes;

//Defining the 8 moves a knight can make, getters/setters for these moves
//Also initializes each node on the board to be 0 to indicate a knight hasn't traveled there yet

public class Node {
	
	private int data;
	private Node up;
	private Node down;
	private Node left;
	private Node right;
	private Node move1;
	private Node move2;
	private Node move3;
	private Node move4;
	private Node move5;
	private Node move6;
	private Node move7;
	private Node move8;
	
	public Node getmove1(){
		return move1;
	}
	
	public void setmove1(Node move1){
		this.move1 = move1;
	}
	
	public Node getmove2(){
		return move2;
	}
	
	public void setmove2(Node move2){
		this.move2 = move2;
	}
	
	public Node getmove3(){
		return move3;
	}
	
	public void setmove3(Node move3){
		this.move3 = move3;
	}
	
	public Node getmove4(){
		return move4;
	}
	
	public void setmove4(Node move4){
		this.move4 = move4;
	}
	
	public Node getmove5(){
		return move5;
	}
	
	public void setmove5(Node move5){
		this.move5 = move5;
	}
	
	public Node getmove6(){
		return move6;
	}
	
	public void setmove6(Node move6){
		this.move6 = move6;
	}
	
	public Node getmove7(){
		return move7;
	}
	
	public void setmove7(Node move7){
		this.move7 = move7;
	}
	
	public Node getmove8(){
		return move8;
	}
	
	public void setmove8(Node move8){
		this.move8 = move8;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Node getUp(){
		return up;
	}
	
	public void setUp(Node up){
		this.up = up;
	}
	
	public Node getDown(){
		return down;
	}
	
	public void setDown(Node down){
		this.down = down;
	}
	
	public Node getLeft(){
		return left;
	}
	
	public void setLeft(Node left){
		this.left = left;
	}
	
	public Node getRight(){
		return right;
	}
	
	public void setRight(Node right){
		this.right = right;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Node(){
		data = 0;
	}
	
	public int getData(){
		return data;
	}
	
	public void setData(int data){
		this.data = data;
	}

}