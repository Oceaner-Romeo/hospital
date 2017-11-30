package view;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

//我们用JLayeredPane，JLayeredPane 为 JFC/Swing 容器添加了深度，允许组件在需要时互相重叠。
//Integer 对象指定容器中每个组件的深度，其中编号较高的组件位于其他组件之上
//层次依次是:Default,Palette,Modal,PopUp,Drag
public class FindInput extends JFrame  
{  
    //创建一个JLayeredPane用于分层的。  
    JLayeredPane layeredPane;  
    //创建一个Panel和一个Label用于存放图片，作为背景。  
    JPanel jp;  
    JLabel jl;  
    ImageIcon image;  

    public FindInput()  
    {
//      Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
//		int width = (int)screensize.getWidth();	//显示器宽度
//		int height = (int)screensize.getHeight();
//		System.out.println("width:"+width+"\nheight:"+height);
//		int realWidth = (int) (width*0.9);	//转化后的窗口大小
//		int realHeight = (int)(height*0.8);
//		setTitle("查询菜单");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1166, 788);
		
        layeredPane=new JLayeredPane();  
        image=new ImageIcon("data/img/Menu.jpg");//随便找一张图就可以看到效果。        
        //创建背景的那些东西  
        jp=new JPanel();  
        jp.setBounds(0,0,image.getIconWidth(),image.getIconHeight());  

        jl=new JLabel(image);  
        jl.setBounds(0,0,image.getIconWidth(),image.getIconHeight());  
        jp.add(jl);  
		
        JLabel cxfsLabel = new JLabel("\u8BF7\u9009\u62E9\u67E5\u8BE2\u65B9\u5F0F\uFF1A");
        cxfsLabel.setForeground(Color.MAGENTA);
        cxfsLabel.setBounds(140, 236, 115, 15);
		
		JComboBox cxfsComboBox = new JComboBox();
		cxfsComboBox.setModel(new DefaultComboBoxModel(new String[] {"\u6309\u59D3\u540D", "\u6309\u624B\u673A\u53F7"}));
		cxfsComboBox.setSelectedIndex(0);
		cxfsComboBox.setBounds(242, 232, 102, 22);

        JTextField cxfsTextField = new JTextField("");
        cxfsTextField.setBounds(413, 233, 109, 22);
		getContentPane().setLayout(null);
        
        RButton cxfscxButton = new RButton("\u67E5\u8BE2");
        cxfscxButton.setBounds(637, 232, 97, 23);
        cxfscxButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Query QueryFrame = new Query();
						QueryFrame.setVisible(true);
						dispose();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
				
			}
		});

        //将jp放到最底层。                                    /*层次关系可见方法2下面的注释*/
        layeredPane.add(jp,JLayeredPane.DEFAULT_LAYER);  
        layeredPane.add(cxfsLabel,JLayeredPane.MODAL_LAYER);
        layeredPane.add(cxfsComboBox,JLayeredPane.MODAL_LAYER);
        layeredPane.add(cxfsTextField,JLayeredPane.MODAL_LAYER);
        layeredPane.add(cxfscxButton,JLayeredPane.MODAL_LAYER);
        
        this.setLayeredPane(layeredPane);
        this.setSize(image.getIconWidth(),image.getIconHeight());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocation(image.getIconWidth(),image.getIconHeight());  
        this.setVisible(true); 
        setLocationRelativeTo(null);

    }  
}