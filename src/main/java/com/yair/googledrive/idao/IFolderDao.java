package com.yair.googledrive.idao;

import com.yair.googledrive.entities.FolderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFolderDao extends CrudRepository<FolderEntity, Long> {
}
