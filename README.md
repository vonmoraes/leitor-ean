# A Implementação de um leitor de código de barra

Data de entrega: 08/04/2019 (primeira parte) e 05/06/2019 (trabalho completo).
### Autores
- Arthur Ladislau.
- Henrique Schiess.
-- Lucas Moraes.
### Descrição

Aborda a implementação de um leitor de código de barras no formato EAN13.

![cod-ean-13](https://lh3.googleusercontent.com/TzHQ0Xz-nB8jugWPbp5WTLy_Z55EW_RGyuqb_jLZD3B_Ab6_owcD9nTKG9Ki2UCdwDbOo5AHp-_j_8l4GXclFizVaWCKWfKVHMOn6uL8K9fFg75w_tGEVSWLtjhMc9j-4BOGImukvrWCYaYXCA)  
  
## Especificações do programa
-   O programa deve ser implementado em C, C++ ou Java.  
-   É permitido o uso de funções elementares de bibliotecas como o OpenCV. Por função elementar entende-se uma função básica de manipulação de imagens, cujo resultado não seja a solução final do problema. Ex: leitura de arquivos, cálculo de histogramas, filtros, cálculo de distâncias, conversão para imagens monocromáticas, cálculo de características, transformadas, funções de decisão.
-   O ambiente deve ser totalmente gráfico.

### Primeira parte:

-   Oferecer um menu com opções para abrir uma imagem em formato JPEG ou PNG, converter para tons de cinza, limiarizar a imagem e ler o código de barras nela contido.
    
-   Abrir a imagem e exibir em tons de cinza.
   
### Segunda parte:

-   Exibir o resultado da limiarização.
    
-   Localizar com um polígono o código na imagem, reproduzi-lo em outra janela com as barras em posição vertical, determinar sua inclinação e identificar o código de barras automaticamente, exibindo seu valor numérico.
    
-   Calcular e exibir na interface o tempo de execução relativo à localização do código na imagem.
    
O código pode estar em qualquer posição, orientação e resolução.

## Documentação

A documentação, em formato ABNT, deve conter:
1.  A descrição do problema e das técnicas implementadas para a solução.
2.  As referências das bibliotecas utilizadas e instruções para instalação, compilação e uso.
3.  As medidas de tempo de execução para diversos exemplos.
4.  Exemplos de erros e acertos do método.
5.  Uma discussão crítica dos resultados.
6.  Referências bibliográficas.
