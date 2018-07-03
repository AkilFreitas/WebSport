/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensagem;

import java.util.ResourceBundle;

/*
https://docs.oracle.com/cd/E12839_01/web.1111/e13745/bundles.htm#CNSLX144
A Oracle recomenda que você defina todas as cadeias de texto que sua extensão do Console de Administração
exibe em um pacote de mensagens. Um pacote de mensagens é uma coleção de arquivos de texto 
(arquivos de propriedades) que contêm pares de valores de chave (propriedades). 
Você cria um arquivo de propriedades para cada idioma ou localidade que deseja suportar. 
Se você nomear o arquivo de propriedades de acordo com um conjunto de convenções de nomenclatura de arquivos,
o Administration Console exibirá sequências de caracteres do arquivo de propriedades cujo
código de idioma corresponde à configuração de código do idioma do navegador da Web.

http://demoiselle.sourceforge.net/docs/framework/reference/2.2.1/html/bundle.html
Um dos requisitos para se construir uma aplicação nos dias de hoje, é o de que seja utilizada por pessoas
em vários lugares no mundo e em diferentes línguas. Portanto, é preciso que as aplicações sejam facilmente 
internacionalizáveis. Para isso, existe um recurso no java chamado de Resource Bundle, que nada mais é do 
que um esquema de arquivos properties, onde cada arquivo representa uma língua e cada um desses arquivos 
possui um conjunto de chaves e valores, sendo que os valores são os textos que serão exibidos na aplicação
e estão na língua correspondente à língua que o arquivo representa.

O arquivo properties que será utilizado para montar a aplicação é escolhido pelo próprio usuário, seja através
da língua definida no browser ou no próprio sistema operacional. Caso o usuário escolha uma língua que não 
está disponível na aplicação, uma língua default será utilizada. Por exemplo: vamos imaginar que em uma 
aplicação existem dois arquivos properties, um em português e outro em inglês, e que o arquivo default é o
inglês. Vamos imaginar também que a aplicação é Web, portanto a língua escolhida está definida no próprio
browser. Caso esteja configurado no browser do usuário a língua alemã e como não existe nenhum arquivo de
properties para alemão, a aplicação será exibida na língua inglesa, que é a língua configurada como default.

Todos os arquivos são criados praticamente com o mesmo nome. O que diferencia um arquivo do outro é o acréscimo
da sigla que representa a língua daquele arquivo. O arquivo que representa a língua default não tem essa sigla
ao fim do nome. Seguindo o exemplo citado acima e imaginando que o nome dos nossos arquivos é messages,
ficaria da seguinte forma: messages.properties seria o arquivo default que representaria a língua inglesa e
messages_pt.properties seria o arquivo da língua portuguesa. Veja abaixo um exemplo com esses dois arquivos.
 */
/**
 *
 * @author mayco
 */
public class Mensagem {

    private final static ResourceBundle BUNDLE_MESSAGES = ResourceBundle.getBundle("messageResource");

    public static String getMessageFromBundle(String key) {
        return BUNDLE_MESSAGES.getString(key);
    }

}
