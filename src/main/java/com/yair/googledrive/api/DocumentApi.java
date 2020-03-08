package com.yair.googledrive.api;

import com.yair.googledrive.entities.DocumentEntity;
import com.yair.googledrive.logic.DocumentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/Document")
@RestController
public class DocumentApi {

    @Autowired
    private DocumentController documentController;

    // http://localhost:8080/Document
    /*
{
   "title":"abc",
   "textContent":"asfaf  adfadfadf a f afasf",
}
     */
    @PostMapping
    public void createDocument(@RequestBody DocumentEntity document) throws Exception {
        documentController.createDocument(document);
    }

    // http://localhost:8080/Document/3
    @GetMapping("/{id}")
    public DocumentEntity getDocumentById(@PathVariable long id) throws Exception {
        return documentController.getDocumentById(id);
    }

    // http://localhost:8080/Document/2
    @DeleteMapping("/{id}")
    public void deleteDocument(@PathVariable long id) throws Exception {
        documentController.deleteDocument(id);
    }

    // http://localhost:8080/Document/
    /*
{
   "id":6,
   "title":"abc",
   "textContent":"asfaf  adfadfadf a f afasf"
}
    */
    @PutMapping
    public void updateDocument(@RequestBody DocumentEntity document) throws Exception {

        documentController.updateDocument(document);

    }



}
