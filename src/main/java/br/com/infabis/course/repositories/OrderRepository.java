package br.com.infabis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infabis.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
