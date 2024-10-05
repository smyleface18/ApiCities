package Dev.Cao.CitiesManager.Repository;


import Dev.Cao.CitiesManager.models.City;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class RepositorieBD implements  Irepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<City> findAll(){
        String query = "SELECT c FROM City c";
        return entityManager.createQuery(query).getResultList();
    }

    @Transactional
    public void addCity(City city){
         entityManager.merge(city);
    }

    @Transactional
    public void DeletCity(City city){
        if (entityManager.contains(city)) {
            entityManager.remove(city);
        } else {
            city = entityManager.merge(city);
            entityManager.remove(city);
        }

    }

    @Transactional
    public void DeletCity(Long id){
         entityManager.remove(findById(id));
    }

    @Transactional
    public City findById(Long id){
        return entityManager.find(City.class,id);
    }


}
