package com.water.Mulbburi.store.m;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.Mulbburi.common.paging.Pagenation;
import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.screen.youtube.YoutubeDTO;

@Service
public class MStoreService {
	
	private final StoreMapper stMapper;
	
	@Autowired
	public MStoreService(StoreMapper stMapper) {
		this.stMapper = stMapper;
	}
	
	/* 조회 */
	public Map<String, Object> selectMyDayuk(int page) {	
		
		/* 1. 전체 게시글 수 확인 (검색어가 있는 경우 포함) => 페이징 처리 계산을 위해서 */
		int totalCount = stMapper.selectTotalCount();
		
		/* 한 페이지에 보여줄 게시물의 수 */
		int limit = 9;
		/* 한 번에 보여질 페이징 버튼의 수 */
		int buttonAmount = 3;
				
		/* 2. 페이징 처리와 연관 된 값을 계산하여 SelectCriteria 타입의 객체에 담는다. */

		SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount);

		/* 3. 요청 페이지와 검색 기준에 맞는 게시글을 조회해온다. */
		List<YoutubeDTO> storeList = stMapper.selectMyDayuk(selectCriteria);
		
		Map<String, Object> stListAndPaging = new HashMap<>();
		stListAndPaging.put("youtubeList", storeList);
		stListAndPaging.put("paging", selectCriteria);
	
		
		return stListAndPaging;

	}

}
