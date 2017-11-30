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

//������JLayeredPane��JLayeredPane Ϊ JFC/Swing �����������ȣ������������Ҫʱ�����ص���
//Integer ����ָ��������ÿ���������ȣ����б�Žϸߵ����λ���������֮��
//���������:Default,Palette,Modal,PopUp,Drag
public class FirstMenu extends JFrame  
{  
    //����һ��JLayeredPane���ڷֲ�ġ�  
    JLayeredPane layeredPane;  
    //����һ��Panel��һ��Label���ڴ��ͼƬ����Ϊ������  
    JPanel jp;  
    JLabel jl;  
    ImageIcon image;  

    //����һ����ť���ڲ��Եġ�  
    JButton jb;  
    public static void main(String[] args)  
    {  
        new FirstMenu();  
    }  

    public FirstMenu()  
    {  
        Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screensize.getWidth();	//��ʾ�����
		int height = (int)screensize.getHeight();
		System.out.println("width:"+width+"\nheight:"+height);
		int realWidth = (int) (width*0.9);	//ת����Ĵ��ڴ�С
		int realHeight = (int)(height*0.8);
		setTitle("ϰ�����������ﻼ�����Ϲ���ϵͳ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1166, 788);
		
        layeredPane=new JLayeredPane();  
        image=new ImageIcon("data/img/Menu.jpg");//�����һ��ͼ�Ϳ��Կ���Ч����        
        //������������Щ����  
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

        //��jp�ŵ���ײ㡣                                    /*��ι�ϵ�ɼ�����2�����ע��*/
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