public class carro {
    private String marca ;
    private String modelo;
    private int velocidade;
    
    carro(String marca , String modelo){
        this.marca = marca;
        this.modelo = modelo ;
        velocidade = 0;
    }
    void acelerar(int a ){
        System.out.println("--aceleraçao--");
        velocidade = velocidade + a ;
        if(velocidade >= 200 ){
            velocidade = 200;
}else{
    System.out.println(" A velocidade do carro é :" +velocidade+ "km" );
}
} void frear(int f ){
    System.out.println("--Frear--");
    velocidade = velocidade - f ;
    if(velocidade <= 0){
        System.out.println("Voce freiou forte de mais. A velocidade atual é 0 km ");
        velocidade = 0;
    }else{
        System.out.println("A velocidade atual do carro é : " + velocidade+ "km" );

        
    }
}
@Override
public String toString() {
    return "carro [marca=" + marca + ", modelo=" + modelo + ", velocidade=" + velocidade + "]";
}
public void printStatus(){
    System.out.println(toString());
}

}