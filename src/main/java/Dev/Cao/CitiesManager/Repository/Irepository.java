package Dev.Cao.CitiesManager.Repository;

import Dev.Cao.CitiesManager.models.City;

import java.util.List;

public interface Irepository {

    public List<City> findAll();
    public void addCity(City city);
    public void DeletCity(City city);
    public void DeletCity(Long id);
    public City findById(Long id);
}
