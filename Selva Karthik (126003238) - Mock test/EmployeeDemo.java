/*Create a Class called Employee EID type int  Ename string  Basic Pay double 
Get these three data as user as an array list, when add button is clicked,  Content to be displayed on the table 
Add delete Update Search 
HRA - 10% Da - 50% PF - 2%
Gross Pay = Basic Pay + HRA + DA
Net Pay = Gross Pay - PF 
*/
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Employee
{
 int EID;
 String Ename;
 double Basic_pay;
 Employee(int EID,String Ename,double Basic_pay)
 {
  this.EID = EID;
  this.Ename = Ename;
  this.Basic_pay = Basic_pay;
 }
}
class EmployeeDemo
{
 ArrayList<Employee> ae;
 JFrame jf;
 JTable jt;
 JScrollPane js;
 JPanel jp;
 JLabel lbleid,lblname,lblpay;
 JTextField txteid,txtname,txtpay;
 JButton btnadd,btnsearch,btnupdate,btndelete;
 EmployeeDemo()
 {
  ae = new ArrayList<Employee>();
  jf = new JFrame("EMPLOYEE DATABASE");
  jf.setSize(1920,1080);
  jf.setVisible(true);
  jf.setLayout(new GridLayout(1,2));
  jp = new JPanel();
  jp.setLayout(new GridLayout(5,3,10,10));
  lbleid = new JLabel("Employee ID");
  txteid = new JTextField(10);
  jp.add(lbleid);
  jp.add(txteid);
  lblname = new JLabel("Employee Name");
  txtname = new JTextField(10);
  jp.add(lblname);
  jp.add(txtname);
  lblpay = new JLabel("Employee's Basic Pay");
  txtpay = new JTextField(10);
  jp.add(lblpay);
  jp.add(txtpay);
  btnadd = new JButton("ADD");
  btnsearch = new JButton("SEARCH");
  btnupdate = new JButton("UPDATE");
  btndelete = new JButton("DELETE");
  jp.add(btnadd);
  DefaultTableModel model=new DefaultTableModel();
  model.addColumn("EID");
  model.addColumn("Name");
  model.addColumn("Basic Pay");
  model.addColumn("HRA");
  model.addColumn("DA");
  model.addColumn("PF");
  model.addColumn("Gross Pay");
  model.addColumn("Net Pay");
  btnadd.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent E)
   {
    Employee e = new Employee(Integer.parseInt(txteid.getText()),txtname.getText(),Double.parseDouble(txtpay.getText()));
    ae.add(e);
    Double pay = Double.parseDouble(txtpay.getText());
    Double gp = pay + 0.1*pay + 0.5*pay;
    Double np = gp - 0.2*pay;
    model.addRow(new Object[]{txteid.getText(),txtname.getText(),pay,0.1*pay,0.5*pay,0.2*pay,gp,np});
    txteid.setText("");txtname.setText("");txtpay.setText("");
    jf.getContentPane().repaint();
   }
  });
  
  btnsearch.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent E)
   {
    for(int i=0;i<model.getRowCount();i++)
    {
     if(txteid.getText().equals(model.getValueAt(i,0)))
     {
      jt.setRowSelectionInterval(i,0);
      txteid.setText("");txtname.setText("");txtpay.setText("");
      jf.getContentPane().repaint();
     }
    }
   }
  });
  jp.add(btnupdate);
  btnupdate.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent E)
   {
    for(int i=0;i<model.getRowCount();i++)
    {
     if(txteid.getText().equals(model.getValueAt(i,0)))
     {
      model.removeRow(i);
      Employee e = new Employee(i,txtname.getText(),Double.parseDouble(txtpay.getText()));
      ae.add(e);
      Double pay = Double.parseDouble(txtpay.getText());
      Double gp = pay + 0.1*pay + 0.5*pay;
      Double np = gp - 0.2*pay;
      model.insertRow(i,new Object[]{i,txtname.getText(),pay,0.1*pay,0.5*pay,0.2*pay,gp,np});
      txteid.setText("");txtname.setText("");txtpay.setText("");
      jf.getContentPane().repaint();
     }
    }
   }
  });
  jp.add(btndelete);
  btndelete.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent E)
   {
    for(int i=0;i<model.getRowCount();i++)
    {
     if(txteid.getText().equals(model.getValueAt(i,0)))
     {
      model.removeRow(i);
      txteid.setText("");txtname.setText("");txtpay.setText("");
      jf.getContentPane().repaint();
     }
    }
   }
  });
  jp.add(btnsearch);
  jf.add(jp);
  jt=new JTable(model);
  js=new JScrollPane(jt);
  jf.add(js);
 }
 public static void main(String args[])
 {
  new EmployeeDemo();
 }
}
  
  
  
  
  

