package com.sda.orders.orders.repository;
import com.sda.orders.orders.model.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users,Integer> {

    @Query("SELECT u FROM users u WHERE u.username = :username")
    public Users getUserByUsername(@Param("username") String username);

}
