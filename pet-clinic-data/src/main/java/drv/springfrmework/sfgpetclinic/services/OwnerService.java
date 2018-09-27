package drv.springfrmework.sfgpetclinic.services;

import drv.springfrmework.sfgpetclinic.model.Owner;

import java.util.Set;

/*
* Created by it on 2018-09-21
* */
public interface OwnerService extends  CrudService <Owner,Long> {

    Owner findByLastName(String lastName);


}
