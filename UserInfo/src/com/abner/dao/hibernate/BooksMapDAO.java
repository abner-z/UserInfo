package com.abner.dao.hibernate;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.abner.dao.iface.BooksDAO;
import com.abner.modle.Books;

public class BooksMapDAO extends HibernateDaoSupport implements BooksDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Books> getAll() {
		// TODO Auto-generated method stub
		String sql = "from books order by bookName";
		return (List<Books>) this.getHibernateTemplate().find(sql);
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public List<Books> getBooks(int pageSize, int startRow) {
		final int _pageSize = pageSize;
		final int _startRow = startRow;
		return (List<Books>) this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Books doInHibernate(Session session) {
				Query query = session.createQuery("from books order by bookName");
				query.setFirstResult(_startRow);
				query.setMaxResults(_pageSize);
				return (Books) query.list();
			}
		});
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public List<Books> getBooks(String fieldName, String value, int pageSize, int startRow) {
		// TODO Auto-generated method stub
		final String _fieldName = fieldName;
		final String _value = value;
		final int _pageSize = pageSize;
		final int _startRow = startRow;
		String sql = "";
		if (_fieldName == null || _fieldName.equals("") || _value == null || _value.equals("")) {
			sql = "from books order by bookName";
		}else {
			sql = "from books where "+fieldName +" like "+ _value+" order by bookName";
		}
		final String _sql = sql;
		return (List<Books>)getHibernateTemplate().executeFind(new HibernateCallback() {
			@Override
			public Books doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery(_sql);
				query.setFirstResult(_startRow);
				query.setMaxResults(_pageSize);
				return (Books) query.list();
			}
		});

	}

	@Override
	public Books getBooks(String bookId) {
		// TODO Auto-generated method stub
		return (Books) getHibernateTemplate().get(Books.class, bookId);
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		String sql = "from books order by bookName";
		@SuppressWarnings("unchecked")
		List<Books> list = (List<Books>) this.getHibernateTemplate().find(sql);
		return list.size();
	}

	@Override
	public int getRows(String fieldName, String value) {
		// TODO Auto-generated method stub
		String sql = null;
		if (fieldName == null || fieldName.equals("") || value == null || value.equals("")) {
			sql = "from books order by bookName";
		} else {
			sql = "from books where " + fieldName + " like " + value + " order by userName";
		}
		@SuppressWarnings("unchecked")
		List<Books> list = (List<Books>) this.getHibernateTemplate().find(sql);
		return list.size();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Books> queryBooks(String fieldNmae, String value) {
		// TODO Auto-generated method stub
		String sql = "from books " + fieldNmae + " like " + value + " order by bookName";
		return (List<Books>) this.getHibernateTemplate().find(sql);
	}

	@Override
	public String getMaxId() {
		// TODO Auto-generated method stub
		String maxId = null;
		String sql = "select MAX(bookId) from books";
		@SuppressWarnings("unchecked")
		List<Books> list = (List<Books>) this.getHibernateTemplate().find(sql);
		Iterator<Books> iterator = list.iterator();
		if (iterator.hasNext()) {
			Object object = iterator.next();
			if (object == null) {
				maxId = "1";
			} else {
				maxId = object.toString();
			}
		}

		if (maxId.length() == 1) {
			maxId = "000" + maxId;
		} else if (maxId.length() == 2) {
			maxId = "00" + maxId;
		} else if (maxId.length() == 3) {
			maxId = "0" + maxId;
		}
		return maxId;
	}

	@Override
	public void addBook(Books books) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(books);
	}

	@Override
	public void deleteBook(Books books) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(books);
	}

	@Override
	public void updateBook(Books books) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(books);
	}

}
