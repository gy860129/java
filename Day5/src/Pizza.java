import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pizza {

	JFrame f;
	JLabel top, count;
	JButton b1, b2, b3;
	JTextField total;
	int sum = 0;
	int combo = 0;
	int potato = 0;
	int bulgoki = 0;
	JTextArea list;

	public Pizza() {
		f = new JFrame();
		f.setSize(350, 200);
		top = new JLabel("<<<<<<<자바피자에 온걸 환영합니다>>>>>>>");
		count = new JLabel("개수");
		b1 = new JButton("불고기");
		b2 = new JButton("포테이토");
		b3 = new JButton("콤보");
		total = new JTextField(20);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		list = new JTextArea(3, 30);
		f.add(top);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(count);
		f.add(total);
		f.add(list);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				combo++;

				list.setText("콤보 개수: " + combo + "개\n" + "포테이토 개수: " + potato + "개\n" + "불고기 개수: " + bulgoki + "개\n");
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				potato++;

				list.setText("콤보 개수: " + combo + "개\n" + "포테이토 개수: " + potato + "개\n" + "불고기 개수: " + bulgoki + "개\n");
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				bulgoki++;

				list.setText("콤보 개수: " + combo + "개\n" + "포테이토 개수: " + potato + "개\n" + "불고기 개수: " + bulgoki + "개\n");
			}
		});

		f.setVisible(true);

	}

	public static void main(String[] args) {
		Pizza p = new Pizza();

	}

}
