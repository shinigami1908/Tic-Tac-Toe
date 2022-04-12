private void jButton2ActionPerformed
(java.awt.event.ActionEvent evt) {
	int Input2=Integer.parseInt(jTextField11.getText());
	if (Input2<1 || Input2>9)
		JOptionPane.showMessageDialog(this,"Enter a Valid Position (1..9)");
	else
	{
		if ((Input2==1 && jTextField1.getText().isEmpty()) ||
		(Input2==2 && jTextField2.getText().isEmpty()) ||
		(Input2==3 && jTextField3.getText().isEmpty()) ||
		(Input2==4 && jTextField4.getText().isEmpty()) ||
		(Input2==5 && jTextField5.getText().isEmpty()) ||
		(Input2==6 && jTextField6.getText().isEmpty()) ||
		(Input2==7 && jTextField7.getText().isEmpty()) ||
		(Input2==8 && jTextField8.getText().isEmpty()) ||
		(Input2==9 && jTextField9.getText().isEmpty()))
		{
			switch (Input2)
			{
				case 1:jTextField1.setText("O");break;
				case 2:jTextField2.setText("O");break;
				case 3:jTextField3.setText("O");break;
				case 4:jTextField4.setText("O");break;
				case 5:jTextField5.setText("O");break;
				case 6:jTextField6.setText("O");break;
				case 7:jTextField7.setText("O");break;
				case 8:jTextField8.setText("O");break;
				case 9:jTextField9.setText("O");break;
			}
			if ((jTextField1.getText().equals("O") &&
			jTextField2.getText().equals("O") &&
			jTextField3.getText().equals("O"))||
			(jTextField4.getText().equals("O") &&
			jTextField5.getText().equals("O") &&
			jTextField6.getText().equals("O"))||
			(jTextField7.getText().equals("O") &&
			jTextField8.getText().equals("O") &&
			jTextField9.getText().equals("O"))||
			(jTextField1.getText().equals("O") &&
			jTextField4.getText().equals("O") &&
			jTextField7.getText().equals("O"))||
			(jTextField2.getText().equals("O") &&
			jTextField5.getText().equals("O") &&
			jTextField8.getText().equals("O"))||
			(jTextField3.getText().equals("O") &&
			jTextField6.getText().equals("O") &&
			jTextField9.getText().equals("O"))||
			(jTextField1.getText().equals("O") &&
			jTextField5.getText().equals("O") &&
			jTextField9.getText().equals("O"))||
			(jTextField3.getText().equals("O") &&
			jTextField5.getText().equals("O") &&
			jTextField7.getText().equals("O")))
				jOptionPane.showMessageDialog(this,"Player 2 Wins");
			else
				if (!jTextField1.getText().isEmpty() &&
				!jTextField2.getText().isEmpty() &&
				!jTextField3.getText().isEmpty() &&
				!jTextField4.getText().isEmpty() &&
				!jTextField5.getText().isEmpty() &&
				!jTextField6.getText().isEmpty() &&
				!jTextField7.getText().isEmpty() &&
				!jTextField8.getText().isEmpty() &&
				!jTextField9.getText().isEmpty())
					jOptionPane.showMessageDialog(this,"It is a DRAW...");
				else
					jTextField10.setEditable(true);
			jButton2.setEnabled(false);
			jButton1.setEnabled(true);
			jTextField11.setEditable(false);
		}
		else
			jOptionPane.showMessageDialog(this,"Already Occupied Option RE-ENTER (1..9)");
	}
	jTextField11.setText("");
}
