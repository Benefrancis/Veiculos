package br.com.fiap;

import br.com.fiap.repository.VeiculoRepository;
import br.com.fiap.view.VeiculoView;

public class Main {

    public static void main(String[] args) {

         VeiculoRepository repository = new VeiculoRepository();

//        var veiculo = VeiculoView.form();
//
//        repository.salvar(veiculo);

        var id = VeiculoView.formFindById();

        System.out.println(repository.findByID(id));

    }
}