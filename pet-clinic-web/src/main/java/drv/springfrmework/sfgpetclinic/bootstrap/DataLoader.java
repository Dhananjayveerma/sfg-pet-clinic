package drv.springfrmework.sfgpetclinic.bootstrap;

import drv.springfrmework.sfgpetclinic.model.Owner;
import drv.springfrmework.sfgpetclinic.model.Vet;
import drv.springfrmework.sfgpetclinic.services.OwnerService;
import drv.springfrmework.sfgpetclinic.services.VetService;
import drv.springfrmework.sfgpetclinic.services.map.OwnerServiceMap;
import drv.springfrmework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;


   public DataLoader(){
       ownerService = new OwnerServiceMap();
       vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Dhananjay");
        owner1.setLastName("Verma");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Djamamak");
        owner2.setLastName("Kumar");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("SME");
        vet1.setId(1L);
        vet1.setLastName("AXE");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("SME");
        vet2.setId(2L);
        vet2.setLastName("AXE");

        vetService.save(vet2);

    }
}
