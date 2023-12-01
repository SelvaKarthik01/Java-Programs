//JTable, JScrollPane
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Student{
	int rno;
	String name;
	int m1,m2,m3;
	Student(int rno,String name, int m1,int m2,int m3){
		this.rno=rno;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
}

class StudentDemo{
	JFrame jf;
	JPanel jp;
	JScrollPane js;
	JTable jt;
	JLabel lrno,lname,lm1,lm2,lm3;
	JTextField trno,tname,tm1,tm2,tm3;
	JButton badd,bdel;

	StudentDemo(){
		jf=new JFrame("Student");
		jf.setVisible(true);
		jf.setSize(500,500);
		jf.setLayout(new GridLayout(1,2));
		jp=new JPanel();
		jp.setLayout(new GridLayout(6,2,10,50));
		lrno=new JLabel("RNO:"); jp.add(lrno);
		trno=new JTextField(10); jp.add(trno);	

		lname=new JLabel("Name:"); jp.add(lname);
		tname=new JTextField(10); jp.add(tname);	

		lm1=new JLabel("MARK 1:"); jp.add(lm1);
		tm1=new JTextField(10); jp.add(tm1);
		lm2=new JLabel("MARK 2:"); jp.add(lm2);
		tm2=new JTextField(10); jp.add(tm2);
		lm3=new JLabel("MARK 3:"); jp.add(lm3);
		tm3=new JTextField(10); jp.add(tm3);
		badd=new JButton("ADD"); jp.add(badd);
		bdel=new JButton("DELETE"); jp.add(bdel);
		jf.add(jp);
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("RNO");
		model.addColumn("NAME");
		model.addColumn("MARK1");
		model.addColumn("MARK2");
		model.addColumn("MARK3");
	
		jt=new JTable(model);
		js=new JScrollPane(jt);
		jf.add(js);
		
		badd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				model.addRow(new Object[]{trno.getText(),tname.getText(),tm1.getText(),tm2.getText(),tm3.getText()});
				trno.setText("");tname.setText("");tm1.setText("");tm2.setText("");tm3.setText("");
				jf.getContentPane().repaint();
			}
		});











		jf.validate();
		jf.repaint();	
	}
	public static void main(String args[]){
		new StudentDemo();
	}
}