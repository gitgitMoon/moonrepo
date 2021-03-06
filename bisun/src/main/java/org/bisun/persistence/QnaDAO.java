package org.bisun.persistence;

import java.util.List;

import org.bisun.domain.QnaVO;

public interface QnaDAO {
	
	public String getTime();
	
	public List<QnaVO> getList(Integer sno);
	
	public void create(QnaVO vo);
	
	public QnaVO read(Integer qno);
	
	public void update(QnaVO vo);
	
	public void delete(Integer qno);
	

}
