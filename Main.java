public class Main {
    static void minhafuncao(String name, int age) {
System.out.println(name + " tem " + age + " anos");
if(age >= 18){
    System.out.println("° " + name + " Tem idade o suficiente!");
} else {
    System.out.println("° " + name + " Não tem idade o suficiente! ");
}


}

public static void main(String[] args){
minhafuncao("Renato", 23);
minhafuncao("Jean", 19);
minhafuncao("Bruna", 17);

}


}

