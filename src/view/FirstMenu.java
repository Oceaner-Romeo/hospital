package view;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//我们用JLayeredPane，JLayeredPane 为 JFC/Swing 容器添加了深度，允许组件在需要时互相重叠。
//Integer 对象指定容器中每个组件的深度，其中编号较高的组件位于其他组件之上
//层次依次是:Default,Palette,Modal,PopUp,Drag
public class FirstMenu extends JFrame  
{  
    //创建一个JLayeredPane用于分层的。  
    JLayeredPane layeredPane;  
    //创建一个Panel和一个Label用于存放图片，作为背景。  
    JPanel jp;  
    JLabel jl;  
    ImageIcon image;  

    //创建一个按钮用于测试的。  
    JButton jb;  
    public static void main(String[] args)  
    {  
        new FirstMenu();  
    }  

    public FirstMenu()  
    {  
        Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screensize.getWidth();	//显示器宽度
		int height = (int)screensize.getHeight();
		System.out.println("width:"+width+"\nheight:"+height);
		int realWidth = (int) (width*0.9);	//转化后的窗口大小
		int realHeight = (int)(height*0.8);
		setTitle("习惯性流产初诊患者资料管理系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1166, 788);
		
        layeredPane=new JLayeredPane();  
        image=new ImageIcon("data/img/Menu.jpg");//随便找一张图就可以看到效果。        
        //创建背景的那些东西  
        jp=new JPanel();  
        jp.setBounds(0,0,image.getIconWidth(),image.getIconHeight());  

        jl=new JLabel(image);  
//      jl.setBounds(0,0,image.getIconWidth(),image.getIconHeight());  
        jp.add(jl);  

        JButton writeButton = new JButton("\u5F55\u5165\u65B0\u6570\u636E");
		writeButton.setBounds(134, 171, 150, 150);
		ImageIcon writeButtonImg = new ImageIcon("data/img/writeButton.jpg");
        writeButton.setIcon(writeButtonImg);
		writeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Menu Menuframe = new Menu();
							Menuframe.setVisible(true);
							dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		getContentPane().setLayout(null);
//		getContentPane().add(writeButton);
		
		JButton findButton = new JButton("\u67E5\u8BE2\u6570\u636E");
		findButton.setBounds(505, 171, 150, 150);
		ImageIcon findButtonImg = new ImageIcon("data/img/findButton.jpg");
        findButton.setIcon(findButtonImg);
		findButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						FindInput Findframe = new FindInput();
						Findframe.setVisible(true);
						dispose();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
				
			}
		});
//		getContentPane().add(findButton);

        //将jp放到最底层。                                    /*层次关系可见方法2下面的注释*/
        layeredPane.add(jp,JLayeredPane.DEFAULT_LAYER);  
        layeredPane.add(writeButton,JLayeredPane.MODAL_LAYER);
        layeredPane.add(findButton,JLayeredPane.MODAL_LAYER);
        
        this.setLayeredPane(layeredPane);  
        this.setSize(image.getIconWidth(),image.getIconHeight());  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocation(image.getIconWidth(),image.getIconHeight());  
        this.setVisible(true); 
        setLocationRelativeTo(null);

    }  
}