package Strings;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Inverter uma String: Crie um programa que receba uma string e retorne a mesma
		 * string, mas invertida.
		 */

		String fraseOriginal;
		String fraseInvertida = "";

		fraseOriginal = JOptionPane.showInputDialog(null, "Digite uma palavra ou uma frase");

		String fraseSemEspaco = fraseOriginal.replace(" ", "");

		for (int i = fraseSemEspaco.length() - 1; i >= 0; i--) {
			char caractere = fraseSemEspaco.charAt(i);
			fraseInvertida += caractere;
		}

		JOptionPane.showMessageDialog(null,
				"Frase original fornecida pelo usuário = " + fraseSemEspaco + "\nFrase invertida = " + fraseInvertida);
	}
}
