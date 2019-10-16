package chans.procrastinationbot.repository.entinties;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "userInfo")
@Data
public class UserUsageEntity implements Serializable {
    @Id
    private UUID userUniqueId;

    @Column(name = "main_process_name", nullable = false)
    private String mainProcessName;

    @Column(name = "start_process_time", nullable = false)
    private long startProcessTime;
}
