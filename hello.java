public class hello {
    public static void main(String[] args) {

int idade = 18;
boolean cidadao = false;

if(idade >= 18){
    System.out.println("Idade suficiente para votar. ");
    if(cidadao){
        System.out.println("E você é um cidadão, então pode votar!");
    }else{
        System.out.println("Porém você não é um cidadão local.");
    } 

} else {
    System.out.println("Idade insuficiente.");
}


} 
}