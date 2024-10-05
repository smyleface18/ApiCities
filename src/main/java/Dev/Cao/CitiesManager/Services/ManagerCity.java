package Dev.Cao.CitiesManager.Services;

import Dev.Cao.CitiesManager.Dto.Status;
import Dev.Cao.CitiesManager.Repository.Irepository;
import Dev.Cao.CitiesManager.models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ManagerCity implements ImanagerCity {


   private final Irepository irepository;

    @Autowired
    public ManagerCity(Irepository repositorieBD) {
        this.irepository = repositorieBD;
    }

    public List<City> getCitys(){
        return irepository.findAll();
    }

    public void addCity(City city){
        irepository.addCity(city);
    }

    public void deletCity(City city){
        irepository.DeletCity(city);
    }

    public Status deleteById(Long id){
        City city = irepository.findById(id);
        if (city != null){
            irepository.DeletCity(city);
            Status status = new Status("good","La ciudad fue eliminada correctamente");
            return status;
        }
        else{
            Status status = new Status("Error","El objeto que queire eliminar no existe");
            return status;
        }
    }

    @Transactional
    public void updateImg(Long id,String url){
        irepository.findById(id).setImg(url);
    }
}
