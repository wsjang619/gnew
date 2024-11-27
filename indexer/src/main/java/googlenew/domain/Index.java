package googlenew.domain;

import googlenew.IndexerApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Index_table")
@Data
//<<< DDD / Aggregate Root
public class Index {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long fileId;

    @ElementCollection
    private List<String> keywords;

    public static IndexRepository repository() {
        IndexRepository indexRepository = IndexerApplication.applicationContext.getBean(
            IndexRepository.class
        );
        return indexRepository;
    }

    //<<< Clean Arch / Port Method
    public static void makeIndex(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
