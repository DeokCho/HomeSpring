package com.occamsrazor.web.member;

public interface MemberService {
	public Member[] list();
	public Member[] searchByName(String name);
	public void add(Member member);
	public Member detail(String name);
	public int count(String name);
	public int count();
	public void update(Member member);
	public void delete(Member member);
	public Member login(Member member);
}
