package com.occamsrazor.web.member;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemberView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container container;
	private JLabel title, nameLabel, useridLabel, passwordLabel, ssnLabel, addrLabel;
	private JTextField nameText, useridText, passwordText, ssnText, addrText;
	private JTextArea resultText;
	private JButton submitButton, listButton, loginButton, detailButton, nameButton, genderButton, countButton,
			updateButton, deleteButton;
	public MemberService memberService;

	public void open() {
		memberService = new MemberServiceImpl();
		setTitle("Swing Form");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		container = getContentPane();
		container.setLayout(null);

		title = new JLabel("Registration Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		container.add(title);

		nameLabel = new JLabel("Name");
		nameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		nameLabel.setSize(100, 20);
		nameLabel.setLocation(100, 100);
		container.add(nameLabel);

		nameText = new JTextField();
		nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		nameText.setSize(190, 20);
		nameText.setLocation(200, 100);
		container.add(nameText);

		useridLabel = new JLabel("Userid");
		useridLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		useridLabel.setSize(100, 20);
		useridLabel.setLocation(100, 150);
		container.add(useridLabel);

		useridText = new JTextField();
		useridText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		useridText.setSize(150, 20);
		useridText.setLocation(200, 150);
		container.add(useridText);

		passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		passwordLabel.setSize(100, 20);
		passwordLabel.setLocation(100, 200);
		container.add(passwordLabel);

		passwordText = new JTextField();
		passwordText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		passwordText.setSize(150, 20);
		passwordText.setLocation(200, 200);
		container.add(passwordText);

		ssnLabel = new JLabel("SSN");
		ssnLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		ssnLabel.setSize(100, 20);
		ssnLabel.setLocation(100, 250);
		container.add(ssnLabel);

		ssnText = new JTextField();
		ssnText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		ssnText.setSize(150, 20);
		ssnText.setLocation(200, 250);
		container.add(ssnText);

		addrLabel = new JLabel("Address");
		addrLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		addrLabel.setSize(100, 20);
		addrLabel.setLocation(100, 300);
		container.add(addrLabel);

		addrText = new JTextField();
		addrText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		addrText.setSize(150, 20);
		addrText.setLocation(200, 300);
		container.add(addrText);

		submitButton = new JButton("Save");
		submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
		submitButton.setSize(100, 20);
		submitButton.setLocation(100, 400);
		submitButton.addActionListener(this);
		container.add(submitButton);

		listButton = new JButton("List");
		listButton.setFont(new Font("Arial", Font.PLAIN, 15));
		listButton.setSize(100, 20);
		listButton.setLocation(220, 400);
		listButton.addActionListener(this);
		container.add(listButton);

		loginButton = new JButton("Log in");
		loginButton.setFont(new Font("Arial", Font.PLAIN, 15));
		loginButton.setSize(100, 20);
		loginButton.setLocation(340, 400);
		loginButton.addActionListener(this);
		container.add(loginButton);

		detailButton = new JButton("Detail");
		detailButton.setFont(new Font("Arial", Font.PLAIN, 15));
		detailButton.setSize(100, 20);
		detailButton.setLocation(100, 440);
		detailButton.addActionListener(this);
		container.add(detailButton);
		nameButton = new JButton("Name");
		nameButton.setFont(new Font("Arial", Font.PLAIN, 15));
		nameButton.setSize(100, 20);
		nameButton.setLocation(220, 440);
		nameButton.addActionListener(this);
		container.add(nameButton);
		genderButton = new JButton("Gender");
		genderButton.setFont(new Font("Arial", Font.PLAIN, 15));
		genderButton.setSize(100, 20);
		genderButton.setLocation(340, 440);
		genderButton.addActionListener(this);
		container.add(genderButton);
		countButton = new JButton("Count");
		countButton.setFont(new Font("Arial", Font.PLAIN, 15));
		countButton.setSize(100, 20);
		countButton.setLocation(100, 480);
		countButton.addActionListener(this);
		container.add(countButton);
		updateButton = new JButton("Update");
		updateButton.setFont(new Font("Arial", Font.PLAIN, 15));
		updateButton.setSize(100, 20);
		updateButton.setLocation(220, 480);
		updateButton.addActionListener(this);
		container.add(updateButton);
		deleteButton = new JButton("Delete");
		deleteButton.setFont(new Font("Arial", Font.PLAIN, 15));
		deleteButton.setSize(100, 20);
		deleteButton.setLocation(340, 480);
		deleteButton.addActionListener(this);
		container.add(deleteButton);

		resultText = new JTextArea();
		resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		resultText.setSize(300, 400);
		resultText.setLocation(500, 100);
		resultText.setLineWrap(true);
		resultText.setEditable(false);
		container.add(resultText);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == submitButton) {
			nameText.setText("가,가,가,라,마");
			useridText.setText("a,b,c,d,e");
			passwordText.setText("1,2,3,4,5");
			ssnText.setText("910101-1,920202-2,930303-3,940404-4,950505-5");
			addrText.setText("서울,서울,서울,부산,부산");
			String[] names = nameText.getText().split(",");
			String[] userids = useridText.getText().split(",");
			String[] passwords = passwordText.getText().split(",");
			String[] ssns = ssnText.getText().split(",");
			String[] addrs = addrText.getText().split(",");
			Member member = null;
			for (int i = 0; i < names.length; i++) {
				member = new Member();
				member.setName(names[i]);
				member.setUserId(userids[i]);
				member.setUserPw(passwords[i]);
				member.setSsn(ssns[i]);
				member.setAddr(addrs[i]);
				memberService.add(member);
			}
		} else if (e.getSource() == listButton) {
			Member[] members = memberService.list();
			String result = "";
			for (int i = 0; i < members.length; i++) {
				result += (members[i] + "\n");
			}
			nameText.setText("");
			useridText.setText("");
			passwordText.setText("");
			ssnText.setText("");
			addrText.setText("");
			resultText.setText(result);
		} else if (e.getSource() == loginButton) {
			Member member = new Member();
			member.setUserId(useridText.getText());
			member.setUserPw(passwordText.getText());
			Member returnMember = memberService.login(member);
			if (returnMember != null) {
				resultText.setText(returnMember.toString());
			} else {
				resultText.setText("로그인 실패");
			}
		} else if (e.getSource() == detailButton) {
			Member returnMember = memberService.detail(useridText.getText());
			if (returnMember != null) {
				resultText.setText(returnMember.toString());
			} else {
				resultText.setText("ID 없음");
			}
		} else if (e.getSource() == nameButton) {
			Member[] returnMembers = memberService.searchByName(nameText.getText());
			if (returnMembers != null) {
				String result = "";
				for (int i = 0; i < returnMembers.length; i++) {
					result += returnMembers[i].toString() + "\n";
				}
				resultText.setText(result);
			} else {
				resultText.setText("이름 없음");
			}
		} else if (e.getSource() == countButton) {
			resultText.setText(String.valueOf(memberService.count()));
		} else if (e.getSource() == updateButton) {
			String userid = useridText.getText();
			String newPassword = passwordText.getText();
			Member updateMember = new Member();
			updateMember.setUserId(userid);
			updateMember.setUserPw(newPassword);
			memberService.update(updateMember);
		} else if (e.getSource() == deleteButton) {
			Member deleteMember = new Member();
			if(deleteMember!=null) {
				deleteMember.setUserId(useridText.getText());
				deleteMember.setUserPw(passwordText.getText());
				memberService.delete(deleteMember);
			}
		}
	}
}