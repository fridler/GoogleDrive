package com.yair.googledrive.logic;

import com.yair.googledrive.entities.DocumentEntity;
import com.yair.googledrive.idao.IDocumentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DocumentController {

    @Autowired
    private IDocumentDao documentDao;

    public long createDocument(DocumentEntity document) throws Exception {


        if (document.getTitle() == null || document.getTitle().isEmpty()) {
            throw new Exception("Title can't be null/empty");
        }
        documentDao.save(document);
        return document.getId();
    }

    public DocumentEntity getDocumentById(long documentId) throws Exception {

        DocumentEntity document = documentDao.findById(documentId).get();
        return document;
    }

    public void updateDocument(DocumentEntity document) throws Exception {

        if (documentDao.findById(document.getId()) == null) {
            throw new Exception("Document Id don't found");
        }
        if (document.getTitle() == null || document.getTitle().isEmpty()) {
            throw new Exception("Title can't be null/empty");
        }

        documentDao.save(document);
    }

    public void deleteDocument(long id) throws Exception {
        documentDao.delete(getDocumentById(id));
    }

    private void validateDocumentInsert(DocumentEntity document, long documentId) throws Exception {
        if (documentDao.findById(documentId).get() == null) {
            throw new Exception("Document Id don't found");
        }
        if (document.getTitle() == null || document.getTitle().isEmpty()) {
            throw new Exception("Title can't be null/empty");
        }

    }


}
