package mx.uady.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.uady.model.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Integer> {

}