package com.yair.googledrive.idao;

import com.yair.googledrive.entities.DocumentEntity;
import org.springframework.data.repository.CrudRepository;

public interface IDocumentDao extends CrudRepository<DocumentEntity, Long> {
}
