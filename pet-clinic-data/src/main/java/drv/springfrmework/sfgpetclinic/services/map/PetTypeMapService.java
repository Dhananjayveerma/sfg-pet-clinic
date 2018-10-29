package drv.springfrmework.sfgpetclinic.services.map;

import drv.springfrmework.sfgpetclinic.model.PetType;
import drv.springfrmework.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {


    @Override
    public void delete(PetType object) {

        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }


}

