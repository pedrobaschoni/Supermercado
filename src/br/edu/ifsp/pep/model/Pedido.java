/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.model;

import java.util.List;

/**
 *
 * @author aluno
 */
public class Pedido {
    
    private Cliente cliente;
    private List<Item> item;
    private TipoPagamento tipoPagamento;

    public Pedido() {
    }

    public Pedido(Cliente cliente, List<Item> item, TipoPagamento tipoPagamento) {
        this.cliente = cliente;
        this.item = item;
        this.tipoPagamento = tipoPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    public double valorASerPago() {
        double total = 0;
        
        
        for (Item item1 : item) {
            
            total = total + (item1.getPreco() * item1.getQuantidade());
        }
        
        double desconto = total * tipoPagamento.desconto();
        
        return total - desconto;
    }
    
}
