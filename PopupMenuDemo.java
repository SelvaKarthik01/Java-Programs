//Pop-up-menu

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class PopupMenuDemo
{
	PopupMenuDemo()
	{
		JFrame frm=new JFrame("Text Editor");
		JTextArea txt=new JTextArea("Enter data...");
		txt.setBounds(0,0,500,200);
		frm.setSize(500,500);
		frm.setVisible(true);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font f=new Font("Arial",Font.BOLD,20);
		txt.setFont(f);
		txt.setForeground(Color.RED);
		frm.add(txt);

		//Popup Menu
		JPopupMenu mnu=new JPopupMenu("Edit");
		JMenuItem cut=new JMenuItem("Cut");
		JMenuItem copy=new JMenuItem("Copy");
		JMenuItem paste=new JMenuItem("Paste");
		mnu.add(cut);
		mnu.add(copy);
		mnu.add(paste);
		frm.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				if(me.getButton()==MouseEvent.BUTTON3)
					mnu.show(txt,me.getX(),me.getY());
			}
		});
		cut.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				txt.cut();
			}
		});
		copy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				txt.copy();
			}
		});
		paste.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				txt.paste();
			}
		});
		txt.addCaretListener(new CaretListener()
		{
			public void caretUpdate(CaretEvent ce)
			{}
		});
	}
	public static void main(String args[])
	{
		new PopupMenuDemo();
	}
}