package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.AttachmentDao;
import by.grsu.entity.Attachment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("attachmentDao")
public class AttachmentDaoImpl extends AbstractDao implements AttachmentDao {

    @Override
    public void saveAttachment(Attachment attachment) {

    }

    @Override
    public List<Attachment> findAllAttachments() {
        return null;
    }

    @Override
    public void deleteAttachmentById(Integer attchid) {

    }

    @Override
    public Attachment findById(Integer attchid) {
        return null;
    }

    @Override
    public void updateAttachment(Attachment attachment) {

    }
}
