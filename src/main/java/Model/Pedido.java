package Model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	
	private ArrayList<ItemDePedido> itensDePedido = new ArrayList<ItemDePedido>();
	private Cliente cliente;
	private float valorTotal;
	private boolean finalizado;
	private Date data;

}
