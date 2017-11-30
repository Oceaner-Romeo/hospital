package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Query extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Query frame = new Query();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Query() {
		setAlwaysOnTop(true);
		setTitle("\u68C0\u9A8C\u62A5\u544A");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 984, 977);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("\u59D3\u540D\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 15));
		label_1.setBounds(48, 30, 54, 15);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("\u7535\u8BDD\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel.setBounds(204, 30, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("\u8EAB\u9AD8\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 15));
		label_2.setBounds(663, 35, 45, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u4F53\u91CD\uFF1A");
		label_3.setBounds(822, 35, 42, 15);
		contentPane.add(label_3);
		
		JLabel lblNewLabel_1 = new JLabel("\u674E\u6587\u5A77");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 20));
		lblNewLabel_1.setBounds(92, 24, 71, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_4 = new JLabel("179 8664 2451");
		label_4.setFont(new Font("宋体", Font.BOLD, 20));
		label_4.setBounds(254, 25, 152, 21);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("174");
		label_5.setFont(new Font("宋体", Font.BOLD, 20));
		label_5.setBounds(718, 30, 54, 21);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("55");
		label_6.setFont(new Font("宋体", Font.BOLD, 20));
		label_6.setBounds(874, 30, 50, 21);
		contentPane.add(label_6);
		
		JLabel label_8 = new JLabel("\u75C5\u4EBA\u7F16\u53F7\uFF1A");
		label_8.setFont(new Font("宋体", Font.PLAIN, 14));
		label_8.setBounds(77, 882, 86, 22);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("10101110");
		label_9.setFont(new Font("宋体", Font.PLAIN, 14));
		label_9.setBounds(184, 882, 74, 23);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("\u62A5\u544A\u65E5\u671F\uFF1A");
		label_10.setFont(new Font("宋体", Font.PLAIN, 14));
		label_10.setBounds(710, 883, 83, 21);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("2017\u5E7410\u67081\u65E5");
		label_11.setFont(new Font("宋体", Font.BOLD, 14));
		label_11.setBounds(803, 882, 104, 23);
		contentPane.add(label_11);
		
		JButton button = new JButton("\u5173\u95ED");
		button.setFont(new Font("宋体", Font.BOLD, 15));
		button.setBounds(443, 899, 93, 29);
		contentPane.add(button);
		
		JLabel label_12 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label_12.setBounds(15, 106, 943, 15);
		contentPane.add(label_12);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(18, 75, 920, 32);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_13 = new JLabel("\u6000\u5B55\u6B21\u6570");
		label_13.setFont(new Font("宋体", Font.BOLD, 15));
		label_13.setBounds(10, 10, 74, 15);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("\u65F6\u95F4");
		label_14.setFont(new Font("宋体", Font.BOLD, 15));
		label_14.setBounds(85, 10, 54, 15);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("\u8F85\u52A9\u751F\u6B96");
		label_15.setFont(new Font("宋体", Font.BOLD, 15));
		label_15.setBounds(134, 10, 75, 15);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("\u5B55\u5468");
		label_16.setFont(new Font("宋体", Font.BOLD, 15));
		label_16.setBounds(219, 11, 54, 15);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("\u5B55\u56CA");
		label_17.setFont(new Font("宋体", Font.BOLD, 15));
		label_17.setBounds(272, 10, 54, 15);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("\u80CE\u82BD");
		label_18.setFont(new Font("宋体", Font.BOLD, 15));
		label_18.setBounds(318, 10, 54, 15);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("\u80CE\u5FC3");
		label_19.setFont(new Font("宋体", Font.BOLD, 15));
		label_19.setBounds(365, 10, 54, 15);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("\u89C1\u7EA2");
		label_20.setFont(new Font("宋体", Font.BOLD, 15));
		label_20.setBounds(426, 10, 54, 15);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("\u836F\u7269");
		label_21.setFont(new Font("宋体", Font.BOLD, 15));
		label_21.setBounds(490, 10, 54, 15);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("\u6E05\u5BAB");
		label_22.setFont(new Font("宋体", Font.BOLD, 15));
		label_22.setBounds(649, 10, 54, 15);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("\u5907\u6CE8");
		label_23.setFont(new Font("宋体", Font.BOLD, 15));
		label_23.setBounds(799, 10, 54, 15);
		panel.add(label_23);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(15, 131, 923, 32);
		contentPane.add(panel_1);
		
		JLabel label_24 = new JLabel("1");
		label_24.setFont(new Font("宋体", Font.PLAIN, 14));
		label_24.setBounds(21, 10, 22, 15);
		panel_1.add(label_24);
		
		JLabel label_25 = new JLabel("2017-1-1");
		label_25.setFont(new Font("宋体", Font.PLAIN, 14));
		label_25.setBounds(53, 10, 71, 15);
		panel_1.add(label_25);
		
		JLabel lblAi = new JLabel("AI");
		lblAi.setFont(new Font("宋体", Font.PLAIN, 14));
		lblAi.setBounds(134, 10, 54, 15);
		panel_1.add(lblAi);
		
		JLabel label_27 = new JLabel("35");
		label_27.setFont(new Font("宋体", Font.PLAIN, 14));
		label_27.setBounds(219, 11, 54, 15);
		panel_1.add(label_27);
		
		JLabel label_28 = new JLabel("");
		label_28.setFont(new Font("宋体", Font.PLAIN, 14));
		label_28.setBounds(272, 10, 54, 15);
		panel_1.add(label_28);
		
		JLabel label_29 = new JLabel("\u80CE\u82BD");
		label_29.setFont(new Font("宋体", Font.PLAIN, 14));
		label_29.setBounds(318, 10, 54, 15);
		panel_1.add(label_29);
		
		JLabel label_30 = new JLabel("\u80CE\u5FC3");
		label_30.setFont(new Font("宋体", Font.PLAIN, 14));
		label_30.setBounds(365, 10, 54, 15);
		panel_1.add(label_30);
		
		JLabel label_31 = new JLabel("");
		label_31.setFont(new Font("宋体", Font.PLAIN, 14));
		label_31.setBounds(435, 10, 54, 15);
		panel_1.add(label_31);
		
		JLabel label_32 = new JLabel("\u5B55\u916E\u5236\u5242+\u9EC4\u94DC\u4F53+\u8FBE\u8299\u901A");
		label_32.setFont(new Font("宋体", Font.PLAIN, 14));
		label_32.setBounds(499, 10, 170, 15);
		panel_1.add(label_32);
		
		JLabel label_33 = new JLabel("\u6E05\u5BAB");
		label_33.setFont(new Font("宋体", Font.PLAIN, 14));
		label_33.setBounds(679, 10, 54, 15);
		panel_1.add(label_33);
		
		JLabel label_34 = new JLabel("\u8FC7\u654F");
		label_34.setFont(new Font("宋体", Font.PLAIN, 14));
		label_34.setBounds(743, 10, 170, 15);
		panel_1.add(label_34);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(15, 162, 923, 32);
		contentPane.add(panel_2);
		
		JLabel label_35 = new JLabel("2");
		label_35.setFont(new Font("宋体", Font.PLAIN, 14));
		label_35.setBounds(21, 10, 27, 15);
		panel_2.add(label_35);
		
		JLabel label_36 = new JLabel("2017-2-3");
		label_36.setFont(new Font("宋体", Font.PLAIN, 14));
		label_36.setBounds(54, 10, 70, 15);
		panel_2.add(label_36);
		
		JLabel lblIvfet = new JLabel("IVF-ET");
		lblIvfet.setFont(new Font("宋体", Font.PLAIN, 14));
		lblIvfet.setBounds(134, 10, 54, 15);
		panel_2.add(lblIvfet);
		
		JLabel label_38 = new JLabel("36");
		label_38.setFont(new Font("宋体", Font.PLAIN, 14));
		label_38.setBounds(219, 11, 54, 15);
		panel_2.add(label_38);
		
		JLabel label_39 = new JLabel("\u5B55\u56CA");
		label_39.setFont(new Font("宋体", Font.PLAIN, 14));
		label_39.setBounds(272, 10, 54, 15);
		panel_2.add(label_39);
		
		JLabel label_40 = new JLabel("");
		label_40.setFont(new Font("宋体", Font.PLAIN, 14));
		label_40.setBounds(318, 10, 54, 15);
		panel_2.add(label_40);
		
		JLabel label_41 = new JLabel("");
		label_41.setFont(new Font("宋体", Font.PLAIN, 14));
		label_41.setBounds(365, 10, 54, 15);
		panel_2.add(label_41);
		
		JLabel label_42 = new JLabel("");
		label_42.setFont(new Font("宋体", Font.PLAIN, 14));
		label_42.setBounds(435, 10, 54, 15);
		panel_2.add(label_42);
		
		JLabel label_43 = new JLabel("\u4EBA\u8840\u514D\u75AB\u7403\u86CB\u767D+\u963F\u53F8\u5339\u6797");
		label_43.setFont(new Font("宋体", Font.PLAIN, 14));
		label_43.setBounds(499, 10, 186, 15);
		panel_2.add(label_43);
		
		JLabel label_44 = new JLabel("\u6E05\u5BAB");
		label_44.setFont(new Font("宋体", Font.PLAIN, 14));
		label_44.setBounds(677, 10, 54, 15);
		panel_2.add(label_44);
		
		JLabel label_45 = new JLabel("\u65E0\u5F02\u5E38");
		label_45.setFont(new Font("宋体", Font.PLAIN, 14));
		label_45.setBounds(741, 10, 172, 15);
		panel_2.add(label_45);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(15, 191, 923, 32);
		contentPane.add(panel_3);
		
		JLabel label_46 = new JLabel("3");
		label_46.setFont(new Font("宋体", Font.PLAIN, 14));
		label_46.setBounds(22, 10, 31, 15);
		panel_3.add(label_46);
		
		JLabel label_47 = new JLabel("2017-5-5");
		label_47.setFont(new Font("宋体", Font.PLAIN, 14));
		label_47.setBounds(55, 10, 69, 15);
		panel_3.add(label_47);
		
		JLabel lblIcsi = new JLabel("ICSI");
		lblIcsi.setFont(new Font("宋体", Font.PLAIN, 14));
		lblIcsi.setBounds(134, 10, 54, 15);
		panel_3.add(lblIcsi);
		
		JLabel label_49 = new JLabel("40");
		label_49.setFont(new Font("宋体", Font.PLAIN, 14));
		label_49.setBounds(219, 11, 54, 15);
		panel_3.add(label_49);
		
		JLabel label_50 = new JLabel("");
		label_50.setFont(new Font("宋体", Font.PLAIN, 14));
		label_50.setBounds(272, 10, 54, 15);
		panel_3.add(label_50);
		
		JLabel label_51 = new JLabel("");
		label_51.setFont(new Font("宋体", Font.PLAIN, 14));
		label_51.setBounds(318, 10, 54, 15);
		panel_3.add(label_51);
		
		JLabel label_52 = new JLabel("\u80CE\u5FC3");
		label_52.setFont(new Font("宋体", Font.PLAIN, 14));
		label_52.setBounds(365, 10, 54, 15);
		panel_3.add(label_52);
		
		JLabel label_53 = new JLabel("\u89C1\u7EA2");
		label_53.setFont(new Font("宋体", Font.PLAIN, 14));
		label_53.setBounds(433, 10, 54, 15);
		panel_3.add(label_53);
		
		JLabel label_54 = new JLabel("\u9EC4\u94DC\u4F53+\u8FBE\u8299\u901A");
		label_54.setFont(new Font("宋体", Font.PLAIN, 14));
		label_54.setBounds(497, 10, 187, 15);
		panel_3.add(label_54);
		
		JLabel label_55 = new JLabel("\u6E05\u5BAB");
		label_55.setFont(new Font("宋体", Font.PLAIN, 14));
		label_55.setBounds(676, 10, 54, 15);
		panel_3.add(label_55);
		
		JLabel label_56 = new JLabel("\u6B63\u5E38");
		label_56.setFont(new Font("宋体", Font.PLAIN, 14));
		label_56.setBounds(740, 10, 173, 15);
		panel_3.add(label_56);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(15, 221, 923, 32);
		contentPane.add(panel_4);
		
		JLabel label_57 = new JLabel("4");
		label_57.setFont(new Font("宋体", Font.PLAIN, 14));
		label_57.setBounds(22, 10, 28, 15);
		panel_4.add(label_57);
		
		JLabel label_58 = new JLabel("2017-9-10");
		label_58.setFont(new Font("宋体", Font.PLAIN, 14));
		label_58.setBounds(53, 10, 71, 15);
		panel_4.add(label_58);
		
		JLabel lblPgd = new JLabel("PGD");
		lblPgd.setFont(new Font("宋体", Font.PLAIN, 14));
		lblPgd.setBounds(134, 10, 54, 15);
		panel_4.add(lblPgd);
		
		JLabel label_60 = new JLabel("55");
		label_60.setFont(new Font("宋体", Font.PLAIN, 14));
		label_60.setBounds(219, 11, 54, 15);
		panel_4.add(label_60);
		
		JLabel label_61 = new JLabel("\u5B55\u56CA");
		label_61.setFont(new Font("宋体", Font.PLAIN, 14));
		label_61.setBounds(272, 10, 54, 15);
		panel_4.add(label_61);
		
		JLabel label_62 = new JLabel("\u80CE\u82BD");
		label_62.setFont(new Font("宋体", Font.PLAIN, 14));
		label_62.setBounds(318, 10, 54, 15);
		panel_4.add(label_62);
		
		JLabel label_63 = new JLabel("");
		label_63.setFont(new Font("宋体", Font.PLAIN, 14));
		label_63.setBounds(365, 10, 54, 15);
		panel_4.add(label_63);
		
		JLabel label_64 = new JLabel("\u89C1\u7EA2");
		label_64.setFont(new Font("宋体", Font.PLAIN, 14));
		label_64.setBounds(438, 10, 54, 15);
		panel_4.add(label_64);
		
		JLabel label_65 = new JLabel("\u65E0");
		label_65.setFont(new Font("宋体", Font.PLAIN, 14));
		label_65.setBounds(502, 10, 54, 15);
		panel_4.add(label_65);
		
		JLabel label_66 = new JLabel("\u6E05\u5BAB");
		label_66.setFont(new Font("宋体", Font.PLAIN, 14));
		label_66.setBounds(677, 10, 54, 15);
		panel_4.add(label_66);
		
		JLabel label_67 = new JLabel("\u4E0A\u8179\u4E0B\u6CC4");
		label_67.setFont(new Font("宋体", Font.PLAIN, 14));
		label_67.setBounds(741, 10, 172, 15);
		panel_4.add(label_67);
		
		JLabel label = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label.setBounds(15, 61, 943, 15);
		contentPane.add(label);
		
		JLabel label_7 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label_7.setBounds(15, 858, 943, 15);
		contentPane.add(label_7);
		
		JLabel label_37 = new JLabel("\u5A5A\u80B2\u60C5\u51B5");
		label_37.setFont(new Font("宋体", Font.PLAIN, 14));
		label_37.setBounds(78, 276, 56, 15);
		contentPane.add(label_37);
		
		JLabel label_48 = new JLabel("\u6D41\u4EA7\u8FC7");
		label_48.setFont(new Font("宋体", Font.PLAIN, 14));
		label_48.setBounds(156, 295, 54, 15);
		contentPane.add(label_48);
		
		JLabel label_59 = new JLabel("2\u6B21");
		label_59.setFont(new Font("宋体", Font.PLAIN, 14));
		label_59.setBounds(250, 295, 54, 15);
		contentPane.add(label_59);
		
		JLabel label_68 = new JLabel("\u518D\u5A5A");
		label_68.setFont(new Font("宋体", Font.PLAIN, 14));
		label_68.setBounds(156, 319, 54, 15);
		contentPane.add(label_68);
		
		JLabel label_69 = new JLabel("\u914D\u5076\u4E0D\u662F\u518D\u5A5A");
		label_69.setFont(new Font("宋体", Font.PLAIN, 14));
		label_69.setBounds(250, 320, 84, 15);
		contentPane.add(label_69);
		
		JLabel label_70 = new JLabel("\u65E0\u5B50\u5973");
		label_70.setFont(new Font("宋体", Font.PLAIN, 14));
		label_70.setBounds(397, 319, 54, 15);
		contentPane.add(label_70);
		
		JLabel label_72 = new JLabel("\u6708\u7ECF\u60C5\u51B5");
		label_72.setFont(new Font("宋体", Font.PLAIN, 14));
		label_72.setBounds(77, 370, 57, 15);
		contentPane.add(label_72);
		
		JLabel label_73 = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label_73.setBounds(48, 456, 910, 15);
		contentPane.add(label_73);
		
		JLabel label_74 = new JLabel("\u89C4\u5F8B");
		label_74.setFont(new Font("宋体", Font.PLAIN, 14));
		label_74.setBounds(159, 392, 54, 15);
		contentPane.add(label_74);
		
		JLabel label_75 = new JLabel("\u6708\u7ECF\u5468\u671F\uFF1A30\u5929");
		label_75.setFont(new Font("宋体", Font.PLAIN, 14));
		label_75.setBounds(234, 392, 100, 15);
		contentPane.add(label_75);
		
		JLabel label_76 = new JLabel("\u8FC7\u654F\u53F2");
		label_76.setFont(new Font("宋体", Font.PLAIN, 14));
		label_76.setBounds(80, 469, 54, 15);
		contentPane.add(label_76);
		
		JLabel label_77 = new JLabel("\u65E0");
		label_77.setFont(new Font("宋体", Font.PLAIN, 14));
		label_77.setBounds(80, 505, 54, 15);
		contentPane.add(label_77);
		
		JLabel label_79 = new JLabel("\u5BB6\u65CF\u53F2");
		label_79.setFont(new Font("宋体", Font.PLAIN, 14));
		label_79.setBounds(370, 469, 54, 15);
		contentPane.add(label_79);
		
		JLabel label_80 = new JLabel("\u8FD1\u4EB2\u7ED3\u5A5A");
		label_80.setFont(new Font("宋体", Font.PLAIN, 14));
		label_80.setBounds(370, 505, 115, 15);
		contentPane.add(label_80);
		
		JLabel label_81 = new JLabel("\u624B\u672F\u53F2");
		label_81.setFont(new Font("宋体", Font.PLAIN, 14));
		label_81.setBounds(684, 469, 54, 15);
		contentPane.add(label_81);
		
		JLabel label_82 = new JLabel("\u5BAB\u8154\u955C");
		label_82.setFont(new Font("宋体", Font.PLAIN, 14));
		label_82.setBounds(684, 505, 54, 15);
		contentPane.add(label_82);
		
		JLabel label_83 = new JLabel("\u65E2\u5F80\u53F2");
		label_83.setFont(new Font("宋体", Font.PLAIN, 14));
		label_83.setBounds(80, 654, 54, 15);
		contentPane.add(label_83);
		
		JLabel lblNewLabel_2 = new JLabel("\u9AD8\u8840\u538B");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(204, 676, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_84 = new JLabel("\u7CD6\u5C3F\u75C5");
		label_84.setFont(new Font("宋体", Font.PLAIN, 14));
		label_84.setBounds(321, 676, 54, 15);
		contentPane.add(label_84);
		
		JLabel label_85 = new JLabel("\u514D\u75AB\u7CFB\u7EDF\u75BE\u75C5");
		label_85.setFont(new Font("宋体", Font.PLAIN, 14));
		label_85.setBounds(413, 676, 115, 15);
		contentPane.add(label_85);
		
		JLabel label_86 = new JLabel("\u9AD8\u8840\u8102");
		label_86.setFont(new Font("宋体", Font.PLAIN, 14));
		label_86.setBounds(577, 676, 54, 15);
		contentPane.add(label_86);
		
		JLabel label_87 = new JLabel("\u5907\u6CE8");
		label_87.setFont(new Font("宋体", Font.PLAIN, 14));
		label_87.setBounds(159, 741, 54, 15);
		contentPane.add(label_87);
		
		JLabel label_26 = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label_26.setBounds(48, 637, 910, 15);
		contentPane.add(label_26);
		
		JLabel label_71 = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label_71.setBounds(48, 356, 910, 15);
		contentPane.add(label_71);
		
		JLabel label_78 = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label_78.setBounds(48, 263, 910, 15);
		contentPane.add(label_78);
		
		RButton tjhxgjlButton = new RButton("\u6DFB\u52A0\u6216\u4FEE\u6539\u8BB0\u5F55");
		tjhxgjlButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Menu frame = new Menu();
						frame.setVisible(true);
						dispose();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			}
		});
		tjhxgjlButton.setBounds(780, 803, 178, 30);
		contentPane.add(tjhxgjlButton);
	}
}
