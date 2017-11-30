package view;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame{
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public Login() {
		
		/*获取显示器大小*/
		Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screensize.getWidth();	//显示器宽度
		int height = (int)screensize.getHeight();
		System.out.println("width:"+width+"\nheight:"+height);
		int realWidth = (int) (width*0.9);	//转化后的窗口大小
		int realHeight = (int)(height*0.8);
		setTitle("习惯性流产初诊患者资料管理系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1166, 788);
		
		JButton writeButton = new JButton("\u5F55\u5165\u65B0\u6570\u636E");
		writeButton.setBounds(134, 171, 150, 150);
		ImageIcon writeButtonImg = new ImageIcon("data/img/writeButton.jpg");
        writeButton.setIcon(writeButtonImg);
		writeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(writeButton);
		
		JButton findButton = new JButton("\u67E5\u8BE2\u6570\u636E");
		findButton.setBounds(505, 171, 150, 150);
		ImageIcon findButtonImg = new ImageIcon("data/img/findButton.jpg");
        findButton.setIcon(findButtonImg);
		getContentPane().add(findButton);
		
		
		
		
		
	}

	
	
	
	
	
}
