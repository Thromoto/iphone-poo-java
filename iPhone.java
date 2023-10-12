public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    @Override
    public void ligar() {
        System.out.println("Telefone ligado.");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página exibida no navegador.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no navegador.");
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        iphone.ligar();
        iphone.atender();
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
