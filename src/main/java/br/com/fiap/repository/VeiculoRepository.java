package br.com.fiap.repository;

import br.com.fiap.model.Veiculo;

public class VeiculoRepository extends Repository {

    public VeiculoRepository() {
        super();
    }

    public void salvar(Veiculo v){
        this.manager.getTransaction().begin();
        this.manager.persist(v);
        this.manager.getTransaction().commit();
    }


    public Veiculo findByID(Long id){
        return this.manager.find(Veiculo.class, id);
    }


}
