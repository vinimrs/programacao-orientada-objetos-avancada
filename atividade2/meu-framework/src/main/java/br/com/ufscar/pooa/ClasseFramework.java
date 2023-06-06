package br.com.ufscar.pooa;

public abstract class ClasseFramework {

    // Template method operation
    public void imprimir() {
        String nomeDoEngenheiro = this.getNomeParaImprimir();
        System.out.println("O nome do engenheiro é:" + nomeDoEngenheiro);
    }

    protected abstract String getNomeParaImprimir();
}
