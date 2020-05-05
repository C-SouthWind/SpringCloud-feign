package com.chj.service;

import com.chj.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 16:11
 * @params :
 */
@FeignClient("book-provider")
public interface IBookService {
    @GetMapping("/ProBookAll")
    List<Book> selectAll();
}
