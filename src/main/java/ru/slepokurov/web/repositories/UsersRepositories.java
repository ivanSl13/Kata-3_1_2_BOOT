package ru.slepokurov.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.slepokurov.web.model.User;

@Repository
public interface UsersRepositories extends JpaRepository<User ,Integer> {
}
