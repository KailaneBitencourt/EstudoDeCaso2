/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.biblioteca;


public class Revista extends ItemBiblioteca {
    public String edicao;
    
    public Revista(String titulo, String codigo, String edicao){
    super(titulo, codigo);
    this.edicao = edicao;
    }
    
    @Override
    public String exibirInformacoes(){
        return 
                "\n Título: " + titulo + 
                "\n Código: " + codigo + 
                "\n Edição: " + edicao;
    }
    
}
