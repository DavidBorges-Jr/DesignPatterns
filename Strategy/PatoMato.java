
/**
 * Escreva a descrição da classe patoMato aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class PatoMato extends Pato

{  
   private TipoTela tela;  
    
   public void animar(){
       tela.MostrarNaTela();
   }
   
   public PatoMato(){

   } 
   
   public PatoMato(TipoTela tela){
       this.tela = tela;
   } 
   
   
    
    
}
