package com.yair.googledrive.logic;

import com.yair.googledrive.entities.FolderEntity;
import com.yair.googledrive.idao.IFolderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FolderController {

    @Autowired
    private IFolderDao folderDao;

    public long createFolder(FolderEntity folder) throws Exception {

        if (folder.getName().isEmpty()) {
            throw new Exception("Folder name is empty");
        }
        if (folder.getLocation().isEmpty()) {
            throw new Exception("Folder location is empty");
        }


        folderDao.save(folder);
        return folder.getId();
    }

    public FolderEntity getFolderById(long folderId) {

        FolderEntity folder = (FolderEntity) folderDao.findById(folderId).get();
        return folder;
    }

    public void updateFolder(FolderEntity folder) throws Exception {

        if (folder.getName().isEmpty()) {
            throw new Exception("Folder name is empty");
        }
        if (folder.getLocation().isEmpty()) {
            throw new Exception("Folder location is empty");
        }

        folderDao.save(folder);
    }

    public void deleteFolderById(long folderId) throws Exception {
        if (folderDao.findById(folderId).get() == null) {
            throw new Exception("Folder Id don't found");
        }
        folderDao.deleteById(folderId);
    }
}





