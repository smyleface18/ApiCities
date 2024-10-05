package Dev.Cao.CitiesManager.Controllers;

import  Dev.Cao.CitiesManager.Dto.Status;

import Dev.Cao.CitiesManager.Services.ImanagerCity;
import Dev.Cao.CitiesManager.Services.S3Service;
import Dev.Cao.CitiesManager.models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin(origins = "http://localhost:4321/")
@RequestMapping("/api/workers")
public class MainController {

    @Autowired
    ImanagerCity managerCity;

    @Autowired
    private S3Service s3Service;

    public MainController() {
    }

    @GetMapping("/Mainstatus")
    public Status Status(){
        return  new Status("good", "la api esta funcionando correctamente");
    }

    @GetMapping("/Citys")
    public List<City> citys(){
        return managerCity.getCitys() ;
    }

    @PostMapping("/addCity")
    public Status citys(@RequestBody City city){
        String name;
        String description;
            managerCity.addCity(city);
             name = "Correcto";
             description ="La ciudad fue agregada correctamente";


        return new Status(description,name);
    }

    @PostMapping("/DeleteCity")
    public Status DeleteCity(@RequestBody City city){
        String name;
        String description;
        managerCity.deletCity(city);
        name = "Correcto";
        description ="La ciudad fue elimininada correctamente";


        return new Status(description,name);
    }

    @PostMapping("/DeleteCityById/{id}")
    public Status deleteCityById(@PathVariable() Long id) {

        return managerCity.deleteById(id);
    }

    @PostMapping("/upload")
    public Map<String,String> upload(@RequestParam MultipartFile file, @RequestParam String id){
        String key = s3Service.putObject(file);

        Map<String,String> result = new HashMap<>();
        result.put("key",key);
        result.put("url", s3Service.getObjectUrl(key));
        result.put("id",String.valueOf(id));

        managerCity.updateImg(Long.valueOf(id), result.get("url"));

        return  result;
    }
}
