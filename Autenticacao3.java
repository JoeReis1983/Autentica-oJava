package pack;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Autenticacao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JTextField user = new JTextField();
	JTextField password = new JPasswordField();
	Object[] tela = {
	    "Usuario:", user,
	    "Senha:", password
	};

	JOptionPane.showConfirmDialog(null, tela, "Login",JOptionPane.OK_CANCEL_OPTION);
	validar(user.getText(),password.getText());
	}
	
	

	private static void validar(String user,String password) {
		// TODO Auto-generated method stub
		String usuario, senha;
		
		usuario = "Administrador";
		senha = "123456";
		int x=1;
		
		if(user.equals(usuario)&&password.equals(senha)) {
			JOptionPane.showMessageDialog(null,"Seja bem-vindo sr(a). "+user );

		}
		else {
			JOptionPane.showMessageDialog(null,"Acesso negado \n Tentativa:"+x+" de 3");
			while(x<=3) {
				main(null);
				x++;
			}
			

		}
		
	}
}
	