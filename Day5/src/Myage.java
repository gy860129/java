import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Myage {
JFrame f ; //선언(사용할 수 있는 범위)
JLabel top, name,year, age, result;
JButton confirm;
JTextField n, y, a;
	
	
	public Myage() {
f= new JFrame();
f.setSize(260,280);
top= new JLabel("<<<<<성인인증 프로그램 입니다>>>>");

name= new JLabel("이름");

year= new JLabel("생년");

age= new JLabel("나이");
result = new JLabel();
confirm = new JButton("인증");
n=new JTextField(20);
y=new JTextField(20);
a=new JTextField(20);

FlowLayout flow = new FlowLayout();
f.setLayout(flow);
f.add(top);
f.add(name);
f.add(n);
f.add(year);
f.add(y);
f.add(age);
f.add(a);
f.add(confirm);
f.add(result);

result.setForeground(Color.blue);
top.setBackground(Color.blue);
confirm.setForeground(Color.black);
confirm.setBackground(Color.yellow);

confirm.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = n.getText();
	String year = y.getText();
	int yearInt=Integer.parseInt(year);
	int age=2019-yearInt+1;
a.setText(age+"");

if (age>=19) {
	result.setText(name+"님은 성인");
	
} else {
	result.setText(name+"님은 미성인");

}
				
		
	}
});


 f.setVisible(true);




}

	public static void main(String[] args) {
		Myage age = new Myage();

	}

}
