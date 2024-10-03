package br.unip.ads.projeto_sample.repository;

import br.unip.ads.projeto_sample.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, String> {
}
