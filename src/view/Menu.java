package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 创建窗口
	 */
	public Menu() {
		/*获取显示器大小*/
		Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screensize.getWidth();	//显示器宽度
		int height = (int)screensize.getHeight();
		System.out.println("width:"+width+"\nheight:"+height);
		int realWidth = (int) (width*0.9);	//转化后的窗口大小
		int realHeight = (int)(height*0.8);
		setTitle("习惯性流产初诊患者资料");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1166, 788);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("文件");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("退出");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu("帮助");
		menuBar.add(menu_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Info = new JPanel();
		Info.setToolTipText("Info");
		Info.setBounds(12, 12, 1142, 53);
		contentPane.add(Info);
		Info.setLayout(null);
		
		JLabel name = new JLabel("患者姓名：");
		name.setBounds(110, 28, 65, 13);
		Info.add(name);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(188, 26, 95, 17);
		Info.add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel label = new JLabel("电话：");
		label.setBounds(339, 28, 63, 13);
		Info.add(label);
		
		JLabel lblcm = new JLabel("身高(cm)：");
		lblcm.setBounds(603, 28, 87, 13);
		Info.add(lblcm);
		
		JLabel lblkg = new JLabel("体重(kg):");
		lblkg.setBounds(844, 28, 78, 13);
		Info.add(lblkg);
		
		textField = new JTextField();
		textField.setBounds(394, 26, 95, 17);
		Info.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"180", "179", "178", "177", "176", "175", "174", "173", "172", "171", "170", "169", "168", "167", "166", "165", "164", "163", "162", "161", "160", "159", "158", "157", "156", "155", "154", "153", "152"}));
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(683, 23, 65, 22);
		Info.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"75", "74", "73", "72", "71", "70", "69", "68", "67", "66", "65", "64", "63", "62"}));
		comboBox_1.setSelectedIndex(1);
		comboBox_1.setBounds(922, 23, 63, 22);
		Info.add(comboBox_1);
		
		JPanel GravidityState = new JPanel();
		GravidityState.setBounds(12, 77, 1142, 196);
		contentPane.add(GravidityState);
		
		JPanel MarriageState = new JPanel();
		MarriageState.setBounds(12, 281, 612, 74);
		contentPane.add(MarriageState);
		
		JPanel MensesState = new JPanel();
		MensesState.setBounds(12, 363, 612, 155);
		contentPane.add(MensesState);
		
		JPanel AllergyHistory = new JPanel();
		AllergyHistory.setBounds(12, 527, 612, 88);
		contentPane.add(AllergyHistory);
		
		JPanel FamilyState = new JPanel();
		FamilyState.setBounds(12, 627, 612, 81);
		contentPane.add(FamilyState);
		FamilyState.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 0, 564, 81);
		FamilyState.add(scrollPane);
		
		JTextArea FamilyStateTextArea = new JTextArea();
		FamilyStateTextArea.setText("例如：家族性遗传病，父母有无高血压病，糖尿病，高血脂，脑梗等;有无近亲结婚史");
		FamilyStateTextArea.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				FamilyStateTextArea.setText("");
			}
			
			
		});
		
		scrollPane.setViewportView(FamilyStateTextArea);
		
		JLabel label_1 = new JLabel("家族史");
		label_1.setBounds(0, 0, 48, 81);
		FamilyState.add(label_1);
		
		JButton saveButton = new JButton("保存");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "保存成功！");

			}
		});
		saveButton.setBounds(547, 720, 104, 23);
		contentPane.add(saveButton);
		
		JPanel PastHistory = new JPanel();
		PastHistory.setBounds(636, 281, 518, 237);
		contentPane.add(PastHistory);
		
		JPanel OperationHistory = new JPanel();
		OperationHistory.setBounds(636, 527, 518, 181);
		contentPane.add(OperationHistory);
	}
}
