public class ContaCorrente{
    private int numeroConta;
    private String nomeBanco;
    private String nomeCliente;
    private float saldo;

    public void cadastrarConta(int nConta, String nBanco, String nCliente){
        numeroConta = nConta;
        nomeBanco = nBanco;
        nomeCliente = nCliente;
    }

    public void depositar(float valor){
        if (valor > 0){
            saldo += valor;
        }
    }

    public boolean sacar(float valor){
        if (saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void atualizarNomeCliente(String nCliente){
        nomeCliente = nCliente;
    }

    public void atualizarBanco(String nBanco){
        nomeBanco = nBanco;
    }

    public void atualizarNumeroConta(int numConta){
        numeroConta = numConta;
    }

    public float obterSaldo(){
        return saldo;
    }

}