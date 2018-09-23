package drv.springfrmework.sfgpetclinic.services;

import drv.springfrmework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet  save(Vet  vet);
    Set<Vet> findAll();
}
