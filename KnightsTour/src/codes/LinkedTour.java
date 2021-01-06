//Not sure how else this could be solved
//Done by defining the 8 moves with .setmoveX (up, up, right) or whatever set of moves
//As of right now, this program will try to find every solution, one at a time
//Should be the same as a program only working to find one solution; if you only want one, just terminate the program after one is found

package codes;

import java.util.Scanner;

public class LinkedTour {
	
	private Node first;
	private Node left;
	private Node right;

	private int number = 1;
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void knightsTour(){
		
		Path(first, 1);
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void display(){
	
	Node temp = first;
	Node rowMarker = first;
	
	while(temp != null){
	
		while(temp != null){
			System.out.print(temp.getData()+ "\t");
			temp = temp.getRight();
		}
		
		System.out.println("");
		temp = rowMarker.getDown();
		rowMarker = temp;
		
		}
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public LinkedTour (int dimension){
		
		//Creating a basic linked grid (chessboard)
		//5x5 for the purposes of testing
		
		first= new Node();
				
		Node rowMarker=first;
		Node columnMarker=first;
		
		for(int x = 0; x < dimension - 1; x++){
			
			Node temp= new Node();
			columnMarker.setRight(temp);
			temp.setLeft(columnMarker);
			columnMarker = temp;
		}
		
		for(int y = 0; y < dimension - 1; y++){
			
			Node temp = new Node();
			temp.setUp(rowMarker);
			rowMarker.setDown(temp);
			columnMarker = temp;
			
			for(int x=0; x<dimension-1; x++){
				
				temp=new Node();
				temp.setLeft(columnMarker);
				columnMarker.setRight(temp);
				temp.setUp(columnMarker.getUp().getRight());
				temp.getUp().setDown(temp);
				columnMarker = temp;
			}
			
			rowMarker = rowMarker.getDown();
			
		}
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		rowMarker = first;
		columnMarker = first;
		Node temp = first;
		
		
		
		for(int y = 0; y < dimension; y++){
			
			temp = rowMarker;
			
			for(int x = 0; x < dimension; x++){
				
				Node location = temp;
				
				//Move 1 (-1, +2) and Move 2 (+1, +2)
				if(location.getUp() != null) {
					
					if(location.getUp().getUp() != null){
						
						//Move 1
						if(location.getUp().getUp().getLeft() != null)
							location.setmove1(location.getUp().getUp().getLeft());
						
						//Move 2
						if(location.getUp().getUp().getRight() != null)
							location.setmove2(location.getUp().getUp().getRight());
					}
				}
				
				//Move 3 (+2, +1) and Move 4 (+2, -1)
				if(location.getRight()!=null) {
					
					if(location.getRight().getRight()!=null){
						
						if(location.getRight().getRight().getUp()!=null)
							location.setmove3(location.getRight().getRight().getUp());
						if(location.getRight().getRight().getDown()!=null)
							location.setmove4(location.getRight().getRight().getDown());
					}
				}
				
				//Move 5 (+1, -2) and Move 6 (-1, -2)
				if(location.getDown()!=null) {
					
					if(location.getDown().getDown()!=null){
						
						if(location.getDown().getDown().getRight()!=null)
							location.setmove5(location.getDown().getDown().getRight());
						
						if(location.getDown().getDown().getLeft()!=null)
							location.setmove6(location.getDown().getDown().getLeft());
					}
				}
				
				//Move 7 (-2, -1) and Move 8 (-2, +1)
				if(location.getLeft()!=null)	{
					
					if(location.getLeft().getLeft()!=null){
						
						if(location.getLeft().getLeft().getRight()!=null)
							location.setmove7(location.getLeft().getLeft().getDown());
						
						if(location.getLeft().getLeft().getLeft()!=null)
							location.setmove8(location.getLeft().getLeft().getUp());
					}
				}
				
				temp=temp.getRight();
			}
			
			rowMarker=rowMarker.getDown();
		}
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void Path(Node Node, int number){
		
		Node.setData(number);
		
		//Finding paths
		//WOOOOO RECURSION
		if (number < 25){
			
			if(Node.getmove1() != null && Node.getmove1().getData() == 0)
				Path(Node.getmove1(), number + 1);
			
			if(Node.getmove2() != null && Node.getmove2().getData() == 0)
				Path(Node.getmove2(), number + 1);
			
			if(Node.getmove3() != null && Node.getmove3().getData() == 0)
				Path(Node.getmove3(), number + 1);
			
			if(Node.getmove4() != null && Node.getmove4().getData() == 0)
				Path(Node.getmove4(), number + 1);
			
			if(Node.getmove5() != null && Node.getmove5().getData() == 0)
				Path(Node.getmove5(), number + 1);
			
			if(Node.getmove6() != null && Node.getmove6().getData() == 0)
				Path(Node.getmove6(), number + 1);
			
			if(Node.getmove7() != null && Node.getmove7().getData() == 0)
				Path(Node.getmove7(), number + 1);
			
			if(Node.getmove8() != null && Node.getmove8().getData() == 0)
				Path(Node.getmove8(), number + 1);
		}
		
		//A path is found successfully
		if(number == 25){
			System.out.println("");
			System.out.println("A possible solution was found.");
			display();
		}
		
		if(Node.getData() != 1)
			Node.setData(0);
		
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
}

