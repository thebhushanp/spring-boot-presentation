package the.bhushan.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import the.bhushan.springboot.models.Mobile;

@RepositoryRestResource(collectionResourceRel = "mobiles", path = "mobiles")
interface MobileRepository extends JpaRepository<Mobile, Integer> {

}