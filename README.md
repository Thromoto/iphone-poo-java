
# POO - Projeto Java

Foi elaborado em uma ferramenta de UML a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial, Aparelho Telefônico e Navegador na Internet. E em seguida criado as classes e interfaces no formato de arquivos .java

Comportamentos esperados:
* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina


+---------------------------------+
|           iPhone                |
+---------------------------------+
| - reprodutorMusical: ReprodutorMusical |
| - aparelhoTelefonico: AparelhoTelefonico |
| - navegadorInternet: NavegadorInternet |
+---------------------------------+
| + tocar()                      |
| + pausar()                     |
| + selecionarMusica()           |
| + ligar()                      |
| + atender()                    |
| + iniciarCorreioVoz()          |
| + exibirPagina()               |
| + adicionarNovaAba()           |
| + atualizarPagina()            |
+---------------------------------+

+---------------------+        +-----------------------+
|  ReprodutorMusical  |        | AparelhoTelefonico    |
+---------------------+        +-----------------------+
|                     |        |                       |
+---------------------+        +-----------------------+
| + tocar()            |        | + ligar()             |
| + pausar()           |        | + atender()           |
| + selecionarMusica() |        | + iniciarCorreioVoz() |
+---------------------+        +-----------------------+

+---------------------+
| NavegadorInternet    |
+---------------------+
|                     |
+---------------------+
| + exibirPagina()     |
| + adicionarNovaAba() |
| + atualizarPagina()  |
+---------------------+
