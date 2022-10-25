public class CriaConta {
    public static void main(String[] args) {
        Cliente jorge = new Cliente();
        jorge.nome = " Jorge Lago";
        jorge.cpf = "334.334.223.99";
        jorge.profissao = "programador";
        
        Conta contaDoJorge = new Conta();
        contaDoJorge.agencia = 2332;
        contaDoJorge.numero = 422;
        contaDoJorge.saldo = 7000;
        contaDoJorge.titular = jorge;

        System.out.println(contaDoJorge.saldo);
    }
}
