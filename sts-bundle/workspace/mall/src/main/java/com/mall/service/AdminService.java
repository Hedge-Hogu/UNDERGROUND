package com.mall.service;

import java.util.List;

import com.mall.domain.CategoryVO;
import com.mall.domain.GoodsVO;
import com.mall.domain.GoodsViewVO;

public interface AdminService {

	// 카테고리
	public List<CategoryVO> category() throws Exception;

	// 상품등록
	public void register(GoodsVO vo) throws Exception;

	// 상품목록
	public List<GoodsVO> goodsList() throws Exception;

	// 상품조회
	public GoodsViewVO goodsView(int gdsNum) throws Exception;
}
