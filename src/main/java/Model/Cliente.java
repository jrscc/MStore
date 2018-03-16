package Model;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
	
	private int CPF;
	private int RG;
	private String nome;
	private Date DataNascimento;
	private ArrayList<Telefone> telefones = new ArrayList<Telefone>();
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private Endereco endereco;

}
