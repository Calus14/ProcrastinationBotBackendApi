package chans.procrastinationbot.repository.entinties;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "userCredentials")
@Data
public class UserCredentialsEntity {
    @Id
    @Column(name = "user_unique_id", nullable = false, unique = true)
    private UUID userUniqueId;

    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;

    @Column(name = "user_password", nullable = false)
    private String userPassword;
}
