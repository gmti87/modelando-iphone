
public class main {
    public static void main(String[] args) {
        
        reprodutormusical reprodutorm = new reprodutormusical();
        reprodutorm.tocar();
        reprodutorm.pausar();
        reprodutorm.SelecionarMusica("Shaggy - Angel");

        telefone telefone = new telefone();
        telefone.ligar("16999998811");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        navegador navegador = new navegador();
        navegador.exibirPagina("www.google.com.br");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

    }
    
}
