package pl.asc.edu.plannig.app.note;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppNoteRepository extends JpaRepository<AppNote, Long> {
}
