public class hello {
    public static void main(String[] args) {
final float preco = 14.99f;
int estoque = 38;
float valortotal = preco * estoque;
char moeda = '$';

System.out.println("Cada item custa " + preco + moeda);
System.out.println("E temos " + estoque + " items no estoque");
System.out.println("O que significa que o estoque inteiro custa " + valortotal + moeda );


} 
}