package chans.procrastinationbot.repository;

import chans.procrastinationbot.repository.entinties.UserUsageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserUsageRepository extends CrudRepository<UserUsageEntity, UUID> {
}
