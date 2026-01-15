public class Main{
    static int Preco(int preço , int desconto){
return preço + desconto;
    }

    static float Preco( float preço, float desconto){
        return preço - desconto;
    }


public static void main(String[] args) {
    int estoquetotal = Preco(100, 20);
    float preçodesconto = Preco(99.99f, 19.99f);
System.out.println("eNós temos no total " + estoquetotal + " peças no estoque, embora ainda temos de receber algumas");
System.out.println("O preço do item com desconto é " + preçodesconto);
}


}