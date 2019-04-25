package view;

import javax.swing.JOptionPane;

import model.Aluno;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		aluno.setNome(JOptionPane.showInputDialog("Digite o seu nome"));
		aluno.setEndereco(JOptionPane.showInputDialog("Digite o seu endereço"));
		aluno.setBairro(JOptionPane.showInputDialog("Digite o seu bairro"));
		aluno.setCep(Long.parseLong(JOptionPane.showInputDialog("Digite o seu CEP")));
		aluno.setCidade(JOptionPane.showInputDialog("Digite a sua cidade"));
		aluno.setEstado(JOptionPane.showInputDialog("Digite o seu estado"));
		System.out.println(aluno.getNome());
		System.out.println(aluno.getEndereco());
		System.out.println(aluno.getBairro());
		System.out.println(	aluno.getCep());
		System.out.println(aluno.getCidade());
		System.out.println(aluno.getEstado());
	}

}
