package chans.procrastinationbot.repository;

import chans.procrastinationbot.repository.entinties.UserCredentialsEntity;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserCredentialsRepository  extends CrudRepository<UserCredentialsEntity, UUID>{

    @Query(nativeQuery = true, value = "SELECT EXISTS ( SELECT * from userCredentials where user_unique_id = :userUniqueId)")
    boolean userCredentialsExistById(@Param("targetPersonID") UUID userUniqueId);
}
