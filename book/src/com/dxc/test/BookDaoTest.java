package com.dxc.test;
import com.dxc.dao.BookDao;
import com.dxc.dao.impl.BookDaoImpl;
import com.dxc.pojo.Book;
import com.dxc.pojo.Page;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
public class BookDaoTest {
    private BookDao bookDao=new BookDaoImpl();
    @Test
    public void addBook() {
        bookDao.addBook(new Book(null,"国哥为什么这么帅","191125",new BigDecimal(9999),1100000,0,null));
    }
    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(21);
    }
    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(21,"大家都可以这么帅","国哥",new BigDecimal(9999),1100000,0,null));
    }
    @Test
    public void queryBookById() {
        System.out.println(bookDao.queryBookById(21));
    }
    @Test
    public void queryBooks() {
        for (Book queryBook : bookDao.queryBooks()) {
            System.out.println(queryBook);
        }
    }

    @Test
    public void queryForPageTotalCount() {
        System.out.println(bookDao.queryForPageTotalCount());
    }

    @Test
    public void queryForPageTotalCountByPrice() {
        System.out.println(bookDao.queryForPageTotalCountByPrice(10,50));
    }
    @Test
    public void queryForPageItmes() {
        for (Book book : bookDao.queryForPageItmes(8, Page.PAGE_SIZE)) {
            System.out.println(book);
        }
    }

    @Test
    public void queryForPageItmesByPrice() {
        for (Book book : bookDao.queryForPageItmesByPrice(0, Page.PAGE_SIZE,10,50)) {
            System.out.println(book);
        }
    }
}