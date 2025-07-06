/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.biblioteca;


public class Livro extends ItemBiblioteca{
    public String autor;
    public int numeroDePaginas;
    
    public Livro(String titulo, String codigo, String autor,int numeroDePaginas){
        super(titulo, codigo);
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        
    }
    
    @Override 
    public String exibirInformacoes(){
        return  "\n Título: " + titulo + 
                "\n Código: " + codigo + 
                "\n Autor: " + autor + 
                "\nNúmero de Páginas: " + numeroDePaginas;
    }
}
