package googlenew.domain;

import googlenew.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "indices", path = "indices")
public interface IndexRepository
    extends PagingAndSortingRepository<Index, Long> {}
