package Dev.Cao.CitiesManager.Services;

import Dev.Cao.CitiesManager.models.vm.Asset;
import org.springframework.web.multipart.MultipartFile;

public interface Is3Service {

    public String putObject(MultipartFile multipartFile);
    public Asset getObject(String key);
    public void deletObject(String key);
    public String getObjectUrl(String key);
}
