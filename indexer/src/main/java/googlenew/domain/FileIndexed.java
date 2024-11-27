package googlenew.domain;

import googlenew.domain.*;
import googlenew.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private List<String> keywords;

    public FileIndexed(Index aggregate) {
        super(aggregate);
    }

    public FileIndexed() {
        super();
    }
}
//>>> DDD / Domain Event
