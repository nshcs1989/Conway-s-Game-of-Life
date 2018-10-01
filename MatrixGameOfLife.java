

import java.util.Random;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class MatrixGameOfLife extends  JPanel
{
	
	private int a[][];
	private int arr[][];
	
	public MatrixGameOfLife(int row, int col)//constractor
	{
		a=new int[row][col];
		arr=new int[row][col];
				
		Random r = new Random();
		
		for (int i=0;i<a.length;i++)//making the "random" matrix
		{
			for (int j=0;j<a.length;j++)
			{
				a[i][j]=r.nextInt(2);
				
			}
		}
		matrix(a,arr);
		
	}//end constractor
	
	public void paintComponent(Graphics g)//making the graphic for the matrix
	{
		super.paintComponent(g);
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				
				if (a[i][j]==1)
				{
					g.setColor(Color.GRAY);
					g.fillRect(i*50, j*50, 50, 50);
					
				}
				g.setColor(Color.BLACK);
				g.drawRect(i*50,j*50,50, 50);
			}
		}
	
	}	
	
	
	
	public void matrix(int[][] a, int[][] arr)//chacking and updating the matrix by their Neighbors
	{
		
		for (int r=0;r<a.length;r++)
		{
			for (int c=0;c<a.length;c++)
			{
				int counter=0;
				counter=disable(a,r,c,0);//counting Neighbors of each cell in the matrix
				if (a[r][c]==0 && counter==3)
				{
					arr[r][c]=1;
				}
				else if (a[r][c]==0)
				{
					arr[r][c]=0;
				}
				
				else if (a[r][c]==1 && (counter==0 || counter==1))
				{
					arr[r][c]=0;
				}
				else if (a[r][c]==1 && (counter==2 || counter==3))
				{
					arr[r][c]=1;
				}
				else if (a[r][c]==1 && counter >= 4)
				{
					arr[r][c]=0;
				}
			
				
			}
				
		}
		
		for (int i=0;i<a.length;i++)//updating matrix for the next generation
		{
			for (int j=0;j<a.length;j++)
			{
				a[i][j]=arr[i][j];
			}
		}
			
	}
	
	private int disable(int[][]a, int r,int c,int counter)//counting Neighbors of each cell in the matrix
	{
		//up
		if (r-1>=0 && a[r-1][c]==1)
			counter+=1;
		//down
		if (r+1<=a.length-1 && a[r+1][c]==1)
			counter+=1;
		//right
		if (c+1<=a.length -1 && a[r][c+1]==1)
			counter+=1;
		//left
		if (c-1>=0 && a[r][c-1]==1)
			counter+=1;
		//up left
		if (r-1>=0 && c-1>=0 && a[r-1][c-1]==1)
			counter+=1;
		//up right
		if (r-1>=0 && c+1<=a.length -1 && a[r-1][c+1]==1)
			counter+=1;
		//down left
		if (r+1<=a.length -1 && c-1>=0 && a[r+1][c-1]==1)
			counter+=1;
		//down right
		if (r+1<=a.length -1 && c+1<=a.length -1 && a[r+1][c+1]==1)
			counter+=1;
		
		return counter;
	}
		

	public void nextGen()//the method which call to the next generation
	{
		matrix(a,arr);
		
	}
	
}
