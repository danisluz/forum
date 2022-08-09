package alura.com.br.forum.repository;

import alura.com.br.forum.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {


    Curso findByNome(String nome);
}
