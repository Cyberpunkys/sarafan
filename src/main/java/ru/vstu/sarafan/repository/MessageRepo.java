package ru.vstu.sarafan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vstu.sarafan.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {


}
