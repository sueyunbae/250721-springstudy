package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import com.sist.dao.*;
import com.sist.service.FoodService;
import com.sist.vo.*;
@Controller
public class FoodController {
    @Autowired
	private FoodService service;
    
    @GetMapping("food/list.do")
    public String food_list(String page,Model model)
    {
    	if(page==null)
 		   page="1";
 	   // 
 	   int curpage=Integer.parseInt(page);
 	   final int ROWSIZE=12;
 	   List<FoodVO> list=service.foodListData((curpage*ROWSIZE)-(ROWSIZE-1), (curpage*ROWSIZE));
    }
    
    @RequestMapping("food/find.do")
    public String food_find(String page,String fd,String column,Model model)
    {
    	if(page==null)
    		page="1";
    	if(fd==null)
    		fd="¸¶Æ÷";
    	if(column==null)
    		column="address";
    	
		int curpage=Integer.parseInt(page);
		System.out.println(column);
		Map map=new HashMap();
		map.put("fd", fd);
		map.put("column", column);
		map.put("start", (curpage*12)-(11));
		map.put("end", curpage*12);
    }
  
}