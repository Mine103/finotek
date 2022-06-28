/*
 * DB연동하는법은 배우지 않았으므로 자바의 Map을 이용하여 구현.
 * DB연동은 8장에서 학습*/
package chap03;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	private static long nextId = 0;
	
	private Map<String, Member> map = new HashMap(); 
	
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	
	public void update(Member member) {
		map.put(member.getEmail(), member);
	}
}
