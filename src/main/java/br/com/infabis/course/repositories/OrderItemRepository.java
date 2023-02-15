package br.com.infabis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infabis.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
