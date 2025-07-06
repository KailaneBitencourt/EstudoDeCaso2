/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.biblioteca;


public class DVD extends ItemBiblioteca{
    public int duracao;
    
    public DVD(String titulo, String codigo, int duracao){
        super(titulo,codigo);
        this.duracao = duracao;
    }
    
    @Override
    public String exibirInformacoes(){
        return  "\nTítulo: " + titulo + 
                "\nCódigo: " + codigo + 
                "\nDuração: " + duracao;
    }
}
