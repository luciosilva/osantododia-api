package br.com.lambadadigital.osantosodia.api.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.lambadadigital.osantosodia.api.entities.Saint;

public interface SaintRepository extends JpaRepository<Saint, Long> {
	
	@Transactional(readOnly = true)
	Optional<Saint> findById(Long id);

	@Transactional(readOnly = true)
	List<Saint> findByBirthday(Date date); 
	
}
