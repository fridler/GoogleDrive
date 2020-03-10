package com.yair.googledrive.idao;

import com.yair.googledrive.entities.DocumentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocumentDao extends CrudRepository<DocumentEntity, Long> {
}
