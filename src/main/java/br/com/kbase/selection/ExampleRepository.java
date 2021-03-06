package br.com.kbase.selection;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExampleRepository extends JpaRepository<Example, Long> {
    List<Example> findAll();
}
