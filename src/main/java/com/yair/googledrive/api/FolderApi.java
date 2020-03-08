package com.yair.googledrive.api;

import com.yair.googledrive.entities.FolderEntity;
import com.yair.googledrive.logic.FolderController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/Folder")
@RestController
public class FolderApi {

    @Autowired
    private FolderController folderController;

    @PostMapping
    public void createFolder(@RequestBody FolderEntity folder) throws Exception {
        folderController.createFolder(folder);
    }

    @GetMapping("/{id}")
    public FolderEntity getFolder(@PathVariable long folderId ){
        return folderController.getFolderById(folderId);
    }

    @PutMapping
    public void updateFolder (@RequestBody FolderEntity folder) throws Exception {
        folderController.updateFolder(folder);
    }
}
