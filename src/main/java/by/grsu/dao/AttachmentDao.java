package by.grsu.dao;

import by.grsu.entity.Attachment;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
public interface AttachmentDao {

    void saveAttachment(Attachment attachment);

    List<Attachment> findAllAttachments();

    void deleteAttachmentById(Integer attchid);

    Attachment findById(Integer attchid);

    void updateAttachment(Attachment attachment);

}
