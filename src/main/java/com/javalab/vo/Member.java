package com.javalab.vo;

/**
 * 도메인 클래스
 * 생성자 오버로딩 3개 필요
 */
public class Member {

   // 멤버 변수
   private String id;
   private String pwd;
   private String name;
   private String email;
   private String joindate;
   
   public Member() {
      super();
   }
   
   // [추가]
   public Member(String id) {
      super();
      this.id = id;
   }
   // [추가]
   public Member(String id, String pwd) {
      super();
      this.id = id;
      this.pwd = pwd;
   }

   public Member(String id, String pwd, String name, String email) {
	      super();
	      this.id = id;
	      this.pwd = pwd;
	      this.name = name;
	      this.email = email;
	   }
	   
   
   public Member(String id, String pwd, String name, String email, String joindate) {
      super();
      this.id = id;
      this.pwd = pwd;
      this.name = name;
      this.email = email;
      this.joindate = joindate;
   }
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getPwd() {
      return pwd;
   }
   public void setPwd(String pwd) {
      this.pwd = pwd;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public String getJoindate() {
      return joindate;
   }
   public void setJoindate(String joindate) {
      this.joindate = joindate;
   }
   @Override
   public String toString() {
      return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", joindate=" + joindate
            + "]";
   }
}