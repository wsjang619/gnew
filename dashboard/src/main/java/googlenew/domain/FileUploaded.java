package googlenew.domain;

import googlenew.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date createdTime;
    private String type;
    private String userId;
}
