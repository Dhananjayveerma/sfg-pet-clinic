package drv.springfrmework.sfgpetclinic.bootstrap;

import drv.springfrmework.sfgpetclinic.model.Owner;
import drv.springfrmework.sfgpetclinic.model.Vet;
import drv.springfrmework.sfgpetclinic.services.OwnerService;
import drv.springfrmework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;


   public DataLoader(OwnerService ownerService,VetService vetService){
    this.vetService = vetService;
    this.ownerService = ownerService;

    }

    @Override
    public void run(String... args) {

        Owner owner1 = new Owner();

        owner1.setFirstName("Dhananjay");
        owner1.setLastName("Verma");
        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Djamamak");
        owner2.setLastName("Kumar");
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
