package googlenew.domain;

import googlenew.domain.*;
import googlenew.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date createdTime;
    private String type;
    private String userId;

    public FileUploaded(File aggregate) {
        super(aggregate);
    }

    public FileUploaded() {
        super();
    }
}
//>>> DDD / Domain Event
