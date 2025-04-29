package kr.kh.shoppingmall.dao;

import java.util.List;

import kr.kh.shoppingmall.model.vo.CategoryVO;

public interface ProductDAO {

	List<CategoryVO> selectCategoryList();

	CategoryVO selectCategoryByName(String ca_name);

	void insertCategory(CategoryVO category);
	
}
