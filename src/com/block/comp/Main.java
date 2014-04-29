/*
 * Main.java
 *
 * Created on __DATE__, __TIME__
 */

package com.block.comp;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.filechooser.FileFilter;

import com.block.model.service.DataService;
import com.block.model.service.ExcelService;
import com.block.model.sqlite.SQLiteOpenHelper;

/**
 *
 * @author  __USER__
 */
public class Main extends javax.swing.JFrame {

	/** Creates new form Main */
	public Main() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jList1 = new javax.swing.JList();
		jLabel1 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jComboBox2 = new javax.swing.JComboBox();
		jButton1 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jComboBox3 = new javax.swing.JComboBox();
		jComboBox4 = new javax.swing.JComboBox();
		jLabel4 = new javax.swing.JLabel();
		jComboBox5 = new javax.swing.JComboBox();
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton2 = new javax.swing.JButton();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem3 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		Connection conn = SQLiteOpenHelper.newInstance().getConnection("block");
		String sql = "select distinct fileName,importDate from block_data";
		String sql1 = "select distinct releaseDate from block_data";
		String sql2 = "select distinct releaseHour from block_data";
		Statement stmt = null;
		ResultSet rs = null;
		Statement stmt1 = null;
		ResultSet rs1 = null;
		Statement stmt2 = null;
		ResultSet rs2 = null;
		final List<String> result = new ArrayList<String>();
		Vector<String> releaseDate = new Vector<String>();
		Vector<String> releaseHour = new Vector<String>();
		releaseDate.add("选择日期");
		releaseHour.add("选择时间");
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			stmt1 = conn.createStatement();
			rs1 = stmt1.executeQuery(sql1);
			stmt2 = conn.createStatement();
			rs2 = stmt2.executeQuery(sql2);
			while (rs.next()) {
				result.add(rs.getString(2) + " " + rs.getString(1));
			}
			while (rs1.next()) {
				releaseDate.add(rs1.getString(1));
			}
			while (rs2.next()) {
				releaseHour.add(rs2.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs2 != null) {
					rs2.close();
					rs2 = null;
				}
				if (rs1 != null) {
					rs1.close();
					rs1 = null;
				}
				if (stmt2 != null) {
					stmt2.close();
					stmt2 = null;
				}
				if (stmt1 != null) {
					stmt1.close();
					stmt1 = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		jList1.setModel(new javax.swing.AbstractListModel() {
			String[] strings = { "", "", "" };

			public int getSize() {
				return result.size();
			}

			public Object getElementAt(int i) {
				return result.get(i);
			}
		});
		jScrollPane1.setViewportView(jList1);

		jLabel1.setText("\u5f00\u59cb\u65f6\u95f4: ");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
			releaseDate ));

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(
				releaseDate ));

		jButton1.setText("\u5f00\u59cb\u8ba1\u7b97");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel2.setText("\u7ed3\u675f\u65f6\u95f4:");

		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(
				releaseHour ));

		jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(
			releaseHour ));

		jLabel4.setText("\u8ba1\u7b97\u5468\u671f:");

		jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"5分钟", "15分钟", "30分钟", "60分钟", "1天" }));
		jComboBox5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox5ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(17,
																				17,
																				17)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jButton1)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				jPanel1Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jLabel1)
																																						.addComponent(
																																								jLabel2))
																																		.addGap(13,
																																				13,
																																				13)
																																		.addGroup(
																																				jPanel1Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jComboBox2,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								jComboBox1,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.PREFERRED_SIZE))))
																										.addGap(18,
																												18,
																												18)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jComboBox4,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jComboBox3,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel4)
																										.addGap(18,
																												18,
																												18)
																										.addComponent(
																												jComboBox5,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																255,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												395,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jComboBox3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jComboBox2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jComboBox4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												16, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jComboBox5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton1)
										.addContainerGap()));

		jLabel3.setFont(new java.awt.Font("黑体", 0, 24));
		jLabel3.setText("\u8ba1\u7b97\u7ed3\u679c");

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane2.setViewportView(jTextArea1);

		jButton2.setText("\u5bfc\u51fa");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																113,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel2Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(
																				jButton2)
																		.addComponent(
																				jScrollPane2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				822,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(22, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												457,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton2)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jMenu1.setText("\u5bfc\u5165");

		jMenuItem1.setText("\u5bfc\u5165\u6570\u636e");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("\u8bbe\u7f6e");

		jMenuItem2.setText("\u8bbe\u7f6e\u53c2\u6570");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem2);

		jMenuBar1.add(jMenu2);

		jMenu3.setText("\u8ba1\u7b97");

		jMenuItem3.setText("\u5f00\u59cb\u8ba1\u7b97");
		jMenu3.add(jMenuItem3);

		jMenuBar1.add(jMenu3);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(16, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		this.jTextArea1.setText("");
		//1、罗列出所有参数
		//=========================================
		Map<String, String> args = DataService.getArgs();
		//一买开 == 一卖开
		double s1mkX1 = Double.parseDouble(args.get("01BP01").split(",")[0].split("=")[1].trim());
		double s1mkT = Double.parseDouble(args.get("01BP01").split(",")[1].split("=")[1].trim());
		double s1MkX1 = s1mkX1;
		double s1MkT = s1mkT;
		
		//二买开 = 二卖开
		double s2mkX2 = Double.parseDouble(args.get("02BP01").split("=")[1].trim());
		double s2MkX2 = s2mkX2;

		//三买开 = 三卖开
		double s3mkX3 = Double.parseDouble(args.get("03BP01").split("=")[1].trim());
		double s3MkX3 = s3mkX3;
		
		//四买开 = 四卖开
		double s4mkX2 = Double.parseDouble(args.get("04BP01").split(",")[0].split("=")[1].trim());
		double s4mkY2 = Double.parseDouble(args.get("04BP01").split(",")[1].split("=")[1].trim());
		double s4mkZ2 = Double.parseDouble(args.get("04BP01").split(",")[2].split("=")[1].trim());


		double s4MkX2 = s4mkX2;
		double s4MkY2 = s4mkY2;
		double s4MkZ2 = s4mkZ2;
		
		//五买开 = 五卖开
		double s5mkX1 = Double.parseDouble(args.get("05BP01").split(",")[0].split("=")[1].trim());
		double s5mkY1 = Double.parseDouble(args.get("05BP01").split(",")[1].split("=")[1].trim());
		double s5mkZ2 = Double.parseDouble(args.get("05BP01").split(",")[2].split("=")[1].trim());


		double s5MkX1 = s5mkX1;
		double s5MkY1 = s5mkY1;
		double s5MkZ2 = s5mkZ2;
		
		//一卖平01 = 一买平01
		double s1Mp01X1 = Double.parseDouble(args.get("01SU01").split(",")[0].split("=")[1].trim());
		double s1Mp01Y1 = Double.parseDouble(args.get("01SU01").split(",")[1].split("=")[1].trim());


		double s1mp01X1 = s1Mp01X1;
		double s1mp01Y1 = s1Mp01Y1;
		
		//一卖平02 = 一买平02
		double s1Mp02X2 = Double.parseDouble(args.get("01SU02").split("=")[1].trim());

		double s1mp02X2 = s1Mp02X2;
		
		//二卖平01 == 二买平01
		double s2Mp01X2 = Double.parseDouble(args.get("02SU01").split(",")[0].split("=")[1].trim());
		double s2Mp01Y2 = Double.parseDouble(args.get("02SU01").split(",")[1].split("=")[1].trim());


		double s2mp01X2 = s2Mp01X2;
		double s2mp01Y2 = s2Mp01Y2;
		
		//二卖平02 == 二买平02
		double s2Mp02X1 = Double.parseDouble(args.get("02SU02").split("=")[1].trim());

		double s2mp02X1 = s2Mp02X1;
		
		//三卖平 == 三买平
		double s3MpX1 = Double.parseDouble(args.get("03SU01").split("=")[1].trim());

		double s3mpX1 = s3MpX1;
		
		//四卖平 == 四买平
		double s4MpX1 = Double.parseDouble(args.get("04SU01").split("=")[1].trim());

		double s4mpX1 = s4MpX1;
		
		//五卖平 == 五买平
		double s5MpX1 = Double.parseDouble(args.get("05SU01").split("=")[1].trim());

		double s5mpX1 = s5MpX1;
		//=========================================
		
		//获取总的周期数
		Connection conn4 = SQLiteOpenHelper.newInstance().getConnection("block");
		Statement stmt4 = null;
		ResultSet rs4 = null;
		String sql4 = "select count(id) from block_data where isLast=1";
		int totalCount = 0;
		try {
			stmt4 = conn4.createStatement();
			rs4 = stmt4.executeQuery(sql4);
			rs4.next();
			totalCount = rs4.getInt(1);
			if (rs4 != null) {
				rs4.close();
				rs4 = null;
			}
			if (stmt4 != null) {
				stmt4.close();
				stmt4 = null;
			}
			if (conn4 != null) {
				conn4.close();
				conn4 = null;
			}
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		
		System.out.println("总记录数：" + totalCount);
		//获取选择的时间范围
		
		String start = jComboBox1.getSelectedItem().toString();
		String end = jComboBox2.getSelectedItem().toString();
		
		//==================================================
		//相差天数 days
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		int days = 0;
		try {
			Date startDate = formatter.parse(start);
			Date endDate = formatter.parse(end);
			Calendar startC = Calendar.getInstance();
			startC.setTime(startDate);
			Calendar endC = Calendar.getInstance();
			endC.setTime(endDate);
			days = (int)((endC.getTimeInMillis() - startC.getTimeInMillis()) / 1000 / 60 / 60 / 24) + 1;
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		//=============================================
		
		//=============================================
		//建立平均值和周期的对应关系
		
		//注意：至少应该大于第一笔数据往后加T个周期的那一笔数据才可能有N值
		
		
		//问题在于怎么计算这最开始有N值的那一个周期呢
		//再查一次，找出周期、价格对应关系
		//默认升序排列
		//releaseDate_price ： 周期---价格对应关系
		Connection conn1 = SQLiteOpenHelper.newInstance().getConnection("block");
		Statement stmt1 = null;
		ResultSet rs1 = null;
		String sql1 = "select releaseDate,price from block_data where isLast=1 order by releaseDate";
		Map<String,Double> releaseDate_price = new LinkedHashMap<String, Double>();
		try {
			stmt1 = conn1.createStatement();
			rs1 = stmt1.executeQuery(sql1);
			while (rs1.next()) {
				releaseDate_price.put(rs1.getString(1), rs1.getDouble(2));
			}
		} catch (SQLException e3) {
			e3.printStackTrace();
		} finally {
			try {
				if (rs1 != null) {
					rs1.close();
					rs1 = null;
				}
				if (stmt1 != null) {
					stmt1.close();
					stmt1 = null;
				}
				if (conn1 != null) {
					conn1.close();
					conn1 = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		//================测试对应关系是否正确=======================
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("周期---价格对应关系");
		Set ks1 = releaseDate_price.keySet();
		Iterator<String> it1 = ks1.iterator();
		while (it1.hasNext()) {
			String k1 = it1.next();
			System.out.println(k1 + " : " + releaseDate_price.get(k1));
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		//================测试结束===============================
		
		//获取需要开始计算N值的开始周期
		String nStartDate = "";
		Set ks2 = releaseDate_price.keySet();
		Iterator<String> it2 = ks2.iterator();
		int flag2 = 0;
		while (it2.hasNext()) {
			String k2 = it2.next();
			if (flag2 == ((int)s1mkT - 1)) {
				nStartDate = k2;
				break;
			}
			flag2 ++;
		}
		System.out.println("nStartDate = " + nStartDate);
		
		//为releaseDate编号（编号依次增加）
		//使用一个永久变量记录开始计算N值的周期
		String start_N = new String(nStartDate);
		int nIndex = 0;
		Map<Integer,Map<String,Double>> serial_releaseDate_price = new LinkedHashMap<Integer, Map<String,Double>>();
		Set ks4 = releaseDate_price.keySet();
		Iterator<String> it4 = ks4.iterator();
		int flag4 = 0;
		while (it4.hasNext()) {
			Map<String,Double> temp = new HashMap<String, Double>();
			String k4 = it4.next();
			temp.put(k4, releaseDate_price.get(k4));
			serial_releaseDate_price.put(flag4, temp);
			if (k4.equals(nStartDate)) {
				nIndex = flag4;
			}
			flag4 ++;
		}
		
		System.out.println("nIndex=" + nIndex);
		
		
		//建立releaseDate和N值的关系
		Map<String,Double> releaseDate_N = new LinkedHashMap<String, Double>();
		int rNo = totalCount - (int)s1mkT + 1;
		for (int i=0;i<rNo;i++) {
			Set ks = serial_releaseDate_price.keySet();
			Iterator<Integer> it = ks.iterator();
			double sum = 0;
			for (int j=nIndex-1;j>=nIndex-(int)s1mkT+1;j--) {
				System.out.println("price = " + (Double)serial_releaseDate_price.get(j).values().toArray()[0]);
				sum += (Double)serial_releaseDate_price.get(j).values().toArray()[0];
			}
			System.out.println("sum=" + sum);
			System.out.println("T=" + s1mkT);
			releaseDate_N.put(nStartDate, sum / ((int)s1mkT - 1));
		
			System.out.println("--------" + nStartDate);
			nIndex ++;
			if (nIndex > totalCount-1) break;
			nStartDate = serial_releaseDate_price.get(nIndex).keySet().iterator().next();
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("releaseDate和N的对应关系");
		Set keySet = releaseDate_N.keySet();
		Iterator<String> it5 = keySet.iterator();
		while (it5.hasNext()) {
			String key = it5.next();
			System.out.println(key + " : " + releaseDate_N.get(key));
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++=+");
		//以上逻辑实现了周期和N值的对应关系
		
		/*String endTemp0 = new String(nStartDate);
		for (int i=0;i<days;i++) {
			Date endDate1 = null;
			try {
				endDate1 = formatter.parse(endTemp0);
			} catch (ParseException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			Calendar endC1 = Calendar.getInstance();
			endC1.setTime(endDate1);
			Calendar startC1 = Calendar.getInstance();
			Date startDate1 = new Date(endC1.getTimeInMillis() - (long)s1mkT * 24 * 60 * 60 * 1000);
			String startStr = formatter.format(startDate1);*/
		
			
			//建立平均值和周期关联，使用map
			/*Connection conn = SQLiteOpenHelper.newInstance().getConnection("block");
			String sql = "select price from block_data where releaseDate>='" + startStr + "' and releaseDate<='" + endTemp0 + "' and isLast=1";
			Statement stmt = null;
			ResultSet rs = null;
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				double sum = 0;
				while (rs.next()) {
					sum += rs.getDouble(1);
				}
				PeroidAvgMapping.MAP.put(endTemp0, sum / (s1mkT + 1 ));
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null) {
						rs.close();
						rs = null;
					}
					if (stmt != null) {
						stmt.close();
						stmt = null;
					}
					if (conn != null) {
						conn.close();
						conn = null;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				Date startDate = formatter.parse(endTemp0);
				Calendar startC = Calendar.getInstance();
				startC.setTime(startDate);
				startDate = new Date(startC.getTimeInMillis() + 24 * 60 * 60 * 1000);
				endTemp0 = formatter.format(startDate);
			} catch (ParseException e1) {
				e1.printStackTrace();}
		}
		//=============================================
		
		
		Map<String,Double> map = PeroidAvgMapping.MAP;
		Set keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			System.out.println(map.get(it.next()));
		}
		*/
		
		//=================================================
		//开始计算结果
		//用于存储计算结果
		StringBuilder result = new StringBuilder("");
		//查询一次，将所有结果缓存起来，方便下次使用
		//key对应依次递增的整数，Map中保存的是一个周期内对应的所有数据
		//List中保存的是一组组时间和价格数据，依次为时间、价格
		Map<Integer,Map<String,List<Object[]>>> data = new LinkedHashMap<Integer, Map<String,List<Object[]>>>();
		Connection conn10 = SQLiteOpenHelper.newInstance().getConnection("block");
		String sql10 = "select releaseTime,price from block_data where releaseDate='";
		Statement stmt10 = null;
		ResultSet rs10 = null;
		try {
			stmt10 = conn10.createStatement();
			Set ks10 = serial_releaseDate_price.keySet();
			Iterator<Integer> it10 = ks10.iterator();
			for (int j=0;j<totalCount;j++) {
				int k = it10.next();
				Map<String,Double> map = serial_releaseDate_price.get(k);
				String temp_releaseDate = map.keySet().iterator().next();
				sql10 = sql10 + temp_releaseDate + "'";
				List<Object[]> list = new ArrayList<Object[]>();
				rs10 = stmt10.executeQuery(sql10);
				
				while (rs10.next()) {
					Object[] obj = new Object[2];
					obj[0] = rs10.getObject(1);
					obj[1] = rs10.getObject(2);
					list.add(obj);
				}
				
				Map<String,List<Object[]>> value = new LinkedHashMap<String, List<Object[]>>();
				value.put(temp_releaseDate, list);
				data.put(j, value);
				sql10 = "select releaseTime,price from block_data where releaseDate='";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		/*//测试周期，价格集合对应关系是否正确
		Set ks11 = data.keySet();
		Iterator<Integer> it11 = ks11.iterator();
		while (it11.hasNext()) {
			int key = it11.next();
			Map<String,List<Object[]>> map = data.get(key);
			Set tks = map.keySet();
			Iterator<String> tit = tks.iterator();
			while (tit.hasNext()) {
				String tkey = tit.next();
				List<Object[]> list = map.get(tkey);
				for (Object[] tobj : list) {
					System.out.println("周期: " + tkey + " 时间:" + tobj[0] + " 价格：" + tobj[1]);
				}
			}
		}*/
		//=================================================
		
		//编号和周期对象关系
		Map<String,Integer> releaseDate_no = new LinkedHashMap<String, Integer>();
		Set srp_ks = serial_releaseDate_price.keySet();
		Iterator<Integer> srp_it = srp_ks.iterator();
		int nr_flag = 0;
		while (srp_it.hasNext()) {
			String sk = serial_releaseDate_price.get(nr_flag).keySet().iterator().next();
			System.out.println("sk = " + sk + ",index=" + nr_flag);
			releaseDate_no.put(sk ,nr_flag);
			nr_flag++;
			if (nr_flag > totalCount - 1) break;
		}
		
		//开始执行策略
		
		boolean after = after(start, start_N);
		String final_start_releaseDate = after ? start : start_N;
		
		System.out.println(final_start_releaseDate);
		int startIndex = releaseDate_no.get(final_start_releaseDate);
		int endIndex = releaseDate_no.get(end);
		
		System.out.println("startIndex = " + startIndex);
		System.out.println("endIndex = " + endIndex);
		

		
		for (int j=startIndex;j<=endIndex;j++) {
			//两种可能性：1、大于N + X1,2、小于N-X1
			//对应策略为一买开，一卖平02
			String rd = serial_releaseDate_price.get(j).keySet().iterator().next();
			Map<String,List<Object[]>> m =  data.get(j);
			
			List<Object[]> list = m.get(rd);
			Double tempN = releaseDate_N.get(rd);
			
			
			int entryCount = 0;
			
			double tempY1 = s1Mp01Y1;
			
		/*	String s4Mkstart = "";
			String s4Mkend = "";
			
			String s5mkstart = "";
			String s5mkend = "";*/
			
			int s4Mkstart = -1;
			int s4Mkend = -1;
			
			int s5mkstart = -1;
			int s5mkend = -1;
			
			for (int k=0;k<list.size();k++) {
				Object[] objs = list.get(k);
				String time = (String) objs[0];
				Double p = (Double) objs[1];
				
				//一个list其实代表一个周期，所以，可以进行适当匹配，一旦匹配到某一策略就进行下一次循环
			
				//一卖平01
				if (p >= tempN + s1Mp01X1 + s1Mp01Y1 * 0.8) {
					result.append("策略名称：一卖平01  策略编号: 01SU01 开仓时间：" + time + " 开仓价格：" + (tempN + s1Mp01X1 + s1Mp01Y1 * 0.8) + "\n");
					s1Mp01Y1 = s1Mp01Y1 * 2;
					s5mkstart = k;
					
					if (s5mkstart != -1 && s5mkend != -1) {
						int min = Math.min(s5mkstart, s5mkend);
						int max = Math.max(s5mkstart, s5mkend);
						
						List<Object[]> tempL1 = list.subList(min, max + 1);
						List<Double> tempL2 = new ArrayList<Double>();
						for (Object[] o : tempL1) {
							tempL2.add((Double)o[1]);
						}
						
						double maxPrice = maxPrice(tempL2);
						result.append("策略名称：五买开  策略编号: 05BP01  开仓时间：" + time + " 开仓价格：" + (maxPrice + s5mkZ2) + "\n");
						
					}
					
				//	continue;
				}
				//一买开
				if (p >= tempN + s1mkX1 && p < tempN + s1Mp01X1 + s1Mp01Y1 * 0.8) {
					result.append("策略名称：一买开  策略编号: 01BP01 开仓时间：" + time + " 开仓价格：" + (tempN + s1mkX1) + "\n");
					s5mkend = k;
					//continue;
				}
				//二买平02
				if (p >= tempN + s2mp02X1 && p < tempN + s1Mp01X1 + s1Mp01Y1 * 0.8) {
					result.append("策略名称：二买平02  策略编号: 02BU02  平仓时间：" + time + " 平仓价格：" + (tempN - s2mp02X1) + "\n");
					//continue;
				}
				//三买开
				if (p >= tempN + s3mkX3 && p < tempN + s1Mp01X1 + s1Mp01Y1 * 0.8 ) {
					result.append("策略名称：三买开  策略编号: 03BP01  平仓时间：" + time + " 平仓价格：" + (tempN + s3mkX3) + "\n");
					//continue;
				}
				//三买平
				if (p >= tempN + s3mpX1 && p < tempN + s1Mp01X1 + s1Mp01Y1 * 0.8) {
					result.append("策略名称：三买平  策略编号: 03BU01  平仓时间：" + time + " 平仓价格：" + (tempN + s3mpX1) + "\n");
					//continue;
				}
				//四买平
				if (p >= tempN + s4mpX1 && p < tempN + s1Mp01X1 + s1Mp01Y1 * 0.8) {
					result.append("策略名称：四买平  策略编号: 04BU01  平仓时间：" + time + " 平仓价格：" + (tempN + s4mpX1) + "\n");
					//continue;
				}
				//二买平01
				if (p <= tempN - s2mp01X2 - s2mp01Y2) {
					result.append("策略名称：二买平01  策略编号: 02BU01  平仓时间：" + time + " 平仓价格：" + (tempN - s2mp01X2 - s2mp01Y2) + "\n");
					s4Mkend = k;
					
					if (s4Mkend != -1 && s4Mkstart != -1) {
						int min = Math.min(s4Mkstart, s4Mkend);
						int max = Math.max(s4Mkstart, s4Mkend);
						
						List<Object[]> tempL1 = list.subList(min, max + 1);
						List<Double> tempL2 = new ArrayList<Double>();
						for (Object[] o : tempL1) {
							tempL2.add((Double)o[1]);
						}
						
						double minPrice = minPrice(tempL2);
						result.append("策略名称：四卖开  策略编号: 05BP01  开仓时间：" + time + " 开仓价格：" + (minPrice - s4MkZ2) + "\n");
					}
					//continue;
				}
				//一卖平02
				if (p <= tempN - s1mp02X2 && p > tempN - s2mp01X2 - s2mp01Y2) {
					result.append("策略名称：一卖平02  策略编号: 01SU02 开仓时间：" + time + " 平仓价格：" + (tempN - s1mp02X2) + "\n");
					result.append("策略名称：二卖开  策略编号: 02SP01 开仓时间：" + time + " 平仓价格：" + (tempN - s2MkX2) + "\n");
				//	continue;
				}
				//三卖平
				if (p <= tempN - s3MpX1 && p > tempN - s2mp01X2 - s2mp01Y2) {
					result.append("策略名称：三卖平  策略编号: 03SU01  平仓时间：" + time + " 平仓价格：" + (tempN - s3MpX1) + "\n");
					//continue;
				}
				//三卖开
				if (p <= tempN - s3MkX3 && p > tempN - s2mp01X2 - s2mp01Y2) {
					result.append("策略名称：三卖开  策略编号: 03SP01  开仓时间：" + time + " 平仓价格：" + (tempN - s3MkX3) + "\n");
					continue;
				}
				//五卖平
				if (p <= tempN - s5MpX1 && p > tempN - s2mp01X2 - s2mp01Y2) {
					result.append("策略名称：五卖开  策略编号: 05SU01  开仓时间：" + time + " 平仓价格：" + (tempN - s5MpX1) + "\n");
					continue;
				}
				//二卖开
				if (p < tempN - s2MkX2 && p > tempN - s2mp01X2 - s2mp01Y2) {
					result.append("策略名称：二卖开  策略编号: 02SP01  开仓时间：" + time + " 开仓价格：" + (tempN - s2MkX2) + "\n");
					s4Mkstart = k;
					continue;
				}
				
				
				
				jTextArea1.append(result.toString());
				result = new StringBuilder();
				//if (p <= tempN - )
			}
			
			s4Mkstart = -1;
			s4Mkend = -1;
			
			s5mkstart = -1;
			s5mkend = -1;
			s1Mp01Y1 = tempY1;
		}
		
		/*// ===================================================
		// 策略开始执行
		StringBuilder result = new StringBuilder("");
		//获取周期内数据
		String minSql = "select min(price) from block_data where releaseDate='";
		String maxSql = "select max(price) from block_data where releaseDate='";
		double minPrice = 0;
		double maxPrice = 0;
		Connection conn2 = SQLiteOpenHelper.newInstance().getConnection("block");
		Statement stmt2 = null;
		Statement stmt3 = null;
		ResultSet rs2 = null;
		ResultSet rs3 = null;
		String tempStart = new String(start);
		
		try {
			for (int i=0;i<days;i++) {
				minSql += tempStart + "'";
				maxSql += tempStart + "'";
				stmt2 = conn2.createStatement();
				stmt3 = conn2.createStatement();
				rs2 = stmt2.executeQuery(minSql);
				rs3 = stmt3.executeQuery(maxSql);
				rs2.next();
				rs3.next();
				minPrice = rs2.getDouble(1);
				maxPrice = rs3.getDouble(1);
			    minSql = "select min(price) from block_data where releaseDate='";
				maxSql = "select max(price) from block_data where releaseDate='";
			//	String endDateTemp = PeroidAv
			//	if (minPrice > )
				
				double N = PeroidAvgMapping.MAP.get(tempStart);
				
				if (maxPrice >= N + s1mkX1) {
					System.out.println("一买开 开仓点位：  " + (N + s1mkX1));
					
					result.append("时间：" + tempStart + " 策略名称：一买开 开仓点位：  " + (N + s1mkX1) + "\n");
					if (minPrice <= N + s1Mp01X1 + s1Mp01Y1 * 0.8) {
						System.out.println("一卖开01 开平仓点位：" + (N + s1Mp01X1 + s1Mp01Y1 * 0.8));
						result.append("时间：" + tempStart + " 策略名称：一卖开01  开仓点位：  " + (N + s1Mp01X1 + s1Mp01Y1 * 0.8) + "\n");
					}
				}
				
				if (maxPrice <= N - s1Mp02X2) {

					System.out.println("一卖平02  平仓点位： " + (N - s1Mp02X2));
					System.out.println("二卖开  开仓点位： " + (N - s2MkX2));
					
					result.append("时间：" + tempStart + " 策略名称：一卖平02 平仓点位：" +  (N - s1Mp02X2) + "\n");
					result.append("时间：" + tempStart + " 策略名称：二卖开  开仓点位：" +  (N - s1Mp02X2) + "\n");
					
					if (maxPrice < N - s2mp01X2 - s2mp01Y2) {
						System.out.println("二买平01 平仓点位：" + (N - s2mp01X2 - s2mp01Y2));
						result.append("时间：" + tempStart + " 策略名称：二买平01 平仓点位：" +  (N - s2mp01X2 - s2mp01Y2) + "\n");
					}
				}
				
				if (maxPrice >= N + s2mp02X1) {
					System.out.println("二买平02 平仓点位：" + (N + s2mp02X1));
					result.append("时间：" + tempStart + " 策略名称：二买平02 平仓点位：" +  (N + s2mp02X1) + "\n");
				}
				
				if (maxPrice <= N - s3MpX1) {
					System.out.println("三卖平  平仓点位：" + (N - s3MpX1));
					result.append("时间：" + tempStart + " 策略名称：三卖平  平仓点位：" +  (N - s3MpX1) + "\n");

				}
				
				if (maxPrice <= N - s3MkX3) {
					System.out.println("三卖开  开仓点位：" + (N - s3MkX3));
					result.append("时间：" + tempStart + " 策略名称：三卖开  开仓点位：" +  (N - s3MkX3) + "\n");

				}

				if (maxPrice >= N + s3mpX1) {
					result.append("时间：" + tempStart + " 策略名称：三买平  平仓点位：" +  (N + s3mpX1) + "\n");
				}
				
				if (maxPrice >= N + s4mpX1) {
					System.out.println("四买平  平仓点位： " + (N + s4mpX1));
					result.append("时间：" + tempStart + " 策略名称：四买平  平仓点位：" +  (N + s4mpX1) + "\n");

				}
				
				if (maxPrice <= N - s5MpX1) {
					System.out.println("五卖平  平仓点位： " + (N - s5MpX1));
					result.append("时间：" + tempStart + " 策略名称：五卖平  平仓点位：" +  (N - s5MpX1) + "\n");
				}
				
				Date startDate = null;
				try {
					startDate = formatter.parse(tempStart);
					Calendar startC = Calendar.getInstance();
					startC.setTime(startDate);
					startDate = new Date(startC.getTimeInMillis() + 24 * 60 * 60 * 1000);
					tempStart = formatter.format(startDate);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				s1Mp01Y1 += s1Mp01Y1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs2 != null) {
					rs2.close();
					rs2 = null;
				}
				if (rs3 != null) {
					rs3.close();
					rs3 = null;
				}
				if (stmt2 != null) {
					stmt2.close();
					stmt2 = null;
				}
				if (stmt3 != null) {
					stmt3.close();
					stmt3 = null;
				}
				if (conn2 != null) {
					conn2.close();
					conn2 = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		*/
		//jTextArea1.setText(result.toString());
		
	}
	
	//对比两个日期谁前谁后
	public boolean after(String date1,String date2) {
		int y1 = Integer.parseInt(date1.split("-")[0]);
		int m1 = Integer.parseInt(date1.split("-")[1]);
		int d1 = Integer.parseInt(date1.split("-")[2]);
			
		int y2 = Integer.parseInt(date2.split("-")[0]);
		int m2 = Integer.parseInt(date2.split("-")[1]);
		int d2 = Integer.parseInt(date2.split("-")[2]);
		
		if (y1 > y2) return true;
		if (y1 < y2) return false;
		if (y1 == y2) {
			if (m1 > m2) return true;
			if (m1 < m2) return false;
			if (m1 == m2) {
				if (d1 > d2) return true;
				if (d1 < d2) return false;
				return true;
			}
		}
		return true;
	}
	
	//计算集合中最大值和最小值
	public double minPrice(List<Double> list) {
		return Collections.min(list);
	}
	
	public double maxPrice(List<Double> list) {
		return Collections.max(list);
	}
	
	//将日期转换为毫秒数
	public long date2Mill(Date d) {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		return c.getTimeInMillis();
	}
	
	//将日期字符串转换为毫秒数
	public long string2Mill(String dateStr) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			return date2Mill(formatter.parse(dateStr));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	//将日期增加指定毫秒时间后返回当前时间
	public Date addTimeInMill(Date curr,long time) {
		long currTime = date2Mill(curr);
		Date d = new Date(currTime + time);
		return d;
	}
	
	//毫秒数转换为时间字符串
	public String mill2Date(long m) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date d = new Date(m);
		return formatter.format(d);
	}
	
	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		ArgsFrame af = new ArgsFrame(this, true);
		Connection conn = SQLiteOpenHelper.newInstance().getConnection("block");
		Statement stmt = null;
		String sql = "select * from block_args";
		ResultSet rs = null;
		String strategyName = "";
		String value = "";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				strategyName = rs.getString("strategyName");
				
				if (strategyName.equals("一买开")) {
					String temp = rs.getString("argsValue").trim();
					String[] arr = temp.split(",");
					String x1 = arr[0].split("=")[1];
					String t = arr[1].split("=")[1];
					af.getjTextField1().setText(x1);
					af.getjTextField37().setText(t);
				}
				if (strategyName.equals("二买开")) {
					String temp = rs.getString("argsValue").trim();
					String[] arr = temp.split(",");
					String x2 = arr[0].split("=")[1];
					af.getjTextField2().setText(x2);
				}
				if (strategyName.equals("三买开")) {
					String temp = rs.getString("argsValue").trim();
					String x3 = temp.split("=")[1];
					af.getjTextField3().setText(x3);
				}
				if (strategyName.equals("四买开")) {
					String temp = rs.getString("argsValue").trim();
					String[] arr = temp.split(",");
					String x2 = arr[0].split("=")[1];
					String y2 = arr[1].split("=")[1];
					String z2 = arr[2].split("=")[1];

					af.getjTextField4().setText(x2);
					af.getjTextField5().setText(y2);
					af.getjTextField6().setText(z2);
				}
				if (strategyName.equals("五买开")) {
					String temp = rs.getString("argsValue").trim();
					String[] arr = temp.split(",");
					String x1 = arr[0].split("=")[1];
					String y1 = arr[1].split("=")[1];
					String z2 = arr[2].split("=")[1];

					af.getjTextField7().setText(x1);
					af.getjTextField8().setText(y1);
					af.getjTextField9().setText(z2);
				}
				if (strategyName.equals("一卖平01")) {
					String temp = rs.getString("argsValue").trim();
					String[] arr = temp.split(",");
					String x1 = arr[0].split("=")[1];
					String y1 = arr[1].split("=")[1];

					af.getjTextField10().setText(x1);
					af.getjTextField11().setText(y1);

				}
				if (strategyName.equals("一卖平02")) {
					String temp = rs.getString("argsValue").trim();
					String x2 = temp.split("=")[1];

					af.getjTextField12().setText(x2);
				}
				if (strategyName.equals("二卖平01")) {
					String temp = rs.getString("argsValue").trim();
					String[] arr = temp.split(",");
					String x2 = arr[0].split("=")[1];
					String y2 = arr[1].split("=")[1];

					af.getjTextField13().setText(x2);
					af.getjTextField14().setText(y2);
				}
				if (strategyName.equals("二卖平02")) {
					String temp = rs.getString("argsValue").trim();
					String x2 = temp.split("=")[1];
					af.getjTextField15().setText(x2);
				}
				if (strategyName.equals("三卖平")) {
					String temp = rs.getString("argsValue").trim();
					String x2 = temp.split("=")[1];
					af.getjTextField16().setText(x2);
				}
				if (strategyName.equals("四卖平")) {
					String temp = rs.getString("argsValue").trim();
					String x2 = temp.split("=")[1];
					af.getjTextField17().setText(x2);
				}
				if (strategyName.equals("五卖平")) {
					String temp = rs.getString("argsValue").trim();
					String x2 = temp.split("=")[1];
					af.getjTextField18().setText(x2);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		af.setVisible(true);
	}

	private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		JFileChooser chooser = new JFileChooser("C:/");
		chooser.setDialogTitle("导入Excel数据");
		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		FileFilter filter = new FileFilter() {

			@Override
			public boolean accept(File file) {
				if (file.isFile()
						&& (file.getName().endsWith("xls") || file.getName()
								.endsWith("xlsx"))) {
					return true;
				}
				if (file.isDirectory())
					return true;
				return false;
			}

			@Override
			public String getDescription() {
				return "xls && xlsx";
			}
		};
		chooser.setFileFilter(filter);
		chooser.setAcceptAllFileFilterUsed(false);
		chooser.setApproveButtonText("导入");
		chooser.setMultiSelectionEnabled(true);
		int flag = chooser.showOpenDialog(this);
		if (flag == JFileChooser.APPROVE_OPTION) {
			final ProgressMonitor monitor = new ProgressMonitor(this, false);
			final JProgressBar progressBar = monitor.getjProgressBar1();
			progressBar.setMaximum(100);
			progressBar.setMinimum(0);

			final JLabel curr = monitor.getjLabel5();
			final JLabel rest = monitor.getjLabel6();
			final JLabel progress = monitor.getjLabel7();

			List<File> targetFiles = new ArrayList<File>();
			File[] selectedFiles = chooser.getSelectedFiles();
			for (int i = 0; i < selectedFiles.length; i++) {
				if (selectedFiles[i].isDirectory()) {
					String[] list = selectedFiles[i].list();
					for (String s : list) {
						System.out.println("s = " + s);
						if (s.endsWith("xls") || s.endsWith("xlsx")) {
							File f = new File(
									selectedFiles[i].getAbsolutePath() + "/"
											+ s);
							targetFiles.add(f);
						}
					}
				} else {
					if (selectedFiles[i].getName().endsWith("xls")
							|| selectedFiles[i].getName().endsWith("xlsx")) {
						targetFiles.add(selectedFiles[i]);
					}
				}
			}

			final File[] files = targetFiles.toArray(new File[] {});
			if (files != null && files.length > 0) {
				curr.setText(files[0].getAbsolutePath());
				rest.setText((files.length - 1) + "");
				progress.setText((int) (1.00 / files.length * 100) + "%");
				monitor.setVisible(true);
			}

			boolean isRemind = true;
			int res = -1;

			//final int inserted = -1;
			for (int i = 0; i < files.length; i++) {
				Connection queryConn = null;
				Statement queryStmt = null;
				ResultSet queryRs = null;
				String querySql = "select count(*) from block_data where fileName = '"
						+ files[i].getName() + "'";
				boolean hasImported = false;
				try {
					queryConn = SQLiteOpenHelper.newInstance().getConnection(
							"block");
					queryStmt = queryConn.createStatement();
					querySql = "select count(*) from block_data where fileName = '"
							+ files[i].getName() + "'";
					queryRs = queryStmt.executeQuery(querySql);
					queryRs.next();
					hasImported = queryRs.getInt(1) > 0 ? true : false;
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if (queryRs != null) {
							queryRs.close();
							queryRs = null;
						}
						if (queryStmt != null) {
							queryStmt.close();
							queryStmt = null;
						}
						if (queryConn != null) {
							queryConn.close();
							queryConn = null;
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

				Connection delConn = SQLiteOpenHelper.newInstance()
						.getConnection("block");
				Statement delStmt = null;
				String deleteSql = "delete from block_data where fileName='"
						+ files[i].getName() + "'";

				try {
					if (hasImported) {
						delStmt = delConn.createStatement();
						if (isRemind) {
							String[] options = new String[] { "重新导入", "略过",
									"全部重新导入", "全部略过" };
							res = JOptionPane.showOptionDialog(this, "已经导入同名文件"
									+ files[i].getName(), "提醒",
									JOptionPane.YES_NO_CANCEL_OPTION,
									JOptionPane.WARNING_MESSAGE, null, options,
									null);
						}
						if (res == 0) {
							delStmt.execute(deleteSql);
						}
						if (res == 1) {
							continue;
						}
						if (res == 2) {
							isRemind = false;
							delStmt.execute(deleteSql);
						}
						if (res == 3) {
							isRemind = false;
							continue;
						}
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if (delStmt != null) {
							delStmt.close();
							delStmt = null;
						}
						if (delConn != null) {
							delConn.close();
							delConn = null;
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

				final List<String[]> data = ExcelService.getData(files[i]
						.getAbsolutePath());
				final File file = files[i];
				final int p = (int) (((double) (i + 1) / files.length) * 100);
				final int r = (files.length - i - 1);
				new Thread(new Runnable() {
					@Override
					public void run() {
						/*	System.out.println("p = " + p);
							progressBar.setValue(p);
							curr.setText(file.getAbsolutePath());
							rest.setText(r + "");
							progress.setText(p + "%");
							//monitor.repaint();
							progressBar.updateUI();*/
						DataService.insert(data, "block", "block_data",
								file.getName());
						isInserted = true;
						System.out.println("insert");
						refresh();
					}
				}).start();
				/*	new Thread(new Runnable() {
						
						@Override
						public void run() {*/
				//if (isInserted = true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("p = " + p);
				progressBar.setValue(p);
				curr.setText(file.getAbsolutePath());
				rest.setText(r + "");
				progress.setText(p + "%");
				//monitor.repaint();
				progressBar.updateUI();
				isInserted = false;
				//}
				/*	}
				}).start();*/

			}
		}
	}

	public void refresh() {
		Connection conn = SQLiteOpenHelper.newInstance().getConnection("block");
		String sql = "select distinct fileName,importDate from block_data";
		String sql1 = "select distinct releaseDate from block_data";
		String sql2 = "select distinct releaseHour from block_data";
		Statement stmt = null;
		ResultSet rs = null;
		Statement stmt1 = null;
		ResultSet rs1 = null;
		Statement stmt2 = null;
		ResultSet rs2 = null;
		final List<String> result = new ArrayList<String>();
		Vector<String> releaseDate = new Vector<String>();
		Vector<String> releaseHour = new Vector<String>();
		releaseDate.add("选择日期");
		releaseHour.add("选择时间");
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			stmt1 = conn.createStatement();
			rs1 = stmt1.executeQuery(sql1);
			stmt2 = conn.createStatement();
			rs2 = stmt2.executeQuery(sql2);
			while (rs.next()) {
				result.add(rs.getString(2) + " " + rs.getString(1));
			}
			while (rs1.next()) {
				releaseDate.add(rs1.getString(1));
			}
			while (rs2.next()) {
				releaseHour.add(rs2.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs2 != null) {
					rs2.close();
					rs2 = null;
				}
				if (rs1 != null) {
					rs1.close();
					rs1 = null;
				}
				if (stmt2 != null) {
					stmt2.close();
					stmt2 = null;
				}
				if (stmt1 != null) {
					stmt1.close();
					stmt1 = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		jList1.setModel(new javax.swing.AbstractListModel() {
			String[] strings = { "", "", "" };

			public int getSize() {
				return result.size();
			}

			public Object getElementAt(int i) {
				return result.get(i);
			}
		});

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(releaseDate));

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(releaseDate));

		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(releaseHour));

		jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(releaseHour));
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JComboBox jComboBox3;
	private javax.swing.JComboBox jComboBox4;
	private javax.swing.JComboBox jComboBox5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JList jList1;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea jTextArea1;
	private boolean isInserted = false;
	// End of variables declaration//GEN-END:variables

}