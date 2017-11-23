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
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField textField;
	private JTable table;

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
		
		JMenuItem menuItem_1 = new JMenuItem("填写帮助");
		menu_1.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("软件使用");
		menu_1.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("联系开发者");
		menu_1.add(menuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Info = new JPanel();
		Info.setBackground(SystemColor.info);
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
		GravidityState.setBackground(UIManager.getColor("OptionPane.questionDialog.border.background"));
		GravidityState.setBounds(12, 77, 1142, 196);
		contentPane.add(GravidityState);
		GravidityState.setLayout(null);
		
		JLabel label_9 = new JLabel("怀孕状况");
		label_9.setBounds(0, 87, 63, 13);
		GravidityState.add(label_9);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setEnabled(false);
		scrollPane_3.setBounds(81, -2, 1061, 198);
		GravidityState.add(scrollPane_3);
		
		table = new JTable();
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"\u6000\u5B55\u6B21\u6570", "\u65F6\u95F4", "\u81EA\u7136\u53D7\u5B55", "\u8F85\u52A9\u751F\u6B96", "\u5B55\u5468", "\u5B55\u56CA", "\u80CE\u82BD", "\u80CE\u5FC3", "\u89C1\u7EA2", "\u80DE\u80CE\u60C5\u51B5\uFF08\u836F\u7269\uFF09", "\u6E05\u5BAB", "\u5907\u6CE8"
			}
		));
		scrollPane_3.setViewportView(table);
		
		JPanel MarriageState = new JPanel();
		MarriageState.setBackground(UIManager.getColor("OptionPane.warningDialog.titlePane.shadow"));
		MarriageState.setBounds(12, 281, 612, 74);
		contentPane.add(MarriageState);
		MarriageState.setLayout(null);
		
		JLabel label_2 = new JLabel("婚育状况");
		label_2.setBounds(0, 31, 52, 13);
		MarriageState.add(label_2);
		
		JLabel label_4 = new JLabel("次数：");
		label_4.setBounds(294, 12, 52, 13);
		MarriageState.add(label_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("有子女");
		chckbxNewCheckBox.setBounds(378, 45, 73, 21);
		MarriageState.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("配偶再婚");
		checkBox.setBounds(260, 45, 86, 21);
		MarriageState.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("目前再婚");
		checkBox_1.setBounds(82, 45, 86, 21);
		MarriageState.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("有过主动流产");
		checkBox_2.setBounds(82, 8, 116, 21);
		MarriageState.add(checkBox_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40"}));
		comboBox_2.setSelectedIndex(0);
		comboBox_2.setBounds(375, 7, 63, 22);
		MarriageState.add(comboBox_2);
		
		JPanel MensesState = new JPanel();
		MensesState.setBackground(UIManager.getColor("RadioButtonMenuItem.acceleratorForeground"));
		MensesState.setBounds(12, 363, 612, 155);
		contentPane.add(MensesState);
		MensesState.setLayout(null);
		
		JLabel label_8 = new JLabel("月经情况");
		label_8.setBounds(0, 60, 63, 13);
		MensesState.add(label_8);
		
		JRadioButton radioButton_5 = new JRadioButton("月经规律");
		radioButton_5.setBounds(95, 8, 137, 21);
		MensesState.add(radioButton_5);
		
		JLabel label_10 = new JLabel("月经周期");
		label_10.setBounds(105, 37, 63, 13);
		MensesState.add(label_10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"40", "39", "38", "37", "36", "35", "34", "33", "32", "31", "30", "29", "28", "27", "26", "25", "24", "23", "22", "21", "20", "19", "18"}));
		comboBox_3.setSelectedIndex(10);
		comboBox_3.setBounds(180, 32, 52, 22);
		MensesState.add(comboBox_3);
		
		JLabel label_11 = new JLabel("第一次月经是：");
		label_11.setBounds(95, 94, 124, 13);
		MensesState.add(label_11);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26"}));
		comboBox_4.setSelectedIndex(5);
		comboBox_4.setBounds(224, 89, 52, 22);
		MensesState.add(comboBox_4);
		
		JPanel AllergyHistory = new JPanel();
		AllergyHistory.setBackground(new Color(255, 218, 185));
		AllergyHistory.setBounds(12, 527, 612, 88);
		contentPane.add(AllergyHistory);
		AllergyHistory.setLayout(null);
		
		JLabel label_6 = new JLabel("过敏史");
		label_6.setBounds(0, 33, 39, 13);
		AllergyHistory.add(label_6);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(50, 0, 562, 88);
		AllergyHistory.add(scrollPane_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("例如：头孢类，青霉素过敏等");
		scrollPane_2.setViewportView(textArea);
		
		textArea.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(textArea.getText().equals("例如：头孢类，青霉素过敏等")) {
					textArea.setText("");
				}				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(textArea.getText().length()<1) {
					textArea.setText("例如：头孢类，青霉素过敏等");
				}
			}
			
			
		});
		
		JPanel FamilyState = new JPanel();
		FamilyState.setBackground(SystemColor.info);
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
				if(FamilyStateTextArea.getText().equals("例如：家族性遗传病，父母有无高血压病，糖尿病，高血脂，脑梗等;有无近亲结婚史")) {
					FamilyStateTextArea.setText("");
				}				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(FamilyStateTextArea.getText().length()<1) {
					FamilyStateTextArea.setText("例如：家族性遗传病，父母有无高血压病，糖尿病，高血脂，脑梗等;有无近亲结婚史");
				}
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
		saveButton.setBounds(576, 706, 104, 23);
		contentPane.add(saveButton);
		
		JPanel PastHistory = new JPanel();
		PastHistory.setBackground(new Color(199, 21, 133));
		PastHistory.setBounds(636, 285, 518, 237);
		contentPane.add(PastHistory);
		PastHistory.setLayout(null);
		
		JLabel label_3 = new JLabel("既往史");
		label_3.setBounds(12, 112, 39, 13);
		PastHistory.add(label_3);
		
		JRadioButton radioButton = new JRadioButton("高血压");
		radioButton.setBounds(124, 8, 153, 21);
		PastHistory.add(radioButton);
		
		JRadioButton radioButton_2 = new JRadioButton("糖尿病");
		radioButton_2.setBounds(124, 46, 153, 21);
		PastHistory.add(radioButton_2);
		
		JRadioButton radioButton_4 = new JRadioButton("甲状腺疾病");
		radioButton_4.setBounds(124, 79, 153, 21);
		PastHistory.add(radioButton_4);
		
		JRadioButton radioButton_6 = new JRadioButton("近亲结婚");
		radioButton_6.setBounds(124, 104, 153, 21);
		PastHistory.add(radioButton_6);
		
		JRadioButton radioButton_8 = new JRadioButton("免疫系统疾病");
		radioButton_8.setBounds(124, 138, 153, 21);
		PastHistory.add(radioButton_8);
		
		JRadioButton radioButton_1 = new JRadioButton("接触化学制剂及毒品");
		radioButton_1.setBounds(124, 163, 153, 21);
		PastHistory.add(radioButton_1);
		
		JRadioButton radioButton_3 = new JRadioButton("高血脂");
		radioButton_3.setBounds(124, 188, 153, 21);
		PastHistory.add(radioButton_3);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(322, 50, 184, 175);
		PastHistory.add(textArea_1);
		
		JLabel label_7 = new JLabel("其他疾病(备注)");
		label_7.setBounds(378, 12, 63, 13);
		PastHistory.add(label_7);
		
		JPanel OperationHistory = new JPanel();
		OperationHistory.setBackground(new Color(0, 102, 0));
		OperationHistory.setBounds(636, 527, 518, 181);
		contentPane.add(OperationHistory);
		OperationHistory.setLayout(null);
		
		JLabel label_5 = new JLabel("手术史");
		label_5.setBounds(12, 76, 63, 13);
		OperationHistory.add(label_5);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(82, 0, 436, 181);
		OperationHistory.add(scrollPane_1);
		
		JTextArea OperationHistoryTextArea = new JTextArea();		
		scrollPane_1.setViewportView(OperationHistoryTextArea);
		OperationHistoryTextArea.setText("例如：宫腔镜，腹腔镜，开腹手术，输卵");
		OperationHistoryTextArea.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(OperationHistoryTextArea.getText().equals("例如：宫腔镜，腹腔镜，开腹手术，输卵")) {
					OperationHistoryTextArea.setText("");
				}				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(OperationHistoryTextArea.getText().length()<1) {
					OperationHistoryTextArea.setText("例如：宫腔镜，腹腔镜，开腹手术，输卵");
				}
			}
			
			
		});
		
	}
}
