public class Principal {
    public static void main(String args[]){
        Conta minhaConta=new Conta();
        minhaConta.titular="Vivian";
        minhaConta.numero=1236;

        System.out.println("O saldo atual é: "+minhaConta.saldo);
        System.out.println("O saldo atual é: "+minhaConta.titular);
        System.out.println("O saldo atual é: "+minhaConta.numero);

        minhaConta.saca(600);
        System.out.println("O seu novo saldo é: "+minhaConta.saldo);
    }

}
