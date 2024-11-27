package googlenew.domain;

import googlenew.domain.*;
import googlenew.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String url;

    public VideoProcessed(Video aggregate) {
        super(aggregate);
    }

    public VideoProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
