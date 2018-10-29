package drv.springfrmework.sfgpetclinic.bootstrap;

import drv.springfrmework.sfgpetclinic.model.Owner;
import drv.springfrmework.sfgpetclinic.model.Pet;
import drv.springfrmework.sfgpetclinic.model.PetType;
import drv.springfrmework.sfgpetclinic.model.Vet;
import drv.springfrmework.sfgpetclinic.services.OwnerService;
import drv.springfrmework.sfgpetclinic.services.PetTypeService;
import drv.springfrmework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


   public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService){
    this.vetService = vetService;
    this.ownerService = ownerService;
    this.petTypeService = petTypeService;
   }

    @Override
    public void run(String... args) {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);


        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();

        owner1.setFirstName("Dhananjay");
        owner1.setLastName("Verma");
        owner1.setAddress("123 munirka");
        owner1.setCity("New Delhi");
        owner1.setTelephone("324972947");

        Pet mikeCat  = new Pet();
        mikeCat.setPetType(saveCatPetType);
        mikeCat.setOwner(owner1);
        mikeCat.setBirthDate(LocalDate.now());
        mikeCat.setName("Rosco");

        owner1.getPets().add(mikeCat);
        ownerService.save(owner1);

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Djamamak");
        owner2.setLastName("Kumar");
        owner2.setAddress("Munirka");
        owner2.setCity("Delhi");
        owner2.setTelephone("676767676");

        Pet mikePet  = new Pet();
        mikePet.setPetType(saveCatPetType);
        mikePet.setOwner(owner2);
        mikePet.setBirthDate(LocalDate.now());
        mikePet.setName("Rosco");

        owner2.getPets().add(mikePet);
        ownerService.save(owner2);

        System.out.print("Owners Is Loaded");

        Vet vet1 = new Vet();
        vet1.setFirstName("SME1");

        vet1.setLastName("AXE1");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("SME3");

        vet2.setLastName("AXE3");

        vetService.save(vet2);
        System.out.print("Vets Is Loaded");
    }
}
