package kr.or.human.emp.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@Data
public class MemberDTO {
	
	private String userID;
	private String userPW;
	private String userName;
	
	public MemberDTO(String userID, String userPW, String userName) {
		super();
		this.userID = userID;
		this.userPW = userPW;
		this.userName = userName;
	}
	

}
