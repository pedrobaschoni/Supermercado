/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.model;

/**
 *
 * @author aluno
 */
public class PagamentoCartao implements TipoPagamento {

    @Override
    public double desconto() {
        return 0.05;
    }
    
}
