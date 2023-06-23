import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {

        ReprodutorMusical rm = new ReprodutorMusical();
        AparelhoTelefonico ap = new AparelhoTelefonico();
        NavegadorInternet ni = new NavegadorInternet();

        System.out.println("MODO REPRODUÇÃO DE MÚSICA");
        rm.selecionarMusica();
        rm.tocarMusica();
        rm.pausarMusica();

        System.out.println();
        System.out.println("MODO TELEFONE");
        ap.ligarTelefone();
        ap.atenderTelefone();
        ap.iniciarCorreioVoz();

        System.out.println();
        System.out.println("MODO NAVEGADOR DE INTERNET");
        ni.exibirPagina();
        ni.adicionarNovaAba();
        ni.atualizarPagina();

    }
}