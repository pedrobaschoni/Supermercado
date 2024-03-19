/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep;

import br.edu.ifsp.pep.model.Cliente;
import br.edu.ifsp.pep.model.Item;
import br.edu.ifsp.pep.model.PagamentoCartao;
import br.edu.ifsp.pep.model.PagamentoCheque;
import br.edu.ifsp.pep.model.PagamentoDinheiro;
import br.edu.ifsp.pep.model.Pedido;
import br.edu.ifsp.pep.model.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Principal {
    
    private static final List<Pedido> pedidos = new ArrayList<>();
    
    public static void main(String[] args) {
        adicionarPedido();
        valorASerPago();
    }
    
    private static void adicionarPedido() {
        
        PagamentoDinheiro dinheiro = new PagamentoDinheiro();
        PagamentoCartao cartao = new PagamentoCartao();
        PagamentoCheque cheque = new PagamentoCheque();
        
        Produto p1 = new Produto("Arroz", 10, 20);
        Produto p2 = new Produto("Açucar", 15, 22);
        Produto p3 = new Produto("Feijão", 11, 13);
        
        Item i1 = new Item(p1, p1.getPreco(), 2);
        Item i2 = new Item(p3, p3.getPreco(), 4);
        List<Item> itens = new ArrayList<>();
        itens.add(i1);
        itens.add(i2);
        
        Cliente c1 = new Cliente(1, "Abigail");
        Pedido pedido1 = new Pedido(c1, itens, dinheiro);
        pedidos.add(pedido1);
    }
    
    private static void valorASerPago() {
        for (Pedido pedido : pedidos) {
            System.out.println("Valor a ser pago: " + pedido.valorASerPago());
        }
    }
}
