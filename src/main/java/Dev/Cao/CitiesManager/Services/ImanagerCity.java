package Dev.Cao.CitiesManager.Services;

import Dev.Cao.CitiesManager.Dto.Status;
import Dev.Cao.CitiesManager.models.City;

import java.util.List;

public interface ImanagerCity {

    public List<City> getCitys();
    public void addCity(City city);
    public void deletCity(City city);
    public Status deleteById(Long id);
    public void updateImg(Long id,String url);

}
