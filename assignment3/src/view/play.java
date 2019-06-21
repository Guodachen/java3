/*
 * play.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import sql.DataConnect;

import code.Inquire;
import code.comment;
import code.id;
import code.name;
import code.star;

/**
 *
 * @author  __USER__
 */
public class play extends javax.swing.JFrame {
	int i;
	int a = 1;

	public int getA() {
		return a;
	}

	/** Creates new form play */

	public play() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jProgressBar1 = new javax.swing.JProgressBar();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel2.setText("music\uff1a");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jButton4.setText("\u4e0b\u4e00\u9996");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton1.setText("\u5f00\u59cb");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel1.setText("\u6b63\u5728\u64ad\u653e");

		jButton2.setText("\u8bc4\u8bba");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("\u9000\u51fa");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton5.setText("\u6536\u85cf");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setText("\u67e5\u770b\u8bc4\u8bba");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setText("\u968f\u673a\u64ad\u653e");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				55,
																				55,
																				55)
																		.addComponent(
																				jLabel2)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jLabel3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				400,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				100,
																				100,
																				100)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addComponent(
																								jButton5,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								395,
																								Short.MAX_VALUE)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								layout
																										.createSequentialGroup()
																										.addGap(
																												7,
																												7,
																												7)
																										.addComponent(
																												jProgressBar1,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												98,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jButton2)
																										.addGap(
																												72,
																												72,
																												72)
																										.addComponent(
																												jButton3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												95,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								jButton4,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton7,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								395,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton6,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										261, Short.MAX_VALUE).addComponent(
										jLabel1).addGap(257, 257, 257)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				30,
																				30,
																				30)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								47,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								31,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				37,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton5))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				73,
																				73,
																				73)
																		.addComponent(
																				jProgressBar1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton7,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jButton3)
														.addComponent(jButton1))
										.addContainerGap(31, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		ArrayList<id> i = new ArrayList<id>();
		String url = "select * from temporary";
		try {
			ResultSet rs = DataConnect.getStat().executeQuery(url);
			while (rs.next()) {
				i.add(new id(rs.getString("id")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String sid = i.get(0).getId();
		ArrayList<name> n = new ArrayList<name>();
		String url1 = "select * from temporary1";
		try {
			ResultSet rs = DataConnect.getStat().executeQuery(url1);
			while (rs.next()) {
				n.add(new name(rs.getString("name")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name= n.get(0).getName();
		star s =new star(name,sid);
		s.create();
		
		JOptionPane.showMessageDialog(null, "成功", "ok",
				JOptionPane.PLAIN_MESSAGE);
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		dispose();
		new com().setVisible(true);

	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int number = new Random().nextInt(9) + 1;
		this.a = number;

		Inquire in = new Inquire(a);
		try {
			jLabel3.setText(in.viewAllsong());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.a = 1;
			System.out.println("e");
			try {
				jLabel3.setText(in.viewAllsong());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		if (a < 9) {
			this.a = a + 1;
			//			c.setI(a);
		}

		else {
			this.a = 0;
			//			c.setI(a);
		}
		Inquire in = new Inquire(a);
		comment c = new comment(null, null, null);

		try {
			jLabel3.setText(in.viewAllsong());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.a = 1;
			try {
				jLabel3.setText(in.viewAllsong());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a);

	}

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
		new ruser().setVisible(true);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		dispose();
		new comm().setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		Inquire in = new Inquire(a);

		if (i == 0) {
			this.i = 1;
			jButton1.setText("暂停");
			jLabel1.setText("正在播放");
			try {
				jLabel3.setText(in.viewAllsong());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			this.i = 0;
			jButton1.setText("开始");
			jLabel1.setText(" 暂停中");
		}

	}

	/**
	 * @param args the command line arguments
	 */
	

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JProgressBar jProgressBar1;
	// End of variables declaration//GEN-END:variables

}