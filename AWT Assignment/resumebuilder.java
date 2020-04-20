package swingdemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;

//import swingdemo.resume.CloseListener; 

public class resumebuilder {


public static void main(String[] args)
{

  resume obj= new resume();
  obj.setBackground(Color.yellow);
  try {
      File myObj = new File(".txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
        System.out.println("File created: " + myObj.getAbsolutePath());
      } else {
        System.out.println("File already exists.");
        System.out.println("File created: " + myObj.getAbsolutePath());
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}


class resume extends JFrame implements ActionListener
{
JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,panel1,panel2,panel3,panel4,panel5,panel6,mainpanel;
  JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33;
  JTextField t1,t2,t4,t5,t6,t7,t9,t10,t12,t13,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33;
  JRadioButton r1,r2;
  JButton but=new JButton("GENERATE RESUME");
  JButton ex =new JButton("EXIT");
  JComboBox<String> dropdown;
  JComboBox<String> dropdown1;
  JComboBox<String> dropdown2;

public resume()
{ 
	but.addActionListener(this);
	ex.addActionListener(new CloseListener());
		panel1 = new JPanel();
		  panel2 = new JPanel();
		  panel3 = new JPanel();
		    panel4 = new JPanel();
		    panel5 = new JPanel();
		    panel6 = new JPanel();
		    
		  mainpanel = new JPanel();
	panel1.setBackground(Color.pink);
	panel2.setBackground(Color.pink);
	panel3.setBackground(Color.pink);
	panel4.setBackground(Color.pink);
	panel5.setBackground(Color.pink);
	panel6.setBackground(Color.pink);
	mainpanel.setLayout(new GridLayout(2, 3));
   panel1.setLayout(new GridLayout(3,1));
   panel2.setLayout(new GridLayout(3,1));
   panel3.setLayout(new GridLayout(2,1));
   panel4.setLayout(new GridLayout(3,1));
   panel5.setLayout(new GridLayout(2,1));
   panel6.setLayout(new GridLayout(3,2));
   
 

   p1 = new JPanel(new GridLayout(2,2));
    p2 = new JPanel(new GridLayout(3,1));
    p3 = new JPanel(new GridLayout(3,2));
    p4=new JPanel(new GridLayout(3,2));
    p5=new JPanel(new GridLayout(3,2));
    p6=new JPanel(new GridLayout(3,2));
    p7=new JPanel(new GridLayout(3,2));
    p8=new JPanel(new GridLayout(3,2));
    p9=new JPanel(new GridLayout(2,2));
    p10=new JPanel(new GridLayout(2,2));
    p11=new JPanel(new GridLayout(2,2));
    p12=new JPanel(new GridLayout(3,2));
    p13=new JPanel(new GridLayout(3,2));
    p14 = new JPanel(new GridLayout(1,1));
    p15= new JPanel(new GridLayout(1,1));
    p16= new JPanel(new GridLayout(1,1));
    p17= new JPanel(new GridLayout(1,1));
    p18= new JPanel(new GridLayout(1,1));
    p19= new JPanel(new GridLayout(1,1));
    p1.setBackground(Color.pink);
    p2.setBackground(Color.pink);
    p3.setBackground(Color.pink);
    p4.setBackground(Color.pink);
    p5.setBackground(Color.pink);
    p6.setBackground(Color.pink);
    p7.setBackground(Color.pink);
    p8.setBackground(Color.pink);
    p9.setBackground(Color.pink);
    p10.setBackground(Color.pink);
    p11.setBackground(Color.pink);
    p12.setBackground(Color.pink);
    p13.setBackground(Color.pink);
    p14.setBackground(Color.pink);
    p15.setBackground(Color.pink);
    p16.setBackground(Color.pink);
    p17.setBackground(Color.pink);
    p18.setBackground(Color.pink);
    p19.setBackground(Color.pink);
    
    
    setVisible(true);
  setSize(1000,1000);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setTitle("build your resume");
  l1 = new JLabel("Enter your first name");
  t1 = new JTextField(20);

  p1.add(l1);
  p1.add(t1);

  l2 = new JLabel("Enter your last name");
  t2 = new JTextField(20);


  p1.add(l2);
  p1.add(t2);
  

  l3 = new JLabel("Select your gender");

  p2.add(l3);

  r1 = new JRadioButton("Male");
  r1.setBackground(Color.pink);
  r2 = new JRadioButton("Female");
  r2.setBackground(Color.pink);
  ButtonGroup btn = new ButtonGroup();
  btn.add(r1);
  btn.add(r2);
  p2.add(r1);
  p2.add(r2);
  
  l4 = new JLabel("Enter your email-id");
  t4 = new JTextField(20);


  p3.add(l4);
  p3.add(t4);

  l5 = new JLabel("Enter your phone number");
  t5 = new JTextField(20);
  p3.add(l5);
  p3.add(t5);
  l6 = new JLabel("Enter your address");
  t6 = new JTextField(20);
  p3.add(l6);
  p3.add(t6);
  
l7 = new JLabel("College name");
t7 = new JTextField(15);

l8= new JLabel("Graduation year");
String[] years = new String[] { "2013", "2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
dropdown = new JComboBox<String>(years);
l9 = new JLabel("CGPA");
t9=  new JTextField(15);
p4.add(l7);
p4.add(t7);
p4.add(l8);
p4.add(dropdown);
p4.add(l9);
p4.add(t9);

l10 = new JLabel("School Name(XII)");
t10 =  new JTextField(15);
l11 = new JLabel("Passing Year");
String[] years1 = new String[] { "2009", "2010","2011","2012","2013","2014","2015","2016","2017","2018","2019"};
dropdown1 = new JComboBox<String>(years1);
l12 = new JLabel("Percentage");
t12=  new JTextField(15);

p5.add(l10);
p5.add(t10);
p5.add(l11);
p5.add(dropdown1);
p5.add(l12);
p5.add(t12);

l13 = new JLabel("School Name(X)");
t13=  new JTextField(15);
l14 = new JLabel("Passing Year");
String[] years2 = new String[] { "2007", "2008","2009","2010","2011","2012","2013","2014","2015","2016","2017"};
dropdown2 = new JComboBox<String>(years1);
l15 = new JLabel("Percentage");
t15=  new JTextField(15);

p6.add(l13);
p6.add(t13);
p6.add(l14);
p6.add(dropdown2);
p6.add(l15);
p6.add(t15);

l16=new JLabel("➤ Technical Skill");
t16=new JTextField(15);
l17=new JLabel("➤ Technical Skill");
t17=new JTextField(15);
l18=new JLabel("➤ Technical Skill");
t18=new JTextField(15);

p7.add(l16);
p7.add(t16);
p7.add(l17);
p7.add(t17);
p7.add(l18);
p7.add(t18);

l19=new JLabel("➤ Interests");
t19=new JTextField(15);
l20=new JLabel("➤ Interests");
t20=new JTextField(15);
l21=new JLabel("➤ Interests");
t21=new JTextField(15);

p8.add(l19);
p8.add(t19);
p8.add(l20);
p8.add(t20);
p8.add(l21);
p8.add(t21);

l22=new JLabel("LinkedIn Profile");
t22= new JTextField(15);
l23=new JLabel("GitHub Profile");
t23= new JTextField(15);
p9.add(l22);
p9.add(t22);
p9.add(l23);
p9.add(t23);

l24=new JLabel("Project Title");
t24= new JTextField(15);
l25=new JLabel("Project Description");
t25= new JTextField(15);
p10.add(l24);
p10.add(t24);
p10.add(l25);
p10.add(t25);

l26=new JLabel("Project Title");
t26= new JTextField(15);
l27=new JLabel("Project Description");
t27= new JTextField(15);
p11.add(l26);
p11.add(t26);
p11.add(l27);
p11.add(t27);

l28=new JLabel("➤ Activity 1");
t28=new JTextField(15);
l29=new JLabel("➤ Activity 2");
t29=new JTextField(15);
l30=new JLabel("➤ Activity 3");
t30=new JTextField(15);
p12.add(l28);
p12.add(t28);
p12.add(l29);
p12.add(t29);
p12.add(l30);
p12.add(t30);

l31=new JLabel("ᐳ Society");
t31=new JTextField(15);
l32=new JLabel("ᐳ Position Of Responsibility");
t32=new JTextField(15);
l33=new JLabel("ᐳ Work Description");
t33=new JTextField(15);
p13.add(l31);
p13.add(t31);
p13.add(l32);
p13.add(t32);
p13.add(l33);
p13.add(t33);

p16.add(but);
p19.add(ex);


panel1.add(p1);
panel1.add(p2);
panel1.add(p3);
panel2.add(p4);
panel2.add(p5);
panel2.add(p6);
panel3.add(p7);
panel3.add(p8);
panel4.add(p9);
panel4.add(p10);
panel4.add(p11);
panel5.add(p12);
panel5.add(p13);
panel6.add(p14);
panel6.add(p15);
panel6.add(p15);
panel6.add(p16);
panel6.add(p17);
panel6.add(p18);
panel6.add(p19);




Border blackline1 = BorderFactory.createTitledBorder("PERSONAL INFORMATION");
panel1.setBorder(blackline1);
Border blackline2 = BorderFactory.createLineBorder(Color.gray);
p4.setBorder(blackline2);
p5.setBorder(blackline2);
p6.setBorder(blackline2);
p7.setBorder(blackline2);
p8.setBorder(blackline2);
panel6.setBorder(blackline2);


Border blackline3 = BorderFactory.createTitledBorder("QUALIFICATIONS");
panel2.setBorder(blackline3);
Border blackline4 = BorderFactory.createTitledBorder("TECHNICAL SKILLS AND INTERESTS");
panel3.setBorder(blackline4);
Border blackline5 = BorderFactory.createTitledBorder("WORK SAMPLES AND PROJECTS");
panel4.setBorder(blackline5);
Border blackline6 = BorderFactory.createTitledBorder("PROJECT 1:");
p10.setBorder(blackline6);
Border blackline7 = BorderFactory.createTitledBorder("PROJECT 2:");
p11.setBorder(blackline7);
Border blackline8 = BorderFactory.createTitledBorder("EXTRA CURRICULAR ACTIVITIES");
panel5.setBorder(blackline8);
Border blackline9 = BorderFactory.createTitledBorder("POSITIONS OF RESPONSIBILITY");
p13.setBorder(blackline9);



mainpanel.add(panel1);
mainpanel.add(panel2);
mainpanel.add(panel3);
mainpanel.add(panel4);
mainpanel.add(panel5);
mainpanel.add(panel6);

add(mainpanel);

l0=new JLabel("RESUME");
}


public void actionPerformed(ActionEvent ae) {
	// TODO Auto-generated method stub
	if(ae.getActionCommand()==but.getActionCommand())
	{
		try
		{   FileWriter filewriter= new FileWriter(t1.getText().toString() +".txt",true);
		    filewriter.write("                                              RESUME");
		    filewriter.write("\r\n");
		    filewriter.write("\r\n");
		    filewriter.write("PERSONAL INFORMATION");
		    filewriter.write("\r\n");
		    filewriter.write("\r\n");
		    filewriter.write(l1.getText().toString() + ":"+ t1.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l2.getText().toString() + ":"+ t2.getText().toString());
			filewriter.write("\r\n");
			if(r1.isSelected()) {
				filewriter.write(l3.getText().toString() + ":"+ "Male");
				filewriter.write("\r\n");
			}
			else if(r2.isSelected()) {
				filewriter.write(l3.getText().toString() + ":"+ "Female");
				filewriter.write("\r\n");
			}
			filewriter.write(l4.getText().toString() + ":"+ t4.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l5.getText().toString() + ":"+ t5.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l6.getText().toString() + ":"+ t6.getText().toString());
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			
			filewriter.write("QUALIFICATIONS");
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write(l7.getText().toString() + ":"+ t7.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l8.getText().toString() + ":"+ dropdown.getSelectedItem());
			filewriter.write("\r\n");
			filewriter.write(l9.getText().toString() + ":"+ t9.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l10.getText().toString() + ":"+ t10.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l11.getText().toString() + ":"+ dropdown1.getSelectedItem());
			filewriter.write("\r\n");
			filewriter.write(l12.getText().toString() + ":"+ t12.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l13.getText().toString() + ":"+ t13.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l14.getText().toString() + ":"+ dropdown2.getSelectedItem());
			filewriter.write("\r\n");
			filewriter.write(l15.getText().toString() + ":"+ t15.getText().toString());
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write("TECHICAL SKILLS AND INTERESTS");
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write(l16.getText().toString() + ":"+ t16.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l17.getText().toString() + ":"+ t17.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l18.getText().toString() + ":"+ t18.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l19.getText().toString() + ":"+ t19.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l20.getText().toString() + ":"+ t20.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l21.getText().toString() + ":"+ t21.getText().toString());
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write("WORK SAMPLES AND PROJECTS");
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write(l22.getText().toString() + ":"+ t22.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l23.getText().toString() + ":"+ t23.getText().toString());
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write("PROJECT :1");
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write(l24.getText().toString() + ":"+ t24.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l25.getText().toString() + ":"+ t25.getText().toString());
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write("PROJECT :2");
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write(l26.getText().toString() + ":"+ t26.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l27.getText().toString() + ":"+ t27.getText().toString());
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write("EXTRA-CURRICULAR ACTIVITIES");
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write(l28.getText().toString() + ":"+ t28.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l29.getText().toString() + ":"+ t29.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l30.getText().toString() + ":"+ t30.getText().toString());
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write("POSITIONS OF RESPONSIBILITY");
			filewriter.write("\r\n");
			filewriter.write("\r\n");
			filewriter.write(l31.getText().toString() + ":"+ t31.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l32.getText().toString() + ":"+ t32.getText().toString());
			filewriter.write("\r\n");
			filewriter.write(l33.getText().toString() + ":"+ t33.getText().toString());
			filewriter.write("\r\n");
			
			filewriter.close();
			JOptionPane.showMessageDialog(null,"File written!!");
			ProcessBuilder pb= new ProcessBuilder("Notepad.exe",t1.getText().toString() +".txt");
			pb.start();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e+"");
		}
	}
}

private class CloseListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
  
        System.exit(0);
    }
}
}


