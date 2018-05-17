package com.cjw.dao;

import com.cjw.entity.Product;
import com.cjw.untils.HibernateUntils;
import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.query.Query;


import java.util.List;

/**
 * @author codeAC
 * @date 2018/5/15 19:58
 */
public class ProductDaoImpl implements ProductDao {
    @SuppressWarnings("unchecked")
    public List findProductByWord(String word) {
        String hql = "select pname from Product where pname like ? ";

//        HibernateUntils ajaxUntils = new HibernateUntils();
        Session session = HibernateUntils.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery(hql);
        query.setParameter(0,"%"+word+"%" ).setMaxResults(8);

        List<Product> list = query.list();
        transaction.commit();
        session.close();
        return list;

    }

}
