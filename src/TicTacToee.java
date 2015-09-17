
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;


public class TicTacToee implements ActionListener 
{
	JFrame board;
	JButton topLeft;
	JButton topMid;
	JButton topRight;
	JButton midLeft;
	JButton center;
	JButton midRight;
	JButton botLeft;
	JButton botMid;
	JButton botRight;
	int count = 0;
	boolean[] spaceFilled;
	int[] winCondition;
	
	
	public TicTacToee()
	{
		spaceFilled = new boolean[9];
		for(int i=0; i<9; i++)
		{
			spaceFilled[i] = false;
		}
		
		winCondition = new int[9];
		for(int i=0; i<9; i++)
		{
			winCondition[i] = 0;
		}
		
		count = 1;
		//setting board/frame
		JFrame.setDefaultLookAndFeelDecorated(true);
		board = new JFrame("TicTacToe");
		board.setSize(500,500);
		board.setLayout(new GridLayout(3,3));
		board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		board.setVisible(true);
		
		//creating "blueprints" for buttons
		topLeft = new JButton(" ");
		topMid = new JButton(" ");
		topRight = new JButton(" ");
		midLeft = new JButton(" ");
		center = new JButton(" ");
		midRight = new JButton(" ");
		botLeft = new JButton(" ");
		botMid = new JButton(" ");
		botRight = new JButton(" ");
		
		//adding the buttons into physical form
		board.add(topLeft);
		topLeft.addActionListener(this);
		board.add(topMid);
		topMid.addActionListener(this);
		board.add(topRight);
		topRight.addActionListener(this);
		board.add(midLeft);
		midLeft.addActionListener(this);
		board.add(center);
		center.addActionListener(this);
		board.add(midRight);
		midRight.addActionListener(this);
		board.add(botLeft);
		botLeft.addActionListener(this);
		board.add(botMid);
		botMid.addActionListener(this);
		board.add(botRight);
		botRight.addActionListener(this);
			
		
	}
	
	public void winCondition()
	{
		  //setting win conditions for both players
		  if((winCondition[0] == 1 && winCondition[1] == 1 && winCondition[2] == 1) || (winCondition[0] == 2 && winCondition[1] == 2 && winCondition[2] == 2))
		  {
			  if(count%2 == 1)
			  {
				  System.out.println("O wins!");
			  }
			  else
			  {
				  System.out.println("X wins!");
			  }
		  }
		  if((winCondition[3] == 1 && winCondition[4] == 1 && winCondition[5] == 1) || (winCondition[3] == 2 && winCondition[4] == 2 && winCondition[5] == 2))
		  {
			  if(count%2 == 1)
			  {
				  System.out.println("O wins!");
			  }
			  else
			  {
				  System.out.println("X wins!");
			  }
		  }
		  if((winCondition[6] == 1 && winCondition[7] == 1 && winCondition[8] == 1) || (winCondition[6] == 2 && winCondition[7] == 2 && winCondition[8] == 2))
		  {
			  if(count%2 == 1)
			  {
				  System.out.println("O wins!");
			  }
			  else
			  {
				  System.out.println("X wins!");
			  }
		  }
		  if((winCondition[0] == 1 && winCondition[3] == 1 && winCondition[6] == 1) || (winCondition[0] == 2 && winCondition[3] == 2 && winCondition[6] == 2))
		  {
			  if(count%2 == 1)
			  {
				  System.out.println("O wins!");
			  }
			  else
			  {
				  System.out.println("X wins!");
			  }
		  }
		  if((winCondition[1] == 1 && winCondition[4] == 1 && winCondition[7] == 1) || (winCondition[1] == 2 && winCondition[4] == 2 && winCondition[7] == 2))
		  {
			  if(count%2 == 1)
			  {
				  System.out.println("O wins!");
			  }
			  else
			  {
				  System.out.println("X wins!");
			  }
		  }
		  if((winCondition[2] == 1 && winCondition[5] == 1 && winCondition[8] == 1) || (winCondition[2] == 2 && winCondition[5] == 2 && winCondition[8] == 2))
		  {
			  if(count%2 == 1)
			  {
				  System.out.println("O wins!");
			  }
			  else
			  {
				  System.out.println("X wins!");
			  }
		  }
		  if((winCondition[0] == 1 && winCondition[4] == 1 && winCondition[8] == 1) || (winCondition[0] == 2 && winCondition[4] == 2 && winCondition[8] == 2))
		  {
			  if(count%2 == 1)
			  {
				  System.out.println("O wins!");
			  }
			  else
			  {
				  System.out.println("X wins!");
			  }
		  }
		  if((winCondition[2] == 1 && winCondition[4] == 1 && winCondition[6] == 1) || (winCondition[2] == 2 && winCondition[4] == 2 && winCondition[6] == 2))
		  {
			  if(count%2 == 1)
			  {
				  System.out.println("O wins!");
			  }
			  else
			  {
				  System.out.println("X wins!");
			  }
		  }
	}
	
	public void actionPerformed(ActionEvent a)
	{
		//if statements for O or X
		if(spaceFilled[0] == false)
		{
			
			if(a.getSource() == topLeft)
			{
				if(count%2 == 1)
				{
					topLeft.setText("X");
					winCondition[0] = 1;
				}
				else
				{
					topLeft.setText("O");
					winCondition[0] = 2;
				}
				spaceFilled[0] = true;
				count++;
			}
		}
		
		if(spaceFilled[1] == false)
		{
			if(a.getSource() == topMid)
			{
				if(count%2 == 1)
				{
					topMid.setText("X");
					winCondition[1] = 1;
				}
				else
				{
					topMid.setText("O");
					winCondition[1] = 2;
				}
				spaceFilled[1] = true;
				count++;
			}
		}
		
		if(spaceFilled[2] == false)
		{
			if(a.getSource() == topRight)
			{
				if(count%2 == 1)
				{
					topRight.setText("X");
					winCondition[2] = 1;
				}
				else
				{
					topRight.setText("O");
					winCondition[2] = 2;
				}
				spaceFilled[2] = true;
				count++;
			}
		}
		
		if(spaceFilled[3] == false)
		{
			if(a.getSource() == midLeft)
			{
				if(count%2 == 1)
				{
					midLeft.setText("X");
					winCondition[3] = 1;
				}
				else
				{
					midLeft.setText("O");
					winCondition[3] = 2;
				}
				spaceFilled[3] = true;
				count++;
			}
		}
		
		if(spaceFilled[4] == false)
		{
			if(a.getSource() == center)
			{
				if(count%2 == 1)
				{
					center.setText("X");
					winCondition[4] = 1;
				}
				else
				{
					center.setText("O");
					winCondition[4] = 2;
				}
				spaceFilled[4] = true;
				count++;
			}
		}
		
		if(spaceFilled[5] == false)
		{
			if(a.getSource() == midRight)
			{
				if(count%2 == 1)
				{
					midRight.setText("X");
					winCondition[5] = 1;
				}
				else
				{
					midRight.setText("O");
					winCondition[5] = 2;
				}
				spaceFilled[5] = true;
				count++;
			}
		}
		
		if(spaceFilled[6] == false)
		{
			if(a.getSource() == botLeft)
			{
				if(count%2 == 1)
				{
					botLeft.setText("X");
					winCondition[6] = 1;
				}
				else
				{
					botLeft.setText("O");
					winCondition[6] = 2;
				}
				spaceFilled[6] = true;
				count++;
			}
		}
		
		if(spaceFilled[7] == false)
		{
			if(a.getSource() == botMid)
			{
				if(count%2 == 1)
				{
					botMid.setText("X");
					winCondition[7] = 1;
				}
				else
				{
					botMid.setText("O");
					winCondition[7] = 2;
				}
				spaceFilled[7] = true;
				count++;
			}
		}
		
		if(spaceFilled[8] == false)
		{
			if(a.getSource() == botRight)
			{
				if(count%2 == 1)
				{
					botRight.setText("X");
					winCondition[8] = 1;
				}
				else
				{
					botRight.setText("O");
					winCondition[8] = 2;
				}
				spaceFilled[8] = true;
				count++;
			}
		}
		
		System.out.println("A button was pressed.");
		winCondition();
	}
	
	

	public static void main(String[] args) 
	{
		new TicTacToee();
	}


}
