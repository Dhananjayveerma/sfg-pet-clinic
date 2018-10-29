package drv.springfrmework.sfgpetclinic.services.map;

import drv.springfrmework.sfgpetclinic.model.Owner;
import drv.springfrmework.sfgpetclinic.model.Pet;
import drv.springfrmework.sfgpetclinic.services.OwnerService;
import drv.springfrmework.sfgpetclinic.services.PetService;
import drv.springfrmework.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends  AbstractMapService<Owner,Long> implements OwnerService {


    private final PetTypeService petTypeService;
    private final PetService petService;


public OwnerServiceMap(PetTypeService petTypeService, PetService petService){

    this.petTypeService= petTypeService;
    this.petService = petService;
}

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {

   if(object!=null){

       if(object.getPets()!=null){

           object.getPets().forEach(pet -> {
               if(pet.getPetType()!=null){
                    if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                    }else{
                        throw new RuntimeException("Pet Type Is Required ");
                    }
               }
               if(pet.getId() == null){
                    Pet savePet = petService.save(pet);
                    pet.setId(savePet.getId());
               }
           });
       }

       return super.save(object);
   }else{
       return null;
   }

    }

    @Override
    public void delete(Owner object){
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
