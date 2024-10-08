package talentFour.tutor.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TutorClassSell {
	
	private String startDate;
	private String memberNickname;
	private String boardTitle;
	private String paymentStatus;
	

}
