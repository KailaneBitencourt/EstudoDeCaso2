/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.biblioteca;


public abstract class ItemBiblioteca {
    public String titulo;
    public String codigo;
    
    public ItemBiblioteca(String titulo, String codigo){
        this.titulo = titulo;
        this.codigo = codigo;
    }
    
    public abstract String exibirInformacoes();
}
