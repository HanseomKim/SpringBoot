package com.spring.springboot;

import com.spring.springboot.domain.Goods;
import com.spring.springboot.exception.GoodsNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  //  @RequestMapping(method= RequestMethod.GET, path="/hello/{name}")
  @GetMapping(path = "/hello/{name}") // endpoint
  public String hello(@PathVariable String name) {
    return String.format("Hello, %s", name);
  }

  @GetMapping(path = "/goods/{goodsCode}") // endpoint
  public Goods hello(@PathVariable int goodsCode) throws Exception {

    if (goodsCode == 1) {
      Goods goods = new Goods(goodsCode, "1번 상품입니다.");
      return goods;
    } else if (goodsCode == 10000) {
      throw new GoodsNotFoundException("GoodsNotFoundException");
    } else {
      throw new Exception("NotFoundGoods");
    }
  }
}