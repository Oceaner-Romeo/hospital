package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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

import util.Access;

import java.awt.Font;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField telephoneTextField;
	private JTable hyqkTable;

	/**
	 * 组件信息 
	 */
	public String name = "";
	public String tel = "";
	public String height = "";
	public String weight = "";	
	

	/*过敏史+家族史+手术史*/
	public String gmString = "";
	public String jzString = "";
	public String operationHistoryString = "";
	
	
	
	/*与既往史有关的变量*/
	public String gxyString = "";
	public String tnbString = "";
	public String jzxjbString = "";
	public String jqjhString = "";
	public String myxtjbString = "";
	public String jchxzhhdpString = "";
	public String gxzString = "";
	public String qtjbString = "";
	
	/*与怀孕情况有关的变量*/
	public String csString = "";
	public String sjString = "";
	public String zrsyString = "";
	public String fzszString = "";
	public String yzString = "";
	public String yzjhString = "";
	public String tyString = "";
	public String txString = "";
	public String jhString = "";
	public String btqkString = "";
	public String qgString = "";
	public String bzString = "";
	
	/*婚育情况*/
	public String zdlcString = "";
	public String zdlccsString = "";
	public String mqzhString = "";
	public String pozhString = "";
	public String yznString = "";
	
	/*有关月经情况的变量*/
	public String yjbglString = "";
	public String yjzqString = "";
	public String zdtsString = "";
	public String zctsString = "";
	public String yjjtgjString = "";
	public String yjlString = "";
	public String mcyjsjString = "";
	public String dycyjString = "";
	public String yjljsString = "";
	public String jslyjString = "";
	public String kssjString = "";
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Menu frame = new Menu();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * 创建窗口
	 */
	public Menu() {
		/*获取显示器大小*//*
		Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screensize.getWidth();	//显示器宽度
		int height = (int)screensize.getHeight();
		System.out.println("width:"+width+"\nheight:"+height);
		int realWidth = (int) (width*0.9);	//转化后的窗口大小
		int realHeight = (int)(height*0.8);*/
		setTitle("习惯性流产初诊患者资料");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1166, 788);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu cdMenu = new JMenu("菜单");
		menuBar.add(cdMenu);
		
		JMenuItem tcMenuItem = new JMenuItem("退出");
		tcMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cdMenu.add(tcMenuItem);
		
		JMenu bzMenu = new JMenu("帮助");
		menuBar.add(bzMenu);
		
		JMenuItem txbzMenuItem = new JMenuItem("填写帮助");
		bzMenu.add(txbzMenuItem);
		
		JMenuItem rjsyMenuItem = new JMenuItem("软件使用");
		bzMenu.add(rjsyMenuItem);
		
		JMenuItem lxkfzMenuItem = new JMenuItem("联系开发者");
		bzMenu.add(lxkfzMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Info = new JPanel();
		Info.setBackground(Color.WHITE);
		Info.setToolTipText("Info");
		Info.setBounds(12, 12, 1142, 53);
		contentPane.add(Info);
		Info.setLayout(null);
		
		JLabel nameLable = new JLabel("患者姓名：");
		nameLable.setBounds(110, 28, 65, 13);
		Info.add(nameLable);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(188, 26, 95, 17);
		Info.add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel telephoneLlabel = new JLabel("电话：");
		telephoneLlabel.setBounds(339, 28, 63, 13);
		Info.add(telephoneLlabel);
		
		JLabel heightLable = new JLabel("身高(cm)：");
		heightLable.setBounds(603, 28, 87, 13);
		Info.add(heightLable);
		
		JLabel weightLable = new JLabel("体重(kg):");
		weightLable.setBounds(844, 28, 78, 13);
		Info.add(weightLable);
		
		telephoneTextField = new JTextField();
		telephoneTextField.setBounds(394, 26, 95, 17);
		Info.add(telephoneTextField);
		telephoneTextField.setColumns(10);
		
		JComboBox heightComboBox = new JComboBox();
		heightComboBox.setModel(new DefaultComboBoxModel(new String[] {"180", "179", "178", "177", "176", "175", "174", "173", "172", "171", "170", "169", "168", "167", "166", "165", "164", "163", "162", "161", "160", "159", "158", "157", "156", "155", "154", "153", "152"}));
		heightComboBox.setSelectedIndex(1);
		heightComboBox.setBounds(683, 23, 65, 22);
		Info.add(heightComboBox);
		
		JComboBox weightComboBox = new JComboBox();
		weightComboBox.setModel(new DefaultComboBoxModel(new String[] {"75", "74", "73", "72", "71", "70", "69", "68", "67", "66", "65", "64", "63", "62"}));
		weightComboBox.setSelectedIndex(1);
		weightComboBox.setBounds(922, 23, 63, 22);
		Info.add(weightComboBox);
		
		JPanel GravidityState = new JPanel();
		GravidityState.setBackground(Color.WHITE);
		GravidityState.setBounds(12, 77, 1142, 196);
		contentPane.add(GravidityState);
		GravidityState.setLayout(null);
		
		JLabel hyqkLable = new JLabel("怀孕情况");
		hyqkLable.setBounds(0, 87, 63, 13);
		GravidityState.add(hyqkLable);
		
		JScrollPane hyqkScrollPane = new JScrollPane();
		hyqkScrollPane.setEnabled(false);
		hyqkScrollPane.setBounds(81, -2, 1061, 198);
		GravidityState.add(hyqkScrollPane);
		
		hyqkTable = new JTable();
		hyqkTable.setModel(new DefaultTableModel(
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
		hyqkScrollPane.setViewportView(hyqkTable);
		
		JPanel MarriageState = new JPanel();
		MarriageState.setBackground(Color.WHITE);
		MarriageState.setBounds(12, 281, 612, 74);
		contentPane.add(MarriageState);
		MarriageState.setLayout(null);
		
		JLabel hyqkLabel = new JLabel("婚育情况");
		hyqkLabel.setBounds(0, 31, 52, 13);
		MarriageState.add(hyqkLabel);
		
		JCheckBox zdlcCheckBox = new JCheckBox("有过主动流产");
		zdlcCheckBox.setBackground(Color.WHITE);
		zdlcCheckBox.setBounds(82, 8, 116, 21);
		MarriageState.add(zdlcCheckBox);
		
		JLabel zdlccsLabel = new JLabel("次数：");
		zdlccsLabel.setBounds(294, 12, 52, 13);
		MarriageState.add(zdlccsLabel);
		zdlccsLabel.setVisible(false);
		
		JComboBox zdlccsComboBox = new JComboBox();
		zdlccsComboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40"}));
		zdlccsComboBox.setSelectedIndex(0);
		zdlccsComboBox.setBounds(375, 7, 63, 22);
		MarriageState.add(zdlccsComboBox);
		zdlccsComboBox.setVisible(false);
		
		zdlcCheckBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				JCheckBox jcb = (JCheckBox) arg0.getItem();
		        if (jcb.isSelected()) {
		        	zdlccsLabel.setVisible(true);
		        	zdlccsComboBox.setVisible(true);
		        } else {  
		        	zdlccsLabel.setVisible(false);
		        	zdlccsComboBox.setVisible(false);
		        } 
			}
		});
		
		JCheckBox yznCheckBox = new JCheckBox("有子女");
		yznCheckBox.setBackground(Color.WHITE);
		yznCheckBox.setBounds(378, 45, 73, 21);
		MarriageState.add(yznCheckBox);
		
		JCheckBox pozhCheckBox = new JCheckBox("配偶再婚");
		pozhCheckBox.setBackground(Color.WHITE);
		pozhCheckBox.setBounds(227, 45, 86, 21);
		MarriageState.add(pozhCheckBox);
		
		JCheckBox mqzhCheckBox = new JCheckBox("目前再婚");
		mqzhCheckBox.setBackground(Color.WHITE);
		mqzhCheckBox.setBounds(82, 45, 86, 21);
		MarriageState.add(mqzhCheckBox);
		
		JPanel MensesState = new JPanel();
		MensesState.setForeground(Color.BLACK);
		MensesState.setBackground(Color.WHITE);
		MensesState.setBounds(12, 363, 612, 155);
		contentPane.add(MensesState);
		MensesState.setLayout(null);
		
		JLabel yjqkLabel = new JLabel("月经情况");
		yjqkLabel.setBounds(0, 70, 63, 13);
		MensesState.add(yjqkLabel);

		JCheckBox yjbglCheckBox = new JCheckBox("月经不规律");
		yjbglCheckBox.setBackground(Color.WHITE);
		yjbglCheckBox.setBounds(60, 4, 109, 23);
		MensesState.add(yjbglCheckBox);
		
		JLabel zdtsLabel = new JLabel("最短天数：");
		zdtsLabel.setBounds(220, 32, 76, 15);
		MensesState.add(zdtsLabel);
		zdtsLabel.setVisible(false);
		
		JComboBox zdtsComboBox = new JComboBox();
		zdtsComboBox.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43"}));
		zdtsComboBox.setSelectedIndex(10);
		zdtsComboBox.setBounds(291, 28, 63, 22);
		MensesState.add(zdtsComboBox);
		zdtsComboBox.setVisible(false);
		
		JLabel zctsLabel = new JLabel("最长天数：");
		zctsLabel.setBounds(375, 32, 76, 15);
		MensesState.add(zctsLabel);
		zctsLabel.setVisible(false);
		
		JComboBox zctsComboBox = new JComboBox();
		zctsComboBox.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"}));
		zctsComboBox.setBounds(450, 28, 63, 22);
		MensesState.add(zctsComboBox);
		zctsComboBox.setVisible(false);
		
		yjbglCheckBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				JCheckBox jcb = (JCheckBox) arg0.getItem();
		        if (jcb.isSelected()) {
		        	zdtsLabel.setVisible(true);
		        	zdtsComboBox.setVisible(true);
		        	zctsLabel.setVisible(true);
		        	zctsComboBox.setVisible(true);
		        } else {
		        	zdtsLabel.setVisible(false);
		        	zdtsComboBox.setVisible(false);
		        	zctsLabel.setVisible(false);
		        	zctsComboBox.setVisible(false);
		        } 
			}
		});
		
		JLabel yjzqLabel = new JLabel("月经周期：");
		yjzqLabel.setBounds(60, 33, 84, 13);
		MensesState.add(yjzqLabel);
		
		JComboBox yjzqComboBox = new JComboBox();
		yjzqComboBox.setModel(new DefaultComboBoxModel(new String[] {"40", "39", "38", "37", "36", "35", "34", "33", "32", "31", "30", "29", "28", "27", "26", "25", "24", "23", "22", "21", "20", "19", "18"}));
		yjzqComboBox.setSelectedIndex(10);
		yjzqComboBox.setBounds(134, 28, 63, 22);
		MensesState.add(yjzqComboBox);
		
		JLabel dycyjLabel = new JLabel("第一次月经是：");
		dycyjLabel.setBounds(60, 104, 100, 13);
		MensesState.add(dycyjLabel);
		
		JComboBox dycyjComboBox = new JComboBox();
		dycyjComboBox.setModel(new DefaultComboBoxModel(new String[] {"10岁", "11岁", "12岁", "13岁", "14岁", "15岁", "16岁", "17岁", "18岁", "19岁", "20岁", "21岁", "22岁", "23岁", "24岁", "25岁", "26岁"}));
		dycyjComboBox.setSelectedIndex(5);
		dycyjComboBox.setBounds(153, 99, 54, 22);
		MensesState.add(dycyjComboBox);
		
		JLabel yjjtgjLabel = new JLabel("月经几天干净：");
		yjjtgjLabel.setBounds(60, 56, 100, 15);
		MensesState.add(yjjtgjLabel);
		
		JComboBox yjjtgjComboBox = new JComboBox();
		yjjtgjComboBox.setModel(new DefaultComboBoxModel(new String[] {"3", "4", "5", "6", "7", "8", "9"}));
		yjjtgjComboBox.setBounds(153, 52, 54, 23);
		MensesState.add(yjjtgjComboBox);
		
		JLabel yjlLabel = new JLabel("月经量：");
		yjlLabel.setBounds(220, 57, 58, 15);
		MensesState.add(yjlLabel);
		
		JComboBox yjlComboBox = new JComboBox();
		yjlComboBox.setModel(new DefaultComboBoxModel(new String[] {"20ml以下", "30ml-50ml", "50ml-60ml", "60ml-80ml", "80ml以上"}));
		yjlComboBox.setBounds(291, 52, 84, 23);
		MensesState.add(yjlComboBox);
		
		JLabel bcyjsjLabel = new JLabel("末次月经时间：");
		bcyjsjLabel.setBounds(60, 81, 100, 15);
		MensesState.add(bcyjsjLabel);
		
		JCheckBox yjljsCheckBox = new JCheckBox("月经量减少");
		yjljsCheckBox.setBackground(Color.WHITE);
		yjljsCheckBox.setBounds(60, 123, 109, 23);
		MensesState.add(yjljsCheckBox);
		
		JLabel jslLabel = new JLabel("减少量：");
		jslLabel.setBounds(220, 130, 58, 15);
		MensesState.add(jslLabel);
		jslLabel.setVisible(false);
		
		JComboBox jslComboBox = new JComboBox();
		jslComboBox.setModel(new DefaultComboBoxModel(new String[] {"5ml", "10ml", "15ml", "20ml", "25ml", "30ml", "35ml", "40ml"}));
		jslComboBox.setBounds(291, 126, 63, 23);
		MensesState.add(jslComboBox);
		jslComboBox.setVisible(false);
		
		JLabel kssjLabel = new JLabel("开始时间：");
		kssjLabel.setBounds(375, 130, 76, 15);
		MensesState.add(kssjLabel);
		kssjLabel.setVisible(false);
		
		JComboBox kssjComboBox = new JComboBox();
		kssjComboBox.setModel(new DefaultComboBoxModel(new String[] {"1个月前", "2个月前", "3个月前", "4个月前", "5个月前", "6个月前", "7个月前", "8个月前", "9个月前", "10个月前", "11个月前", "12个月前"}));
		kssjComboBox.setBounds(449, 126, 84, 23);
		MensesState.add(kssjComboBox);
		kssjComboBox.setVisible(false);
	
		yjljsCheckBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				JCheckBox jcb = (JCheckBox) arg0.getItem();
		        if (jcb.isSelected()) {
		        	jslLabel.setVisible(true);
		        	jslComboBox.setVisible(true);
		        	kssjLabel.setVisible(true);
		        	kssjComboBox.setVisible(true);
		        } else {
		        	jslLabel.setVisible(false);
		        	jslComboBox.setVisible(false);
		        	kssjLabel.setVisible(false);
		        	kssjComboBox.setVisible(false);
		        } 
			}
		});
		
		JComboBox mcyjncomboBox = new JComboBox();
		mcyjncomboBox.setModel(new DefaultComboBoxModel(new String[] {"2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033"}));
		mcyjncomboBox.setSelectedIndex(2);
		mcyjncomboBox.setBounds(153, 77, 54, 23);
		MensesState.add(mcyjncomboBox);
		
		JComboBox mcyjyComboBox = new JComboBox();
		mcyjyComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		mcyjyComboBox.setBounds(214, 77, 54, 23);
		MensesState.add(mcyjyComboBox);
		
		JComboBox mcyjrComboBox = new JComboBox();
		mcyjrComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		mcyjrComboBox.setBounds(278, 77, 54, 23);
		MensesState.add(mcyjrComboBox);
		
		JPanel AllergyHistory = new JPanel();
		AllergyHistory.setBackground(Color.WHITE);
		AllergyHistory.setBounds(12, 527, 612, 88);
		contentPane.add(AllergyHistory);
		AllergyHistory.setLayout(null);
		
		JLabel gmsLabel = new JLabel("过敏史");
		gmsLabel.setBounds(0, 33, 39, 13);
		AllergyHistory.add(gmsLabel);
		
		JScrollPane gmsScrollPane = new JScrollPane();
		gmsScrollPane.setBounds(50, 0, 562, 88);
		AllergyHistory.add(gmsScrollPane);
		
		JTextArea gmsTextArea = new JTextArea();
		gmsTextArea.setLineWrap(true);
		gmsTextArea.setText("例如：头孢类，青霉素过敏等");
		gmsScrollPane.setViewportView(gmsTextArea);
		
		gmsTextArea.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(gmsTextArea.getText().equals("例如：头孢类，青霉素过敏等")) {
					gmsTextArea.setText("");
				}				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(gmsTextArea.getText().length()<1) {
					gmsTextArea.setText("例如：头孢类，青霉素过敏等");
				}
			}
			
			
		});
		
		JPanel FamilyState = new JPanel();
		FamilyState.setBackground(Color.WHITE);
		FamilyState.setBounds(12, 627, 612, 81);
		contentPane.add(FamilyState);
		FamilyState.setLayout(null);
		
		JScrollPane jzsScrollPane = new JScrollPane();
		jzsScrollPane.setBounds(48, 0, 564, 81);
		FamilyState.add(jzsScrollPane);
		
		
		JTextArea jzsTextArea = new JTextArea();
		jzsTextArea.setLineWrap(true);
		jzsTextArea.setText("例如：家族性遗传病，父母有无高血压病，糖尿病，高血脂，脑梗等;有无近亲结婚史");
		jzsTextArea.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(jzsTextArea.getText().equals("例如：家族性遗传病，父母有无高血压病，糖尿病，高血脂，脑梗等;有无近亲结婚史")) {
					jzsTextArea.setText("");
				}				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(jzsTextArea.getText().length()<1) {
					jzsTextArea.setText("例如：家族性遗传病，父母有无高血压病，糖尿病，高血脂，脑梗等;有无近亲结婚史");
				}
			}
			
			
		});
		
		jzsScrollPane.setViewportView(jzsTextArea);
		
		JLabel jzsLabel = new JLabel("家族史");
		jzsLabel.setBounds(0, 10, 38, 48);
		FamilyState.add(jzsLabel);
		
		RButton backButton = new RButton("返回");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FirstMenu();
				dispose();
			}
		});
		backButton.setBounds(646, 705, 97, 23);
		contentPane.add(backButton);
		
		JPanel PastHistory = new JPanel();
		PastHistory.setBackground(Color.WHITE);
		PastHistory.setBounds(636, 285, 518, 237);
		contentPane.add(PastHistory);
		PastHistory.setLayout(null);
		
		JLabel jwsLabel = new JLabel("既往史");
		jwsLabel.setBounds(12, 112, 39, 13);
		PastHistory.add(jwsLabel);
		
		JRadioButton gxyRadioButton = new JRadioButton("高血压");
		gxyRadioButton.setBackground(Color.WHITE);
		gxyRadioButton.setBounds(124, 8, 153, 21);
		PastHistory.add(gxyRadioButton);
		
		JRadioButton tnbRadioButton = new JRadioButton("糖尿病");
		tnbRadioButton.setBackground(Color.WHITE);
		tnbRadioButton.setBounds(124, 51, 153, 21);
		PastHistory.add(tnbRadioButton);
		
		JRadioButton jzxjbRadioButton = new JRadioButton("甲状腺疾病");
		jzxjbRadioButton.setBackground(Color.WHITE);
		jzxjbRadioButton.setBounds(124, 85, 153, 21);
		PastHistory.add(jzxjbRadioButton);
		
		JRadioButton jqjhRadioButton = new JRadioButton("近亲结婚");
		jqjhRadioButton.setBackground(Color.WHITE);
		jqjhRadioButton.setBounds(124, 125, 153, 21);
		PastHistory.add(jqjhRadioButton);
		
		JRadioButton myxtjbRadioButton = new JRadioButton("免疫系统疾病");
		myxtjbRadioButton.setBackground(Color.WHITE);
		myxtjbRadioButton.setBounds(124, 158, 153, 21);
		PastHistory.add(myxtjbRadioButton);
		
		JRadioButton jchxzjjdpRadioButton = new JRadioButton("接触化学制剂及毒品");
		jchxzjjdpRadioButton.setBackground(Color.WHITE);
		jchxzjjdpRadioButton.setBounds(124, 181, 153, 21);
		PastHistory.add(jchxzjjdpRadioButton);
		
		JRadioButton gxzRadioButton = new JRadioButton("高血脂");
		gxzRadioButton.setBackground(Color.WHITE);
		gxzRadioButton.setBounds(124, 204, 153, 21);
		PastHistory.add(gxzRadioButton);
		
		JTextArea qtjbTextArea = new JTextArea();
		qtjbTextArea.setLineWrap(true);
		qtjbTextArea.setBounds(322, 50, 184, 175);
		qtjbTextArea.setBorder(new LineBorder(new java.awt.Color(127,157,185), 1, false));
		PastHistory.add(qtjbTextArea);
		
		JLabel qtjbLabel = new JLabel("其他疾病(备注)");
		qtjbLabel.setBounds(335, 12, 122, 13);
		PastHistory.add(qtjbLabel);
		
		JPanel OperationHistory = new JPanel();
		OperationHistory.setBackground(Color.WHITE);
		OperationHistory.setBounds(636, 527, 518, 181);
		contentPane.add(OperationHistory);
		OperationHistory.setLayout(null);
		
		JLabel operationHistoryLabel = new JLabel("手术史");
		operationHistoryLabel.setBounds(12, 76, 63, 13);
		OperationHistory.add(operationHistoryLabel);
		
		JScrollPane operationHistoryScrollPane = new JScrollPane();
		operationHistoryScrollPane.setBounds(82, 0, 436, 181);
		OperationHistory.add(operationHistoryScrollPane);
		
		JTextArea shsTextArea = new JTextArea();		
		shsTextArea.setLineWrap(true);
		operationHistoryScrollPane.setViewportView(shsTextArea);
		shsTextArea.setText("例如：宫腔镜，腹腔镜，开腹手术，输卵");
		
		shsTextArea.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(shsTextArea.getText().equals("例如：宫腔镜，腹腔镜，开腹手术，输卵")) {
					shsTextArea.setText("");
				}				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(shsTextArea.getText().length()<1) {
					shsTextArea.setText("例如：宫腔镜，腹腔镜，开腹手术，输卵");
				}
			}
			
			
		});
		RButton saveButton = new RButton("保存");
		saveButton.setBackground(Color.GREEN);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * 获取表单内容 并 打印
				 */
				name = nameTextField.getText();
				tel = telephoneTextField.getText();
				height = (String)heightComboBox.getSelectedItem();
				weight = (String)weightComboBox.getSelectedItem();
				/*过敏史+家族史+手术史*/
				gmString = gmsTextArea.getText();
				jzString = jzsTextArea.getText();
				operationHistoryString = shsTextArea.getText();
				
				
				/*与既往史有关的变量*/
				if(gxyRadioButton.isSelected()) {
					gxyString = "高血压";
				}
				if(tnbRadioButton.isSelected()) {
					tnbString = "糖尿病";
				}
				if(jzxjbRadioButton.isSelected()) {
					jzxjbString = "甲状腺疾病";
				}
				if(jqjhRadioButton.isSelected()) {
					jqjhString = "近亲结婚";
				}
				if(myxtjbRadioButton.isSelected()) {
					myxtjbString = "免疫系统疾病";
				}
				if(jchxzjjdpRadioButton.isSelected()) {
					jchxzhhdpString = "接触化学制剂及毒品";
				}
				if(gxzRadioButton.isSelected()) {
					gxzString = "高血脂";
				}
				qtjbString = qtjbTextArea.getText();
				
				
				/*与怀孕情况有关的变量*/
				
				csString = (String)hyqkTable.getValueAt(1, 0);
				sjString = (String)hyqkTable.getValueAt(1, 1);
				zrsyString = (String)hyqkTable.getValueAt(1, 2);
				fzszString = (String)hyqkTable.getValueAt(1, 3);
				yzString = (String)hyqkTable.getValueAt(1, 4);
				yzjhString = (String)hyqkTable.getValueAt(1, 5);
				tyString = (String)hyqkTable.getValueAt(1, 6);
				txString = (String)hyqkTable.getValueAt(1, 7);
				jhString = (String)hyqkTable.getValueAt(1, 8);
				btqkString = (String)hyqkTable.getValueAt(1, 9);
				qgString = (String)hyqkTable.getValueAt(1, 10);
				bzString = (String)hyqkTable.getValueAt(1, 11);
				
				/*婚育情况*/
				zdlcString = zdlcCheckBox.getText();
				zdlccsString = (String)zdlccsComboBox.getSelectedItem();
				mqzhString = mqzhCheckBox.getText();
				pozhString = pozhCheckBox.getText();
				yznString = yznCheckBox.getText();
				
				/*有关月经情况的变量*/
				yjbglString = yjbglCheckBox.getText();
				yjzqString = (String)yjzqComboBox.getSelectedItem();
				zdtsString = (String)zdtsComboBox.getSelectedItem();
				zctsString = (String)zctsComboBox.getSelectedItem();
				yjjtgjString = (String)yjjtgjComboBox.getSelectedItem();
				yjlString = (String)yjlComboBox.getSelectedItem();
				mcyjsjString = (String)mcyjncomboBox.getSelectedItem()+(String)mcyjyComboBox.getSelectedItem()+(String)mcyjrComboBox.getSelectedItem();
				dycyjString = (String)dycyjComboBox.getSelectedItem();
				yjljsString = yjljsCheckBox.getText();
				jslyjString = (String)jslComboBox.getSelectedItem();
				kssjString = (String)kssjComboBox.getSelectedItem();
				JOptionPane.showMessageDialog(null, name+"\n"+tel+"\n"+height+"\n"+weight);
				
				Access.insert(tel, name, tel, height, weight);				
				
			}
		});
		saveButton.setBounds(485, 706, 104, 23);
		contentPane.add(saveButton);
		
		
		
	}
	
}
