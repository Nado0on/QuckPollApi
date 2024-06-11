package com.apress.repository;
import com.apress.domain.PollOption;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<PollOption, Long> {
}
