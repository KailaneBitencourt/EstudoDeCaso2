/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estudodecaso.biblioteca;


public class Biblioteca {

    public static void main(String[] args) {
        ItemBiblioteca[] itembiblioteca = new ItemBiblioteca[3];
        
        itembiblioteca[0]= new Livro("As aventuras de Poliana","2p", "Eleanor", 300);
        itembiblioteca[1] = new Revista("Nosso amiguinho", "3p", "Agosto 2025");
        itembiblioteca[2] = new DVD("Moana","4p", 150);
        
        for (ItemBiblioteca item : itembiblioteca) {
            System.out.println(item.exibirInformacoes());
        }

    }
}
        
        
        
   