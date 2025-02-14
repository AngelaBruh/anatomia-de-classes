package edu.bruna.anatomiaClasses;

public class MinhaClasse {
//Toda classe precisa existir dentro da pasta src
//Em nomes compostos cada palavra sua inicial tende ser maiucusla
//Toda variavel deve ser escrita em letra minuscula, porém ser for composta a letra inicial da segunda palavra deve ser maiuscula
//Nenhuma nomenclatura deve começar com numero
//Pode usar underline para separação de palavras nas nomenclaturas
//Metodo:   TipoRetorno NomeObjetivoNoInfinitivo Parametro (s)

    public static void main(String[] args) {
    
        //System.out.println("Hello Word!");
        //final String BR = "Brasil"; //Quando o valor de uma variavel não pode sofrer nenhum tipo de alteração
        //System.out.println(BR);

        String primeiroNome = "Bruna";
        String segundoNome = "Angela";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }


    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome); //Uma forma de concatenar ou "juntar", pode usar o sinal de +
    }

}
