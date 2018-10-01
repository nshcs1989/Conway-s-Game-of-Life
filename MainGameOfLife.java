
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class MainGameOfLife 
{
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null,"Welcome to Conway’s Game Of Life\nThe following window will show you the first generation");
		JFrame window=new JFrame();
		MatrixGameOfLife m = new MatrixGameOfLife(10,10);
		window.add(m);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(600,600);
		window.setVisible(true);
		
		String str=JOptionPane.showInputDialog("If you want to move for the next generation please type 'YES', else type 'NO'\n"); 
		String nextGen = str.toLowerCase();
		while(nextGen.equals("yes"))
		{
			m.nextGen();
			window.add(m);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setSize(600,600);
			window.setVisible(true);
			m.repaint();
			str=JOptionPane.showInputDialog("If you want to move for the next generation please type 'YES', else type 'NO'\n"); 
			nextGen = str.toLowerCase();
		}
		
		
		
	}
}
