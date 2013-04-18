/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package meuprojeto.lacunas;

/**
 *
 * @author Carol
 */

public class TarefasRepublica {
    
    public static String[] nomeMorador = {
      "Antonieta",
      "Asbrubal",
      "Astolfo",
      "Dulce",
      "Genival",
      "Gerusa",
      "Gilberto",
      "Livia",
      "Luisa",
      "Milene",
      "Patricia",
      "Rui",
      "Silvia"
    };
  
    
    public static String[] tarefasRealizar = {
      " - Pagar Aluguel",
      " - Pagar Luz",
      " - Pagar Internet",
      " - Pagar Telefone",
      " - Limpar Quartos",
      " - Limpar Banheiros",
      " - Limpar Quintal",
      " - Limpar Cozinha",
      " - Lavar Louça",
      " - Fazer Jantar",
      " - Fazer Almoço",
      " - Fazer Mercado",
      " - Fazer Açougue",
      " - Fazer Varejao",
      " - Lavar Roupas"
    };
       
    
    public static String proximaTarefa(){
        DadoDaSorte morador = new DadoDaSorte(nomeMorador.length);
        DadoDaSorte tarefas = new DadoDaSorte(tarefasRealizar.length);
        return nomeMorador[morador.lancar()] + tarefasRealizar[tarefas.lancar()];
    }
    
    public static void main(String[] args) {
        System.out.println(proximaTarefa());

   }

}