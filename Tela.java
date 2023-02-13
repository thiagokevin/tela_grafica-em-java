import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Tela extends Canvas implements Runnable
{
	
	int WIDTH = 480, HEIGTH = 480; 
	
	
	public Tela()
	{
		this.setPreferredSize(new Dimension(WIDTH,HEIGTH));
	}
	
	public static void main(String[] args)
	{
		Tela tela = new Tela();
		JFrame frame = new JFrame();
		
		frame.add(tela);
		frame.setTitle("Janela");
		frame.pack();
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	
	@Override
	public void run() 
	{
		
		
	}

}