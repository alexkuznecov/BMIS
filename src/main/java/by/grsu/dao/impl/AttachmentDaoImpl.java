package by.grsu.dao.impl;

import by.grsu.dao.AbstractDao;
import by.grsu.dao.AttachmentDao;
import by.grsu.entity.Attachment;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alek on 23.2.17.
 */
@Repository("attachmentDao")
public class AttachmentDaoImpl extends AbstractDao implements AttachmentDao {

    @Override
    public void saveAttachment(Attachment attachment) {
        persist(attachment);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Attachment> findAllAttachments() {
        Criteria criteria = getSession().createCriteria(Attachment.class);
        return (List<Attachment>) criteria.list();
    }

    @Override
    public void deleteAttachmentById(Integer attchid) {
        Query query = getSession().createSQLQuery("delete from Attachment where attchid = :attchid");
        query.setInteger("attchid", attchid);
        query.executeUpdate();
    }

    @Override
    public Attachment findById(Integer attchid) {
        Criteria criteria = getSession().createCriteria(Attachment.class);
        criteria.add(Restrictions.eq("attchid",attchid));
        return (Attachment) criteria.uniqueResult();
    }

    @Override
    public void updateAttachment(Attachment attachment) {
        getSession().update(attachment);
    }
}
