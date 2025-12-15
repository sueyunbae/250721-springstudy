package com.sist.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sist.mapper.FoodMapper;
import com.sist.mapper.RecipeMapper;
import com.sist.vo.FoodVO;
import com.sist.vo.RecipeVO;

public class RecipeDAO {
	private RecipeMapper mapper;
	/*@Select("SELECT fno,name,poster,num "
			+ "FROM (SELECT fno,name,poster,rownum as num "
			+ "FROM (SELECT fno,name,poster "
			+ "FROM menupan_food ORDER BY no DESC)) "
			+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<FoodVO> foodListData(@Param("start") int start,@Param("end") int end);
	
	@Select("SELECT CEIL(COUNT(*)/12.0) FROM recipe")
	public int foodTotalPage();
	*/
	public List<RecipeVO> recipeListData(int start,int end)
	{
		return mapper.recipeListData(start, end);
	}
	public int recipeTotalPage()
	{
		return mapper.recipeTotalPage();
	}
}
