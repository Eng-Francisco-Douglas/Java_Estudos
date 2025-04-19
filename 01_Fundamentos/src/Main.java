//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Classe principal que demonstra conceitos básicos de Java.
 * Esta classe contém um método main que exibe uma mensagem de boas-vindas
 * e demonstra um loop for básico.
 * 
 * @author Desenvolvedor
 * @version 1.0
 */
public class Main {
    /**
     * Método principal que é executado quando o programa inicia.
     * Este método demonstra a impressão de texto no console e
     * a utilização de um loop for para repetir uma ação várias vezes.
     *
     * @param args Argumentos de linha de comando (não utilizados neste exemplo)
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // Imprime uma mensagem de boas-vindas usando printf
        System.out.printf("Hello and welcome!");

        // Loop for que itera de 1 até 5
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

            // Imprime o valor atual do contador i
            System.out.println("i = " + i);
        }
    }
}
