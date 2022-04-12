private void jButton1ActionPerformed
(java.awt.event.ActionEvent evt) {
	int Input1=Integer.parseInt(jTextField10.getText());
	if(Input1<1 || Input1>9)
		JOptionPane.showMessageDialog(this,"Enter a Valid Position (1..9)");
	else
	{
		if ((Input1==1 && jTextField1.getText().isEmpty()) ||
		(Input1==2 && jTextField2.getText().isEmpty()) ||
		(Input1==3 && jTextField3.getText().isEmpty()) ||
		(Input1==4 && jTextField4.getText().isEmpty()) ||
		(Input1==5 && jTextField5.getText().isEmpty()) ||
		(Input1==6 && jTextField6.getText().isEmpty()) ||
		(Input1==7 && jTextField7.getText().isEmpty()) ||
		(Input1==8 && jTextField8.getText().isEmpty()) ||
		(Input1==9 && jTextField9.getText().isEmpty()))
		{
			switch (Input1)
			{
				case 1:jTextField1.setText("X");break;
				case 2:jTextField2.setText("X");break;
				case 3:jTextField3.setText("X");break;
				case 4:jTextField4.setText("X");break;
				case 5:jTextField5.setText("X");break;
				case 6:jTextField6.setText("X");break;
				case 7:jTextField7.setText("X");break;
				case 8:jTextField8.setText("X");break;
				case 9:jTextField9.setText("X");break;
			}
			if ((jTextField1.getText().equals("X") &&
			jTextField2.getText().equals("X") &&
			jTextField3.getText().equals("X"))||
			(jTextField4.getText().equals("X") &&
			jTextField5.getText().equals("X") &&
			jTextField6.getText().equals("X"))||
			(jTextField7.getText().equals("X") &&
			jTextField8.getText().equals("X") &&
			jTextField9.getText().equals("X"))||
			(jTextField1.getText().equals("X") &&
			jTextField4.getText().equals("X") &&
			jTextField7.getText().equals("X"))||
			(jTextField2.getText().equals("X") &&
			jTextField5.getText().equals("X") &&
			jTextField8.getText().equals("X"))||
			(jTextField3.getText().equals("X") &&
			jTextField6.getText().equals("X") &&
			jTextField9.getText().equals("X"))||
			(jTextField1.getText().equals("X") &&
			jTextField5.getText().equals("X") &&
			jTextField9.getText().equals("X"))||
			(jTextField3.getText().equals("X") &&
			jTextField5.getText().equals("X") && 
			jTextField7.getText().equals("X")))
				jOptionPane.showMessageDialog(this,"Player 1 Wins");
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
					jTextField11.setEditable(true);
			jButton1.setEnabled(false);
			jButton2.setEnabled(true);
			jTextField10.setEditable(false);
		}
		else
			jOptionPane.showMessageDialog(this,"Already Occupied Option RE-ENTER (1..9)");
	}
	jTextField10.setText("");
}
