package br.com.infabis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infabis.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
