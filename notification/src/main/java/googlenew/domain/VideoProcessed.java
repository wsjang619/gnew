package googlenew.domain;

import googlenew.domain.*;
import googlenew.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String url;
}
