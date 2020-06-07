package unit13_code;

import javax.swing.*;
import java.awt.*;

public class Panel1 
{
	public static void main(String[] args) 
	{
		Panel1 gui=new Panel1();
		gui.go();
	}
	public void go()
	{
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		panel.setBackground(Color.darkGray);
		
		JButton button=new JButton("Shock me");
		JButton button2=new JButton("Bliss");
		panel.add(button);
		panel.add(button2);
		frame.getContentPane().add(BorderLayout.EAST,panel);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	//Panel默认为FlowLayout布局，即左右
	//frame默认使用BoxLayout
	//pack()方法是窗口大小适应组件大小
}
