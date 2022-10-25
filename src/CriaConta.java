public class CriaConta {
    public static void main(String[] args) {
        Cliente jorge = new Cliente();
        jorge.setNome(" Jorge Lago"); 
        jorge.setCpf("334.334.223.99");
        jorge.setProfissao("programador");
        
        Conta contaDoJorge = new Conta();
        contaDoJorge.setAgencia(43334);
        contaDoJorge.setNumero(2222);;
        contaDoJorge.deposita(7000);
        contaDoJorge.setTitular(jorge);
    }
}